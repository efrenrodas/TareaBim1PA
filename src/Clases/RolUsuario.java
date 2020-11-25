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
public class RolUsuario {
    int idRol;
    int idUsuario;
    String rolNombre;
    String usNombres;

    public RolUsuario(int idRol, int idUsuario, String rolNombre, String usNombres) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
        this.rolNombre = rolNombre;
        this.usNombres = usNombres;
    }

    public RolUsuario() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getUsNombres() {
        return usNombres;
    }

    public void setUsNombres(String usNombres) {
        this.usNombres = usNombres;
    }
    

    
    
    
}
