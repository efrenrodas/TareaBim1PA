/*
Paquete que se usa para realizar operaciones de:
Establecimiento de conexión dependiendo del motor de base de datos que se requiera para trabajar.
*/
package DataAccessLogic;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/*Clase que se usa para gestionar la conexion a la base, aqui debe ubicar lo que corresponda a su base de datos
en el caso de que el usuario y clave sean las mismas o no la tenga debe modificar en esta sección.
Como se usa MySQL este se levanta en el puerto 3306, por ello se lo ubica*/
public class Conexion {
    private final String base = "seguridad";
    private final String usuario = "root";
    private final String clave = "";//mi base no tiene contraseña
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
            
    public Connection getConexion() {
        try {
            /*Esta configuración del Driver es cuando se usa MySQL
            En caso de que use SQL, Oracle, Access debe cambiarlo en esta seccion*/
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return con;
    }
}
