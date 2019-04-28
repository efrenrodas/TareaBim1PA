//package Clases; es el nombre del paquete que contiene a las Clases
package Clases;
//paquete que es necesario importar porque vamos a serializar los objetos de la Clase
import java.io.Serializable;

/**
 *
 * @author daguaman
 */
/*implements Serializable - como se va a usar objetos y operar con 
archivos se usa para formatearlos y poderlos luego leer.
Por ende la clase solo se la deja con los atributos, métodos (solamente get y set)
los otros métodos se utiliza algo que se conoce como Realization.
Aunque para la realizatión se usa interface de a poco lo iremos introduciendo, 
por lopronto se crea el paquete Interface con una clase IUsuario, ya la usaremos
*/
public class Usuario implements Serializable{
    /*al usar Serializable se debe ubicar esta línea 
        private static final long serialVersionUID = 1L;
    */
    private static final long serialVersionUID = 1L;
    /*Atributos de la clase Usuario, se debe ubicar 
    tal cual se encuentre su definición en el modelo UML*/
    private int idUsuario;
    private String usIdentificacion;
    private String usNombres;
    private String usApellidos;
    private String usLogin;
    private String usPassword;
    private int usEstado;
    private int usPais;
    private int usGenero;

    /*Constructor de la clase Usuario con todos los atributos*/
    public Usuario(int idUsuario, String usIdentificacion, String usNombres, String usApellidos, String usLogin, String usPassword, int usEstado, int usPais, int usGenero) {
        this.idUsuario = idUsuario;
        this.usIdentificacion = usIdentificacion;
        this.usNombres = usNombres;
        this.usApellidos = usApellidos;
        this.usLogin = usLogin;
        this.usPassword = usPassword;
        this.usEstado = usEstado;
        this.usPais = usPais;
        this.usGenero = usGenero;
    }
    //Constructor con dos parámetros
    public Usuario(String usIdentificacion, String usNombres){
        super();
        this.usIdentificacion = usIdentificacion;
        this.usNombres = usNombres;
    }
    //Constructor Vacio
    public Usuario(){
    
    }

    public Usuario(int idUsuario, String usIdentificacion, String usNombres) {
        this.idUsuario = idUsuario;
        this.usIdentificacion = usIdentificacion;
        this.usNombres = usNombres;
    }

    /*De aqui hacia abajo la sección de Get*/
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsIdentificacion() {
        return usIdentificacion;
    }

    public String getUsNombres() {
        return usNombres;
    }

    public String getUsApellidos() {
        return usApellidos;
    }

    public String getUsLogin() {
        return usLogin;
    }

    public String getUsPassword() {
        return usPassword;
    }

    public int getUsEstado() {
        return usEstado;
    }

    public int getUsPais() {
        return usPais;
    }

    public int getUsGenero() {
        return usGenero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario1=" + idUsuario + ", usIdentificacion=" + usIdentificacion + ", usNombres=" + usNombres + ", usApellidos=" + usApellidos + ", usLogin=" + usLogin + ", usPassword=" + usPassword + ", usEstado=" + usEstado + ", usPais=" + usPais + ", usGenero=" + usGenero + '}';
    }
}
