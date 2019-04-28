package Clases;
/*import ManejaArchivos.*; es el nombre del paquete que se debe importar 
porque sobre el se realizará las operaciones con archivos*/
import ManejaArchivos.*;
/**
 *
 * @author daguaman
 */
public class Rol {
    int idRol;
    String rolNombre;
    int rolEstado;

    /* Es necesario crear un objeto para acceder desde esta clase a los métodos de 
    la clase OperaRol para realizar las operaciones sobre los archivos
    */
    ManejaArchivos.OperaRol objArchivoRol = new ManejaArchivos.OperaRol();

}
