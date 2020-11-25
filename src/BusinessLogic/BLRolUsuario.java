package BusinessLogic;

import Clases.RolUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class BLRolUsuario {
    DataAccessLogic.DATRolUsuario objRolUsuario = new DataAccessLogic.DATRolUsuario();  
    public boolean RegistrarRolUsuario(int rolId, int usId) {
        boolean retorno = false;
        if (ComprobarExistencia(rolId, usId)==0){
            retorno = objRolUsuario.RegistrarRolUsuario(rolId, usId);
        }
        return retorno;
    }
    public ArrayList<RolUsuario> BuscarRolUsuario () throws SQLException {
        ResultSet rs;
        ArrayList<RolUsuario> lstRolUsuario = new ArrayList<>();
        rs = objRolUsuario.BuscarRolUsuario();
        while(rs.next()) {
            RolUsuario ru = new RolUsuario();
            ru.setIdRol(Integer.parseInt(rs.getString("rolId")));
            ru.setIdUsuario(Integer.parseInt(rs.getString("usId")));
            ru.setRolNombre(rs.getString("rolNombre"));
            ru.setUsNombres(rs.getString("usNombres"));
            lstRolUsuario.add(ru);
        }
        return lstRolUsuario;
    }
    
    public int ComprobarExistencia(int intIdRol, int intIdUs){
        return objRolUsuario.ComprobarExistencia(intIdRol, intIdUs);
    }
    
    public boolean DesasignarRolUsuario (int intIdRol, int intIdUs) {
         return objRolUsuario.DesasignarRolUsuario(intIdRol, intIdUs);
     }
}
