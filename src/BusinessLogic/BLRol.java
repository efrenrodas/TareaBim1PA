/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import Clases.Rol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class BLRol {
    DataAccessLogic.DATRol  objRol = new DataAccessLogic.DATRol();
    public boolean Registrar(Rol rol) {
        return objRol.Registrar(rol);
    }
    public boolean Modificar (Rol rol) {
       return objRol.Modificar(rol);
    }
    public boolean Eliminar (int intidRol) {
        return objRol.Eliminar(intidRol);
    }

    public ArrayList<Rol> BuscarRol () throws SQLException {
       ResultSet rs=null;
       ArrayList<Rol> lstRoles = new ArrayList<>();
       rs = objRol.BuscarTodos();
        while(rs.next()) {
           Rol rol = new Rol();
           rol.setIdRol(Integer.parseInt(rs.getString("idrol")));
           rol.setRolNombre(rs.getString("rolNombre"));
           rol.setRolEstado(rs.getString("rolEstado"));
           lstRoles.add(rol);
       }
       return lstRoles;
    }
}
