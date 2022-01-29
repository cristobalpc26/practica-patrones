/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_state_productos;

import src.patron_factory_method_productos.Producto;

/**
 *
 * @author cris
 */
public class EstadoNeutro implements EstadoProducto {

    @Override
    public void ejecutarModificacionUnidades(Producto p) {

        EstadoProducto lleno = new EstadoLleno();
        EstadoProducto vacio = new EstadoVacio();

        if (p.getUnidades() == 0) {
           // System.out.println("¡Estoy vacio!");
            p.setEstadoActual(vacio);
        } else if (p.getUnidades() == p.getUnidadesMaximas()) {
          //  System.out.println("¡Estoy lleno!");
            p.setEstadoActual(lleno);
        }

    }
}
