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
public class Funcionalidad {
    int idFuncionalidad;
    String funCodigo;
    String funNombre;
    int funEstado;

    public Funcionalidad() {
    }

    public Funcionalidad(int idFuncionalidad, String funCodigo, String funNombre, int funEstado) {
        this.idFuncionalidad = idFuncionalidad;
        this.funCodigo = funCodigo;
        this.funNombre = funNombre;
        this.funEstado = funEstado;
    }
    
    public Funcionalidad(int idFuncionalidad, String funNombre) {
        this.idFuncionalidad = idFuncionalidad;
        this.funNombre = funNombre;
    }

    public int getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(int idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public String getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(String funCodigo) {
        this.funCodigo = funCodigo;
    }

    public String getFunNombre() {
        return funNombre;
    }

    public void setFunNombre(String funNombre) {
        this.funNombre = funNombre;
    }

    public int getFunEstado() {
        return funEstado;
    }

    public void setFunEstado(int funEstado) {
        this.funEstado = funEstado;
    }
    
    @Override
    public String toString() {
        return funNombre;
    }
}
