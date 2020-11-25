package Clases;
/**
 *
 * @author daguaman
 */
public class ModFuncionalidad {
    int idModulo;
    int idFuncionalidad;
    String modNombre;
    String funNombre;

    public ModFuncionalidad() {
    }

    public ModFuncionalidad(int idModulo, int idFuncionalidad, String modNombre, String funNombre) {
        this.idModulo = idModulo;
        this.idFuncionalidad = idFuncionalidad;
        this.modNombre = modNombre;
        this.funNombre = funNombre;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public int getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(int idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getModNombre() {
        return modNombre;
    }

    public void setModNombre(String modNombre) {
        this.modNombre = modNombre;
    }

    public String getFunNombre() {
        return funNombre;
    }

    public void setFunNombre(String funNombre) {
        this.funNombre = funNombre;
    }

  
    
}
