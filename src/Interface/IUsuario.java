package Interface;
import Clases.Usuario;
import java.util.ArrayList;
/**
 *
 * @author daguaman
 */
/*La dejo aqui declarada, ya en su momento la usaremos cuando hablemos de relaciones
Esto es una interface diferente a Interfaz Gráfica de Usuario, en ella se declaran 
solamente métodos a implementar
*/
public interface IUsuario {
    public boolean RegistraObjetosUsuario(Usuario objUsuario);
    public ArrayList<Usuario> RecuperaObjetosUsuario();
}