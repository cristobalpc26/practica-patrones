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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaCategoria hf = new FabricaCategoria();
        Categoria h1 = new Bebidas("kdjsadas");
        System.out.println("Soy una coca cola de la categoria " +h1.getNombre());
       Categoria po1 = new Pescado("ciljz´ca");
        System.out.println("Soy una merluzaa de la categoria " +po1.getNombre());
    }

}
