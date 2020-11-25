/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author daguaman
 */
public class Rol {
    int idRol;
    String rolNombre;
    String rolEstado;

    public Rol(){}
    
    public Rol(int idRol, String rolNombre) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
    }
    
    public Rol(int idRol, String rolNombre, String rolEstado) {
        this.idRol = idRol;
        this.rolNombre = rolNombre;
        this.rolEstado = rolEstado;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolEstado() {
        return rolEstado;
    }

    public void setRolEstado(String rolEstado) {
        this.rolEstado = rolEstado;
    }

    @Override
    public String toString() {
        return rolNombre;
    }
    
    
    
}
