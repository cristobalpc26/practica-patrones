/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_factory_method_productos;

/**
 *
 * @author Carlos
 */
public class FabricaCategoria {

    public Categoria getCategoria(String nombre) { //Método de fabricación o creacion de objetos, cuarado o circulo a traves de clases concretas o subclases
        Categoria p = null;
        if (nombre.equals("Carne")) {
            p = new Carne("Carne");
        } else if (nombre.equals("Pescado")) {
            p = new Pescado("Pescado");
        } else if (nombre.equals("Bebidas")){
            p = new Bebidas("Bebidas");

        }
        return p;
    }
}
