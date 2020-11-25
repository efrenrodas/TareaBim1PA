package ManejaArchivos;

import Clases.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class OperaUsuario {
    private static final String strFilenameser="Usuarioser";
    
    /*Permite almacenar objetos de la clase en archivos de Texto, que es diferente
    a registrar solo texto*/
    public boolean RegistraObjetosUsuario(Usuario objUsuario){
        boolean retorno =false;    
        try{
            /*Creamos una variable de tipo File para ubicar la dirección 
            donde se almacenarán los datos del objeto
            */
            File f = new File("c:/ArchivosSalidaTarea/" + strFilenameser + ".txt");
            /*
            Para almacenar datos en el archivo se requiere crear objetos de tipo
            OutputStream y ObjectOutputStream. 
            Ubicamos true o false para indicar si se añade registros al 
            archivo creado
            */
            FileOutputStream fos  = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            /*write para escribir el objeto en el archivo, en el objeto llegan los atributos
            que se envie desde el constructor de la interfaz gráfica de usuario
            En este caso solo llega un objeto de tipo Usuario
            */
            oos.writeObject(objUsuario);
            /*debemos cerrar el objeto que realiza la escritura de los objetos*/
            oos.close();
            //si todo es correcto seteamos la variable booleana retorno como true
            retorno = true;
        }
        catch(Exception ex){
            //en caso de que exista excepcion seteamos a false o error
            retorno = false;
        }
        return retorno;
    }
    
    /*Permite leer los objetos que se encuentran almacenados en el archivo,
    como se van a recuperar mas de un objeto se declara un método de tipo
    ArrayList<Usuario>, la clase es Usuario, ArrayList<> es una definición propia de Java*/
    public ArrayList<Usuario> RecuperaObjetosUsuario() throws FileNotFoundException, IOException, ClassNotFoundException{
           /*Declaramos un ArrayList y lo inicializamos para recuperar los objetos 
            que están almacenados en el Archivo*/
            ArrayList<Usuario> lstUsuarios = new ArrayList<>();
            boolean cont = true;
            File f = new File("c:/ArchivosSalidaTarea/" + strFilenameser + ".txt");
            /*se debe crear un variable de tipo InputStream para leer los Objetos*/
            FileInputStream fis = new FileInputStream(f);
            try{ 
                /*Lo que debe realizar es crear un objeto de la clase Usuario
                (Usuario)ois.readObject, lo que se hace aqui es un "cast" o 
                conversión de tipo para recuperar los objetos desde el archivo.
                readObject se lo usa para leer los objetos
                Usuario objUsuario = (Usuario)ois.readObject();
                Se añade lstUsuarios.add 
                la condicion fis.available es para contar si existen más objetos en el
                archivo*/
                while(fis.available() > 0) {
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    Usuario objUsuario = (Usuario)ois.readObject();
                    lstUsuarios.add(objUsuario);
                }
            }
            catch(Exception ex){
            }
        return lstUsuarios;
    }        
}