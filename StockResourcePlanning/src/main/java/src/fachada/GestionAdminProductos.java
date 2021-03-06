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
public class GestionAdminProductos {
    
    //Subsistema de la fachada que realiza las operaciones del administrador relacionadas ccon los productos por medio del proxy
    
     private ProxyGestorBD pbd = ProxyGestorBD.getInstancia();
    
    public void insertarProducto(Producto p){
        pbd.insertarProducto(p);
    }
    public void modificarProducto(Producto p){
        pbd.modificarProducto(p);
    }
    public void eliminarProducto(String id){
        pbd.eliminarProducto(id);
        
    }
}

