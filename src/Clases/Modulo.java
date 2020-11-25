/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author efren
 */
public class Modulo {
   int idModulo;
   String modNombre;
   String modEstado;

   public Modulo() {
   }

   public Modulo(int idModulo, String modNombre) {
       this.idModulo = idModulo;
       this.modNombre = modNombre;
   }

   public Modulo(int idModulo, String modNombre, String modEstado) {
       this.idModulo = idModulo;
       this.modNombre = modNombre;
       this.modEstado = modEstado;
   }

   public int getIdModulo() {
       return idModulo;
   }

   public void setIdModulo(int idModulo) {
       this.idModulo = idModulo;
   }

   public String getModNombre() {
       return modNombre;
   }

   public void setModNombre(String modNombre) {
       this.modNombre = modNombre;
   }

   public String getModEstado() {
       return modEstado;
   }

   public void setModEstado(String modEstado) {
       this.modEstado = modEstado;
   }
   @Override
   public String toString(){
     return modNombre;  
   }
}