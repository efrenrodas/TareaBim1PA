/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daguaman
 */
public class DATRolUsuario extends Conexion{
    
    public boolean RegistrarRolUsuario(int rolId, int usId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO rolusuario (rolId, usId) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, rolId);
            ps.setInt(2, usId);
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
    
    public ResultSet BuscarRolUsuario () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT rolId, usId, rolNombre, usuario.usNombres FROM rolusuario ru, rol, usuario\n" +
                     "where 1 = 1\n" +
                     "and ru.rolId = rol.idrol\n" +
                     "and ru.usId = usuario.idUsuario;";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    public int ComprobarExistencia (int intRolId, int intUsId) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int numberOfRows =0;
        String sql = "SELECT count(*) FROM rolusuario WHERE rolId=? and usId=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intRolId);
            ps.setInt(2, intUsId);
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
    public boolean DesasignarRolUsuario (int intRolId, int intUsId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM rolusuario WHERE rolId=? and usId=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intRolId);
            ps.setInt(2, intUsId);
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
