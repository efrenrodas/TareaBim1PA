/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLogic;

import Clases.Modulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DATModulo extends Conexion {
       public boolean Registrar(Modulo mod) {
       PreparedStatement ps = null;
       Connection con = getConexion();
       boolean retorno = false;
       String sql = "INSERT INTO modulo (modNombre, modEstado) VALUES (?,?)";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, mod.getModNombre());
           ps.setString(2, mod.getModEstado());
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
   public boolean Modificar (Modulo mod) {
       PreparedStatement ps = null;
       Connection con = getConexion();
       boolean retorno = false;
       String sql = "UPDATE modulo SET modNombre=?, modEstado=? WHERE idmodulo=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, mod.getModNombre());
           ps.setString(2, mod.getModEstado());
           ps.setInt(3, mod.getIdModulo());
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
       public boolean Eliminar (int intidMod) {
       PreparedStatement ps = null;
       Connection con = getConexion();
       boolean retorno = false;
       String sql = "DELETE FROM modulo WHERE idmodulo=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, intidMod);
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
       String sql = "SELECT * FROM modulo";
       try {
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
} catch (Exception e) {
           e.getMessage();
       }
   return rs;
   }
}