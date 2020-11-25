package BusinessLogic;

import Clases.ModFuncionalidad;
import Clases.RolUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daguaman ModFuncionalidad
 */
public class BLModFuncionalidad {
    DataAccessLogic.DATModFuncionalidad objModFuncion = new DataAccessLogic.DATModFuncionalidad();  
    public boolean RegistrarModFuncionalidad(int modId, int funId) {
        boolean retorno = false;
        if (ComprobarExistencia(modId, funId)==0){
            retorno = objModFuncion.RegistrarModFuncionalidad(modId, funId);//cambiar metodo 
       System.out.println("Correcto datos existen");
        }
        else
        {
            System.out.println("Error BL datos no existen");
        }
        return retorno;
    }
    public ArrayList<ModFuncionalidad> BuscarModFuncion() throws SQLException {
        ResultSet rs;
        ArrayList<ModFuncionalidad> lstmodfuncionalidad = new ArrayList<>();
        rs = objModFuncion.BuscarModFuncion();
        while(rs.next()) {
//            RolUsuario ru = new RolUsuario();
//            ru.setIdRol(Integer.parseInt(rs.getString("rolId")));
//            ru.setIdUsuario(Integer.parseInt(rs.getString("usId")));
//            ru.setRolNombre(rs.getString("rolNombre"));
//            ru.setUsNombres(rs.getString("usNombres"));}
               ModFuncionalidad mf = new ModFuncionalidad();
               mf.setIdModulo(Integer.parseInt(rs.getString("idModulo")));
               mf.setIdFuncionalidad(Integer.parseInt(rs.getString("idFuncionalidad")));
               mf.setFunNombre(rs.getString("funNombre"));//FALTA AGREGAR LOS RESULTADOS QUE REGRESA LA DB
               mf.setModNombre(rs.getString("modNombre"));
               lstmodfuncionalidad.add(mf);
        }
        return lstmodfuncionalidad;
    }
    
     public ArrayList<ModFuncionalidad> BuscarModFuncionID(int idFuncionMod) throws SQLException {
        ResultSet rs;
        ArrayList<ModFuncionalidad> lstmodfuncionalidad = new ArrayList<>();
        rs = objModFuncion.BuscarModFuncionId(idFuncionMod);
        while(rs.next()) {
//            RolUsuario ru = new RolUsuario();
//            ru.setIdRol(Integer.parseInt(rs.getString("rolId")));
//            ru.setIdUsuario(Integer.parseInt(rs.getString("usId")));
//            ru.setRolNombre(rs.getString("rolNombre"));
//            ru.setUsNombres(rs.getString("usNombres"));}
               ModFuncionalidad mf = new ModFuncionalidad();
               mf.setIdModulo(Integer.parseInt(rs.getString("idModulo")));
               mf.setIdFuncionalidad(Integer.parseInt(rs.getString("idFuncionalidad")));
               mf.setFunNombre(rs.getString("funNombre"));//FALTA AGREGAR LOS RESULTADOS QUE REGRESA LA DB
               mf.setModNombre(rs.getString("modNombre"));//esto agregamos al subMenú
               lstmodfuncionalidad.add(mf);
        }
        return lstmodfuncionalidad;
    }
    
    
    public int ComprobarExistencia(int intIdMod, int intIdFun){
        return objModFuncion.ComprobarExistencia(intIdMod, intIdFun);
    }
    
    public boolean DesasignarModFuncion (int intIdmod, int intIdfun) {
         return objModFuncion.DesasignarModFuncion(intIdmod, intIdfun);
     }
}
