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

    public Categoria crearCategoria(String nombre) { //Método de creacion de categorias a traves de clases concretas o subclases
        Categoria p = null;
        switch (nombre) {
            case "Carne":
                p = new Carne("Carne");
                break;
            case "Pescado":
                p = new Pescado("Pescado");
                break;
            case "Bebidas":
                p = new Bebidas("Bebidas");
                break;
            default:
                break;
        }
        return p;
    }
}
