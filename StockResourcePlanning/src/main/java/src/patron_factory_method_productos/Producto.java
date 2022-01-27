/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_factory_method_productos;

import java.util.Date;
import src.patron_state_productos.EstadoProducto;

/**
 *
 * @author cris
 */
public abstract class Producto {
    protected String id;
    protected String categoria;
    protected String subCategoria;
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int unidades;
    protected String procedencia;
    protected Date fechaLlegada;
    protected Date fechaCaducidad;
    protected String localizacion;
    
    protected EstadoProducto estado;
    
    public abstract void addProducto();
    public abstract Producto getProducto();
    
    public EstadoProducto getEstado() {
        return this.estado;
    }
    
    public void setEstado(EstadoProducto e) {
        this.estado = e;
        // Almacenarlo en un fichero o en la BD
    }
}
