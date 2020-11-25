package Clases;
/**
 *
 * @author daguaman
 */
public class RolFuncionalidad {
    int idRol;
    int idFuncionalidad;
    String rolNombre;
    String funNombre;

    public RolFuncionalidad() {
    }

    public RolFuncionalidad(int idRol, int idFuncionalidad, String rolNombre, String funNombre) {
        this.idRol = idRol;
        this.idFuncionalidad = idFuncionalidad;
        this.rolNombre = rolNombre;
        this.funNombre = funNombre;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(int idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getFunNombre() {
        return funNombre;
    }

    public void setFunNombre(String funNombre) {
        this.funNombre = funNombre;
    }
    
}
