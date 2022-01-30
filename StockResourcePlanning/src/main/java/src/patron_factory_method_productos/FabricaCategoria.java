/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_factory_method_productos;

import javax.swing.JOptionPane;

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
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());
                break;
            case "Pescado":
                p = new Pescado("Pescado");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());
                break;
            case "Bebidas":
                p = new Bebidas("Bebidas");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Verduras":
                p = new Verduras("Verduras");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Frutas":
                p = new Frutas("Frutas");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Pollo":
                p = new Pollo("Pollo");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Embutidos":
                p = new Embutidos("Embutidos");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Lacteos":
                p = new Lacteos("Lacteos");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Dulces":
                p = new Dulces("Dulces");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Especias":
                p = new Especias("Especias");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Salsas":
                p = new Salsas("Salsas");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Pasta":
                p = new Pasta("Pasta");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Snacks":
                p = new Snacks("Snacks");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Postres":
                p = new Postres("Postres");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            case "Otros":
                p = new Otros("Otros");
                JOptionPane.showMessageDialog(null, "Producto de la categoria " + p.getNombre());

                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");

                break;
        }
        return p;
    }
}
