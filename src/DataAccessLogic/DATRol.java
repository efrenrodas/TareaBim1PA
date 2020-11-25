/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLogic;

import Clases.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daguaman
 */
public class DATRol extends Conexion{
    public boolean Registrar(Rol rol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO rol (rolNombre, rolEstado) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rol.getRolNombre());
            ps.setString(2, rol.getRolEstado());
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
    /*Método para Modificar un objeto de la clase Rol, llega como parámetro pro que es de tipo Rol.
    La actualización siempre se hace sobre un condicional que re ubica como parte del Where*/
    public boolean Modificar (Rol rol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "UPDATE rol SET rolNombre=?, rolEstado=? WHERE idrol=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rol.getRolNombre());
            ps.setString(2, rol.getRolEstado());
            ps.setInt(3, rol.getIdRol());
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
    /*Método para eliminar un objeto de tipo Rol*/
    public boolean Eliminar (int intidRol) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM rol WHERE idrol=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intidRol);
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
    
    /*Método para buscar todos los Roles registrados en la BDD*/
    public ResultSet BuscarTodos () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM rol";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
}
