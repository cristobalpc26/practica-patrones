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
            case "Verduras":
                p = new Verduras("Verduras");
                break;
            case "Frutas":
                p = new Frutas("Frutas");
                break;
            case "Pollo":
                p = new Pollo("Pollo");
                break;
            case "Embutidos":
                p = new Embutidos("Embutidos");
                break;
            case "Lacteos":
                p = new Lacteos("Lacteos");
                break;
            case "Dulces":
                p = new Dulces("Dulces");
                break;
            case "Especias":
                p = new Especias("Especias");
                break;
            case "Salsas":
                p = new Salsas("Salsas");
                break;
            case "Pasta":
                p = new Pasta("Pasta");
                break;
            case "Snacks":
                p = new Snacks("Snacks");
                break;
            case "Postres":
                p = new Postres("Postres");
                break;
            case "Otros":
                p = new Otros("Otros");
                break;
            default:
                break;
        }
        return p;
    }
}
