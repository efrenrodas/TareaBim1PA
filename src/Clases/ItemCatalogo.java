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
public class ItemCatalogo {
    int idItemCatalogo;
    String itcCodigo;
    String itcNombre;
    String itcDescripcion;
    int idCatalogo;
    public ItemCatalogo(){}
    
    public ItemCatalogo(int idItemCatalogo, String itcCodigo) {
        this.idItemCatalogo = idItemCatalogo;
        this.itcCodigo = itcCodigo;
    }
    

    public ItemCatalogo(int idItemCatalogo, String itcCodigo, String itcNombre, String itcDescripcion, int idCatalogo) {
        this.idItemCatalogo = idItemCatalogo;
        this.itcCodigo = itcCodigo;
        this.itcNombre = itcNombre;
        this.itcDescripcion = itcDescripcion;
        this.idCatalogo = idCatalogo;
    }

    public int getIdItemCatalogo() {
        return idItemCatalogo;
    }

    public void setIdItemCatalogo(int idItemCatalogo) {
        this.idItemCatalogo = idItemCatalogo;
    }

    public String getItcCodigo() {
        return itcCodigo;
    }

    public void setItcCodigo(String itcCodigo) {
        this.itcCodigo = itcCodigo;
    }

    public String getItcNombre() {
        return itcNombre;
    }

    public void setItcNombre(String itcNombre) {
        this.itcNombre = itcNombre;
    }

    public String getItcDescripcion() {
        return itcDescripcion;
    }

    public void setItcDescripcion(String itcDescripcion) {
        this.itcDescripcion = itcDescripcion;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    
    
    
    
}
