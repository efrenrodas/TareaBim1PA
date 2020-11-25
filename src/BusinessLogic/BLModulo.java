/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;
import Clases.Modulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BLModulo {
   DataAccessLogic.DATModulo  objMod = new DataAccessLogic.DATModulo();
   public boolean Registrar(Modulo mod) {
      return objMod.Registrar(mod);
   }
   public boolean Modificar (Modulo mod) {
      return objMod.Modificar(mod);
   }
   public boolean Eliminar (int intidMod) {
      return objMod.Eliminar(intidMod);
   }

   public ArrayList<Modulo> BuscarMod () throws SQLException {
      ResultSet rs=null;
      ArrayList<Modulo> lstModulos = new ArrayList<>();
      rs = objMod.BuscarTodos();
       while(rs.next()) {
          Modulo modul = new Modulo();
          modul.setIdModulo(Integer.parseInt(rs.getString("idModulo")));
          modul.setModNombre(rs.getString("modNombre"));
          modul.setModEstado(rs.getString("modEstado"));
          lstModulos.add(modul);
      }
      return lstModulos;
   }
}