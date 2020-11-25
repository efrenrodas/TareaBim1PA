package DataAccessLogic;
import Clases.Catalogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DATCatalogo extends Conexion{
    public boolean Registrar(Catalogo cat) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO catalogo (catCodigo, catNombre, catDescripcion, catEstado) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getCatCodigo());
            ps.setString(2, cat.getCatNombre());
            ps.setString(3, cat.getCatDescripcion());
            ps.setInt(4, cat.getCatEstado());
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
    public boolean Modificar (Catalogo cat) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "UPDATE catalogo SET catCodigo=?, catNombre=?, catDescripcion=?, catEstado=? "
                + " WHERE idcatalogo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getCatCodigo());
            ps.setString(2, cat.getCatNombre());
            ps.setString(3, cat.getCatDescripcion());
            ps.setInt(4, cat.getCatEstado());
            ps.setInt(5, cat.getIdCatalogo());
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
    public boolean Eliminar (int intidCatalogo) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM catalogo WHERE idCatalogo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, intidCatalogo);
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
    public ResultSet Buscar (String strcatCodigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM catalogo WHERE catCodigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strcatCodigo);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
    
    /*Método para buscar todos los Usuarios registrados en la BDD*/
    public ResultSet BuscarTodos () {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM catalogo";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    return rs;
    }
}
