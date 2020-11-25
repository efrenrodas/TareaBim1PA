/*
Esta clase se la crea para realizar las operaciones de la Clase Usuario, sobre ella se realiza
el CRUD (Create-Insert, Read-Select, U-Update, D-Delete)
*/
package DataAccessLogic;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DATUsuario extends Conexion{
    /*Método que permite realizar el registro de los datos hacia la base de datos
    Hace uso de una de las formas para enviar los datos a la Base de Datos, en este caso PreparedStatement.
    El método es boolean, permite retornar true o false en caso de que el registro sea exitoso o no.
    Si visualiza no se envia el ID como parámetro, debido a que esto en la base está como Autonumérico
    Al metodo llega un parámetro de tipo Usuario, es decir un objeto
    */
    
    public boolean Registrar(Usuario usu) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO usuario (usIdentificacion, usNombres, usApellidos, usLogin, usPassword, usEstado, usPais, usGenero) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getUsIdentificacion());
            ps.setString(2, usu.getUsNombres());
            ps.setString(3, usu.getUsApellidos());
            ps.setString(4, usu.getUsLogin());
            ps.setString(5, usu.getUsPassword());
            ps.setInt(6, usu.getUsEstado());
            ps.setInt(7, usu.getUsPais());
            ps.setInt(8, usu.getUsGenero());
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
    public boolean Modificar (Usuario usu) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "UPDATE usuario SET usIdentificacion=?, usNombres=?, usApellidos=?, usLogin=?, usPassword=?, usEstado=?, usPais=?, usGenero=? WHERE idUsuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getUsIdentificacion());
            ps.setString(2, usu.getUsNombres());
            ps.setString(3, usu.getUsApellidos());
            ps.setString(4, usu.getUsLogin());
            ps.setString(5, usu.getUsPassword());
            ps.setInt(6, usu.getUsEstado());
            ps.setInt(7, usu.getUsPais());
            ps.setInt(8, usu.getUsGenero());
            ps.setInt(9, usu.getIdUsuario());
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
    public boolean Eliminar (int intidUsuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM usuario WHERE idUsuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intidUsuario);
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
    public ResultSet Buscar (String strusIden) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM usuario WHERE usIdentificacion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strusIden);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    //
    public ResultSet Buscarlogin (String strusIden) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM usuario WHERE usLogin=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strusIden);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar todos los Usuarios registrados en la BDD*/
    public ResultSet BuscarTodos () {
        System.out.println("todos los usuarios");
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM usuario";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    /*
    public boolean Actualizar(Usuario usu){
    PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
       // String sql = "INSERT INTO usuario (usIdentificacion, usNombres, usApellidos, usLogin, usPassword, usEstado, usPais, usGenero) VALUES (?,?,?,?,?,?,?,?)";
       String sql= "UPDATE usuario SET usIdentificacion=?, usNombres=?, usApellidos=?, usLogin=?, usPassword=?, usEstado=?, usPais=?, usGenero=?, WHERE `usuario`.`idUsuario` = ?;"; 
       try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getUsIdentificacion());
            ps.setString(2, usu.getUsNombres());
            ps.setString(3, usu.getUsApellidos());
            ps.setString(4, usu.getUsLogin());
            ps.setString(5, usu.getUsPassword());
            ps.setInt(6, usu.getUsEstado());
            ps.setInt(7, usu.getUsPais());
            ps.setInt(8, usu.getUsGenero());
             ps.setInt(9, usu.getIdUsuario());
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
*/
}


