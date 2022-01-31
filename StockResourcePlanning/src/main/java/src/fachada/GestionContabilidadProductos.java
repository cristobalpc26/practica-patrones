/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.fachada;

import src.patron_factory_method_productos.Producto;
import src.patron_proxy.ProxyGestorBD;
import src.users.Historial;

/**
 *
 * @author Carlos
 */

//Subsistema que Solo lo usa el empleado para modificar la cantidad de unidades disponibles de un producto.
//A la hora de hacer la reposicion de unidades, se llama a insertar historial para que de forma una vez hecha la modificacion se guarde en el historial
// sin que el usuario tenga que hacer nada.

public class GestionContabilidadProductos {
         private ProxyGestorBD pbd = ProxyGestorBD.getInstancia();

    public void modificarProducto(Producto p){
       pbd.modificarProducto(p);
    }
    public void insertarHistorialProductos(Historial h) {
       pbd.insertarHistorialProductos(h);
    }
}
