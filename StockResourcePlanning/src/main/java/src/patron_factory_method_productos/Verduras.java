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
public class Verduras implements Categoria {
    
    public String nombre;

    public Verduras(String nombre) {
        this.nombre = nombre;
    }
      
    @Override
    public String getNombre() {
        return this.nombre;
    }

    
}