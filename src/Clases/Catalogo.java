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

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, String catCodigo, String catNombre, String catDescripcion, int catEstado) {
        this.idCatalogo = idCatalogo;
        this.catCodigo = catCodigo;
        this.catNombre = catNombre;
        this.catDescripcion = catDescripcion;
        this.catEstado = catEstado;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public String getCatDescripcion() {
        return catDescripcion;
    }

    public int getCatEstado() {
        return catEstado;
    }
    
}
