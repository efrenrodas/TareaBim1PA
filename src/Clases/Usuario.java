/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
/**
 *
 * @author daguaman
 */
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    /*Atributos de la clase Usuario*/
    private int idUsuario;
    private String usIdentificacion;
    private String usNombres;
    private String usApellidos;
    private String usLogin;
    private String usPassword;
    private int usEstado;
    private int usPais;
    private int usGenero;
    
    /*Constructor de la clase Usuario*/
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
    public Usuario(int idUsuario, String usIdentificacion, String usNombres, String usApellidos){
         this.idUsuario = idUsuario;
        this.usIdentificacion = usIdentificacion;
        this.usNombres = usNombres;
        this.usApellidos = usApellidos;
    }
    //Constructor Vacio
    public Usuario(){
    
    }
    
    public Usuario(int idUsuario, String StrNombre){
         this.idUsuario = idUsuario;
        this.usNombres = StrNombre;
    }

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

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setUsIdentificacion(String usIdentificacion) {
        this.usIdentificacion = usIdentificacion;
    }

    public void setUsNombres(String usNombres) {
        this.usNombres = usNombres;
    }

    public void setUsApellidos(String usApellidos) {
        this.usApellidos = usApellidos;
    }

    public void setUsLogin(String usLogin) {
        this.usLogin = usLogin;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }

    public void setUsEstado(int usEstado) {
        this.usEstado = usEstado;
    }

    public void setUsPais(int usPais) {
        this.usPais = usPais;
    }

    public void setUsGenero(int usGenero) {
        this.usGenero = usGenero;
    }
    
    @Override
    public String toString() {
        return usNombres;
    }
    
}
