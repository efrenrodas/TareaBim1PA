/*Paquete de Constantes para no tener valores quemados en la aplicación y 
que su mantenimiento sea más sencillo*/
package Constantes;

import java.util.ArrayList;

/**
 *
 * @author daguaman
 */
public class ValorComboBox {
    
    public ArrayList CargaEstado(){
        ArrayList<String> lstEstados = new ArrayList<>();
        lstEstados.add(0, "Seleccione..");
        lstEstados.add(1, "Activo");
        lstEstados.add(2, "Inactivo");
        lstEstados.add(3, "Semiactivo");
        return lstEstados;
    }
    
    public ArrayList CargaGenero(){
        ArrayList<String> lstGenero = new ArrayList<>();
        lstGenero.add(0, "Seleccione..");
        lstGenero.add(1, "Masculino");
        lstGenero.add(2, "Femenino");
        return lstGenero;
    }
    
    public ArrayList CargarPaises(){
        ArrayList<String> lstPais = new ArrayList<>();
        lstPais.add(0,"Seleccione..");
        lstPais.add(1,"Ecuador");
        lstPais.add(2,"Peru");
        lstPais.add(3,"Brasil");
        return lstPais;
    }
}
