/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUISimulaSistema;

/**
 *
 * @author efren
 */
public class dameAcceso {
   public int rolUsuario;

  

  

    public int getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(int rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
   public void dibujaMenus(int id){
       rolUsuario=id;
       JFrameContable jf = null;
      
   }
    
}
