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
public class Catalogo {
    int idCatalogo;
    String catCodigo;
    String catNombre;
    String catDescripcion;
    int catEstado;

    public Catalogo(int idCatalogo, String catCodigo, String catNombre, String catDescripcion, int catEstado) {
        this.idCatalogo = idCatalogo;
        this.catCodigo = catCodigo;
        this.catNombre = catNombre;
        this.catDescripcion = catDescripcion;
        this.catEstado = catEstado;
    }
    
    public Catalogo(){}

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(String catCodigo) {
        this.catCodigo = catCodigo;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public String getCatDescripcion() {
        return catDescripcion;
    }

    public void setCatDescripcion(String catDescripcion) {
        this.catDescripcion = catDescripcion;
    }

    public int getCatEstado() {
        return catEstado;
    }

    public void setCatEstado(int catEstado) {
        this.catEstado = catEstado;
    }
    
}
