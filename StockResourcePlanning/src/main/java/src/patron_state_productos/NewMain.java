/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_state_productos;

import src.patron_factory_method_productos.Producto;

/**
 *
 * @author Carlos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Producto t = new Producto(56);
        t.añadirUnidades(43);
        //System.out.println(t.toString());
       
    }
}

    

