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
public class DATModFuncionalidad extends Conexion{
    
    public boolean RegistrarModFuncionalidad(int modId, int funId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO modulofuncionalidad (idModulo, idFuncionalidad) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modId);
            ps.setInt(2, funId);
           
            System.out.println(">"+ps);
 ps.execute();   
            retorno = true;
        } catch (Exception e) {
            System.out.println("Error al registrar "+e);
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
    
    public ResultSet BuscarModFuncion () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT modulofuncionalidad.idModulo, modulofuncionalidad.idFuncionalidad, modNombre, funNombre FROM modulofuncionalidad, modulo md, funcionalidad\n" +
                     "where 1 = 1\n" +
                     "and modulofuncionalidad.idModulo = md.idmodulo\n" +
                     "and modulofuncionalidad.idFuncionalidad=funcionalidad.idfuncionalidad;";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
      public ResultSet BuscarModFuncionId (int idModFun) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT modulofuncionalidad.idModulo, modulofuncionalidad.idFuncionalidad, modNombre, funNombre FROM modulofuncionalidad, modulo md, funcionalidad\n" +
                     "where 1 = 1\n" +
                     "and modulofuncionalidad.idModulo = md.idmodulo\n" +
                     "and modulofuncionalidad.idFuncionalidad=funcionalidad.idfuncionalidad\n"+ 
                     "and modulofuncionalidad.idFuncionalidad =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idModFun);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    public int ComprobarExistencia (int intIdMod, int  intIdFun) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int numberOfRows =0;
        String sql = "SELECT count(*) FROM modulofuncionalidad WHERE 	idModulo=? and idFuncionalidad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intIdMod);
            ps.setInt(2, intIdFun);
            rs = ps.executeQuery();
            if (rs.next()){
                numberOfRows = rs.getInt(1);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    return numberOfRows;
    }
    
    /*Método para desasignar un MOdulo/Funcionalidad*/
    public boolean DesasignarModFuncion (int intModId, int intFunId) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM modulofuncionalidad WHERE idModulo=? and idFuncionalidad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intModId);
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
