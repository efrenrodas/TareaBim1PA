/*
El nombre del Paquete es Ejecutor y dentro de ella consta la clase que permite ejecutar el programa
 */
package Ejecutor;

import Clases.Usuario;
import ManejaArchivos.OperaUsuario;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class TareaBim1PA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Crea un Objeto de la clase Usuario
        Usuario objUsuario = new Usuario(22222, "2222", "Estudiante1", "Apellido1", "loginEst1", "222", 2, 2, 2);
        //Crea una variable para acceder a operar los archivos
        ManejaArchivos.OperaUsuario objArcUsuario = new OperaUsuario();
        System.out.println("Envia objetos al Archivo");
        //como el método es de tipo boolean retorna true or false
        boolean retorno = objArcUsuario.RegistraObjetosUsuario(objUsuario);
        //dependiendo de la salida se aplica una lógica para mostrar al Usuario
        if (retorno==true){
            System.out.println("Registros insertados con exito");
        }
        else{
            System.out.println("Error al registrar");
        }
        /*Una vez que se ha registrado se puede recuperar los objetos 
        almacenados en el archivo
        */
        System.out.println("Recupera objetos almacenados en Archivos");
        //se crea una variable de tipo ArrayList para recuperar uno o varios objetos
        ArrayList<Usuario> lstUsuarios = objArcUsuario.RecuperaObjetosUsuario();
        /*se usa el for que permite interactuar con los objetos de tipo ArrayList*/
        for (Usuario lstUsuario : lstUsuarios) {
            /*En este cas se muestran solamente algunos atributos puede desplegar los
            que Ud. considere*/
            System.out.println(
                    "Id" + lstUsuario.getIdUsuario() +
                    "Nombres" + lstUsuario.getUsNombres() + 
                    "Apellidos" + lstUsuario.getUsApellidos()
            );
        }
    }
}
