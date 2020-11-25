/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLogic;

import Clases.Funcionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daguaman
 */
public class DATFuncionalidad extends Conexion{
    public boolean Registrar(Funcionalidad fun) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO funcionalidad (funCodigo, funNombre, funEstado) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, fun.getFunCodigo());
            ps.setString(2, fun.getFunNombre());
            ps.setInt(3, fun.getFunEstado());
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
    
    public boolean Eliminar (int intidFunc) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM funcionalidad WHERE idfuncionalidad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intidFunc);
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
    public ResultSet BuscarPorCriterio (String strfunNombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM funcionalidad WHERE funnombre like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strfunNombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar un Usuario en base a un criterio de búsqueda*/
    public ResultSet BuscarTodos () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM funcionalidad";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    public int ComprobarExistencia (String strFunNombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int numberOfRows =0;
        String sql = "SELECT count(*) FROM funcionalidad WHERE funNombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strFunNombre);
            rs = ps.executeQuery();
            if (rs.next()){
                numberOfRows = rs.getInt(1);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    return numberOfRows;
    }
    
     public boolean Actualizar(Funcionalidad fun) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        //referencia UPDATE `funcionalidad` SET `funCodigo` = 'ADMINISTRAR1', `funNombre` = 'Administrar1', `funEstado` = '1' WHERE `funcionalidad`.`idfuncionalidad` = 3;
       // String sql = "UPDATE usuario SET usIdentificacion=?, usNombres=?, usApellidos=?, usLogin=?, usPassword=?, usEstado=?, usPais=?, usGenero=? WHERE idUsuario=?";
      
        String sql = "UPDATE  funcionalidad SET funCodigo=?, funNombre=?, funEstado=? WHERE idfuncionalidad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, fun.getFunCodigo());
            ps.setString(2, fun.getFunNombre());
            ps.setInt(3, fun.getFunEstado());
            ps.setInt(4, fun.getIdFuncionalidad());
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
