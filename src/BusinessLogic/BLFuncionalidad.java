/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;
import Clases.Funcionalidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class BLFuncionalidad {
    DataAccessLogic.DATFuncionalidad objFuncionalidad = new DataAccessLogic.DATFuncionalidad();
    public boolean Registrar(Funcionalidad fun) {
        return objFuncionalidad.Registrar(fun);
    }
    public boolean Actualizar(Funcionalidad fun) {
        return objFuncionalidad.Actualizar(fun);
    }
    
    public boolean Eliminar (int intidFun) {
         return objFuncionalidad.Eliminar(intidFun);
    }
    
    public ArrayList<Funcionalidad> Buscar (String strFunNombre) throws SQLException {
        ResultSet rs=null;
        ArrayList<Funcionalidad> lstFuncionalidad = new ArrayList<>();
        if (strFunNombre!="-1"){
            rs = objFuncionalidad.BuscarPorCriterio(strFunNombre);
        }else{
            rs = objFuncionalidad.BuscarTodos();
        }
        while (rs.next()) {
            Funcionalidad fun = new Funcionalidad();
            fun.setIdFuncionalidad(Integer.parseInt(rs.getString("idfuncionalidad")));
            fun.setFunCodigo(rs.getString("funCodigo"));
            fun.setFunNombre(rs.getString("funNombre"));
            fun.setFunEstado(Integer.parseInt(rs.getString("funEstado")));
            lstFuncionalidad.add(fun);
        }
        return lstFuncionalidad;
     }
    
    public int ComprobarExistencia(String strFunNombre){
        return objFuncionalidad.ComprobarExistencia(strFunNombre);
    }
}
