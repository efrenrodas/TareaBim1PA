package DataAccessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daguaman
 */
public class DATRolFuncionalidad extends Conexion{
    public boolean RegistrarRolFuncionalidad(int rolId, int funId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO rolfuncionalidad (rolId, funId) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, rolId);
            ps.setInt(2, funId);
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
    
    public ResultSet BuscarRolFuncionalidad () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT rolId, funId, rolNombre, funNombre FROM rolfuncionalidad rf, rol, funcionalidad func"
                + " where 1 = 1 "
                + " and rf.rolId = rol.idrol "
                + " and rf.funId = func.idfuncionalidad";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
     public ResultSet BuscarPorRol (int intRol) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT rolId, funId, rolNombre, funNombre FROM rolfuncionalidad rf, rol, funcionalidad func"
                + " where 1 = 1 "
                + " and rf.rolId = rol.idrol "
                + " and rf.funId = func.idfuncionalidad"
                + " and rolId=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, intRol);
            System.out.println(ps);
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    return rs;
    }
    
    public int ComprobarExistencia (int intRolId, int intFunId) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int numberOfRows =0;
        String sql = "SELECT count(*) FROM rolfuncionalidad WHERE rolId=? and funId=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intRolId);
            ps.setInt(2, intFunId);
            rs = ps.executeQuery();
            if (rs.next()){
                numberOfRows = rs.getInt(1);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    return numberOfRows;
    }
    
    /*Método para desasignar un Rol/Usuario*/
    public boolean DesasignarRolFuncionalidad (int intRolId, int intFunId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM rolfuncionalidad WHERE rolId=? and funId=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intRolId);
            ps.setInt(2, intFunId);
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
    
}
