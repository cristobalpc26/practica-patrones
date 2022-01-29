/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class ContextoProductos {
    private EstrategiaProductos estrategia;
    private ArrayList<Producto> productos; // Lista de empleados.

    public ContextoProductos(EstrategiaProductos e, ArrayList<Producto> productos) {
        this.estrategia = e;
        this.productos = productos;
    }

   

 
    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(EstrategiaProductos e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public void ejecutaEstrategiaProductos() {
        estrategia.ordenaProductos(productos);
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }
      
}
