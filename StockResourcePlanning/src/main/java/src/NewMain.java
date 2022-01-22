/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import Interfaces.HomeInicio;

/**
 *
 * @author Carlos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Funciona"); 
        HomeInicio ejecucion = new HomeInicio();
        ejecucion.setVisible(true);
    }
    
}
