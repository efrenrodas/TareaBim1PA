package BusinessLogic;

import Clases.Catalogo;
import Clases.ItemCatalogo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLCatalogos {
    DataAccessLogic.DATCatalogo objCatalogo = new DataAccessLogic.DATCatalogo();  
    DataAccessLogic.DATItemCatalogo objItemCatalogo = new DataAccessLogic.DATItemCatalogo();  
    
    public boolean RegistrarCatalogo(Catalogo cat) {
        return objCatalogo.Registrar(cat);
    }
    
    public boolean RegistrarItemCatalogo(int intCatId, ItemCatalogo objItem ) {
        return objItemCatalogo.Registrar(intCatId, objItem);
    }
    
     public boolean ModificarCatalogo (Catalogo cat) {
        return objCatalogo.Modificar(cat);
     }
     
     public boolean EliminarCatalogo (int intidUsuario) {
         return objCatalogo.Eliminar(intidUsuario);
     }  
     
     public ArrayList<Catalogo> Buscar (String strcatCod) throws SQLException {
        ResultSet rs;
        ArrayList<Catalogo> lstCatalogos = new ArrayList<>();
        if (strcatCod!="-1")
            //Buscar por criterio
            rs = objCatalogo.Buscar(strcatCod);
        else
            //Buscar todos los usuarios registrados en la BDD
            rs = objCatalogo.BuscarTodos();
        while(rs.next()) {
            Catalogo cat = new Catalogo();
            cat.setIdCatalogo(Integer.parseInt(rs.getString("idCatalogo")));
            cat.setCatCodigo(rs.getString("catCodigo"));
            cat.setCatNombre(rs.getString("catNombre"));
            cat.setCatDescripcion(rs.getString("catDescripcion"));
            cat.setCatEstado(Integer.parseInt(rs.getString("catEstado")));
            lstCatalogos.add(cat);
        }
        return lstCatalogos;
     }
     
     public ArrayList<ItemCatalogo> BuscarItemCatalogo (int intIdCat) throws SQLException {
        ResultSet rs;
        ArrayList<ItemCatalogo> lstItemCatalogos = new ArrayList<>();
        rs = objItemCatalogo.ConsultarItemsCatalogo(intIdCat);
        while(rs.next()) {
            ItemCatalogo icat = new ItemCatalogo();
            icat.setIdItemCatalogo(Integer.parseInt(rs.getString("idItemCatalogo")));
            icat.setItcCodigo(rs.getString("itcCodigo"));
            icat.setItcNombre(rs.getString("itcNombre"));
            icat.setItcDescripcion(rs.getString("itcDescripcion"));
            icat.setIdCatalogo(Integer.parseInt(rs.getString("idCatalogo")));
            lstItemCatalogos.add(icat);
        }
        return lstItemCatalogos;
     }
     
     public ArrayList<ItemCatalogo> BuscarItemporCatNombre (String CatNombre) throws SQLException {
        ResultSet rs;
        ArrayList<ItemCatalogo> lstItemCatalogos = new ArrayList<>();
        rs = objItemCatalogo.BuscarItemPorCriterio(CatNombre);
        while(rs.next()) {
            ItemCatalogo icat = new ItemCatalogo();
            icat.setIdItemCatalogo(Integer.parseInt(rs.getString("idItemCatalogo")));
            icat.setItcCodigo(rs.getString("itcCodigo"));
            icat.setItcNombre(rs.getString("itcNombre"));
            icat.setItcDescripcion(rs.getString("itcDescripcion"));
            icat.setIdCatalogo(Integer.parseInt(rs.getString("idCatalogo")));
            lstItemCatalogos.add(icat);
        }
        return lstItemCatalogos;
     }
     
     public int ContarItemCatalogo(int intIdCat){
        return objItemCatalogo.ContarItemsCatalogo(intIdCat);
     }
     public boolean EliminarItemCatalogo (int idItemCatalogo) {
         return objItemCatalogo.Eliminar(idItemCatalogo);
     }  
}
