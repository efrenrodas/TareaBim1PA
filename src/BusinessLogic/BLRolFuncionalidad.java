
package BusinessLogic;

import Clases.RolFuncionalidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class BLRolFuncionalidad {
    DataAccessLogic.DATRolFuncionalidad objRolFuncionalidad = new DataAccessLogic.DATRolFuncionalidad();      
    public boolean RegistrarRolFuncionalidad(int rolId, int funId) {
        boolean retorno = false;
        if (ComprobarExistencia(rolId, funId)==0){
            retorno = objRolFuncionalidad.RegistrarRolFuncionalidad(rolId, funId);
        }
        return retorno;
    }
    
    public ArrayList<RolFuncionalidad> BuscarRolFuncionalidad () throws SQLException {
        ResultSet rs;
        ArrayList<RolFuncionalidad> lstRolFunc = new ArrayList<>();
        try{
            rs = objRolFuncionalidad.BuscarRolFuncionalidad();
            while(rs.next()) {
                RolFuncionalidad rf = new RolFuncionalidad();
                rf.setIdRol(Integer.parseInt(rs.getString("rolId")));
                rf.setIdFuncionalidad(Integer.parseInt(rs.getString("funId")));
                rf.setRolNombre(rs.getString("rolNombre"));
                rf.setFunNombre(rs.getString("funNombre"));
                lstRolFunc.add(rf);
            }
        }
        catch(Exception ex){
            String msn = ex.getMessage();
        }
        return lstRolFunc;
    }
     
    public ArrayList<RolFuncionalidad> BuscarPorRol (int intIdRol) throws SQLException {
        ResultSet rs;
        ArrayList<RolFuncionalidad> lstRolFunc = new ArrayList<>();
        try{
            rs = objRolFuncionalidad.BuscarPorRol(intIdRol);
            while(rs.next()) {
                RolFuncionalidad rf = new RolFuncionalidad();
                rf.setIdRol(Integer.parseInt(rs.getString("rolId")));
                rf.setIdFuncionalidad(Integer.parseInt(rs.getString("funId")));
                rf.setRolNombre(rs.getString("rolNombre"));
                rf.setFunNombre(rs.getString("funNombre"));
                lstRolFunc.add(rf);
            }
        }
        catch(Exception ex){
            String msn = ex.getMessage();
        }
        return lstRolFunc;
    }
    
    public int ComprobarExistencia(int intIdRol, int intFunId){
        return objRolFuncionalidad.ComprobarExistencia(intIdRol, intFunId);
    }
    
    public boolean DesasignarRolFuncionalidad (int intIdRol, int intFunId) {
        return objRolFuncionalidad.DesasignarRolFuncionalidad(intIdRol, intFunId);
    }
    
}
