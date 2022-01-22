/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import Interfaces.BuscarProductoEmpleado;
import Interfaces.HomeInicio;
import java.io.IOException;

/**
 *
 * @author Carlos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    private static BuscarProductoEmpleado ejecucion;
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Funciona"); 
        
        ejecucion = new BuscarProductoEmpleado();
        ejecucion.setVisible(true);
    }
    
}
