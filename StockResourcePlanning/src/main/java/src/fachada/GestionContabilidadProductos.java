/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.fachada;

import src.patron_factory_method_productos.Producto;
import src.patron_proxy.ProxyGestorBD;

/**
 *
 * @author Carlos
 */

//Solo lo usa el empleado para modificar la cantidad de unidades disponibles de un producto

public class GestionContabilidadProductos {
         private ProxyGestorBD pbd = ProxyGestorBD.getInstancia();

    public void modificarProducto(Producto p){
       pbd.modificarProducto(p);
    }
}
