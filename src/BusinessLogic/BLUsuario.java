package BusinessLogic;
import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BLUsuario {
    DataAccessLogic.DATUsuario objUsuarios = new DataAccessLogic.DATUsuario();
    public boolean Registrar(Usuario usu) {
        return objUsuarios.Registrar(usu);
    }
    
     public boolean Modificar (Usuario usu) {
        return objUsuarios.Modificar(usu);
     }
     
     public boolean Eliminar (int intidUsuario) {
         return objUsuarios.Eliminar(intidUsuario);
     }
     
     public ArrayList<Usuario> Buscar (String strusIden) throws SQLException {
        ResultSet rs=null;
        ArrayList<Usuario> lstUsuarios = new ArrayList<>();
        if (strusIden!="-1")
            //Buscar por criterio
            rs = objUsuarios.Buscar(strusIden);
        else
            //Buscar todos los usuarios registrados en la BDD
            rs = objUsuarios.BuscarTodos();
        while (rs.next()) {
            Usuario usu = new Usuario();
            usu.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
            usu.setUsIdentificacion(rs.getString("usIdentificacion"));
            usu.setUsNombres(rs.getString("usNombres"));
            usu.setUsApellidos(rs.getString("usApellidos"));
            usu.setUsLogin(rs.getString("usLogin"));
            usu.setUsPassword(rs.getString("usPassword"));
            usu.setUsEstado(Integer.parseInt(rs.getString("usEstado")));
            usu.setUsPais(Integer.parseInt(rs.getString("usPais")));
            usu.setUsGenero(Integer.parseInt(rs.getString("usGenero")));
            lstUsuarios.add(usu);
        }
        return lstUsuarios;
     }
     
     public ArrayList<Usuario> Login (String StrUser) throws SQLException {
        ResultSet rs=null;
        ArrayList<Usuario> lstUsuarios = new ArrayList<>();
        if (StrUser!="-1")
            //Buscar por criterio
            rs = objUsuarios.Buscarlogin(StrUser);
        else
            //Buscar todos los usuarios registrados en la BDD
            rs = objUsuarios.BuscarTodos();
        while (rs.next()) {
            Usuario usu = new Usuario();
            usu.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
            usu.setUsIdentificacion(rs.getString("usIdentificacion"));
            usu.setUsNombres(rs.getString("usNombres"));
            usu.setUsApellidos(rs.getString("usApellidos"));
            usu.setUsLogin(rs.getString("usLogin"));
            usu.setUsPassword(rs.getString("usPassword"));
            usu.setUsEstado(Integer.parseInt(rs.getString("usEstado")));
            usu.setUsPais(Integer.parseInt(rs.getString("usPais")));
            usu.setUsGenero(Integer.parseInt(rs.getString("usGenero")));
            lstUsuarios.add(usu);
        }
        return lstUsuarios;
     }
}
