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
public class Frutas implements Categoria {
    
    public String nombre;

    public Frutas(String nombre) {
        this.nombre = nombre;
    }
      
    @Override
    public String getNombre() {
        return this.nombre;
    }

    
}