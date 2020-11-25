package DataAccessLogic;
import Clases.ItemCatalogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DATItemCatalogo extends Conexion{
public boolean Registrar(int intCatId, ItemCatalogo icat) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO itemcatalogo (itcCodigo, itcNombre, itcDescripcion, idCatalogo) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, icat.getItcCodigo());
            ps.setString(2, icat.getItcNombre());
            ps.setString(3, icat.getItcDescripcion());
            ps.setInt(4, intCatId);
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                retorno = false;
            }
        }
        return retorno;
    }
    /*Método para Modificar un objeto de la clase Usuario, llega como parámetro pro que es de tipo Usuario.
    La actualización siempre se hace sobre un condicional que re ubica como parte del Where*/
    public boolean Modificar (ItemCatalogo icat) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "UPDATE itemcatalogo SET itcCodigo=?, itcNombre=?, itcDescripcion=?, idCatalogo=? "
                + " WHERE iditemCatalogo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, icat.getItcCodigo());
            ps.setString(2, icat.getItcNombre());
            ps.setString(3, icat.getItcDescripcion());
            ps.setInt(4, icat.getIdCatalogo());
            ps.setInt(5, icat.getIdItemCatalogo());
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            System.err.println(e);
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                retorno = false;
            }
        }
        return retorno;
    }
    /*Método para eliminar un objeto de tipo Usuario*/
    public boolean Eliminar (int intiditemCatalogo) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM itemcatalogo WHERE iditemCatalogo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intiditemCatalogo);
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                retorno = false;
            }
        }
        return retorno;
    }
    /*Método para buscar un Usuario en base a un criterio de búsqueda*/
    public ResultSet Buscar (String stritcNombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM itemcatalogo WHERE itcNombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, stritcNombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar un Usuario en base a un criterio de búsqueda*/
    public ResultSet BuscarItemPorCriterio (String CatNombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM catalogo cat, itemcatalogo itc\n" +
                     "where 1 = 1\n" +
                     "and cat.idcatalogo = itc.idCatalogo\n" +
                     "and cat.catNombre = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, CatNombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar todos los Usuarios registrados en la BDD*/
    public ResultSet BuscarTodos () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM itemcatalogo";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar todos los Items de un Catalogo registrados en la BDD*/
    public ResultSet ConsultarItemsCatalogo (int intIdCat) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM catalogo cat, itemcatalogo itc\n" +
                     "where 1 = 1\n" +
                     "and cat.idcatalogo = itc.idCatalogo\n" +
                     "and cat.idcatalogo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intIdCat);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    public int ContarItemsCatalogo (int intIdCat) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int numberOfRows =0;
        String sql = "SELECT count(*) FROM catalogo cat, itemcatalogo itc\n" +
                     "where 1 = 1\n" +
                     "and cat.idcatalogo = itc.idCatalogo\n" +
                     "and cat.idcatalogo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intIdCat);
            rs = ps.executeQuery();
            if (rs.next()) 
                numberOfRows = rs.getInt(1);
        } catch (Exception e) {
            e.getMessage();
        }
    return numberOfRows;
    }
    
}
