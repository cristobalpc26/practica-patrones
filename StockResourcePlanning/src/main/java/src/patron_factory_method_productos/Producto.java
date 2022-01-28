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
public class Producto {
    public String id;
    public Categoria categoria;
    public String nombre;
    public String marca;
    public double precio;
    public int unidades;
    public String procedencia;
    public Date fechaLlegada;
    public Date fechaCaducidad;
    public String localizacion;

    public Producto(String id, Categoria categoria, String nombre, String marca, double precio, int unidades, String procedencia, Date fechaLlegada, Date fechaCaducidad, String localizacion, EstadoProducto estado) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.unidades = unidades;
        this.procedencia = procedencia;
        this.fechaLlegada = fechaLlegada;
        this.fechaCaducidad = fechaCaducidad;
        this.localizacion = localizacion;
        //this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
 /*   protected EstadoProducto estado;
    
    public abstract void addProducto();
    public abstract Producto getProducto();
    
    public EstadoProducto getEstado() {
        return this.estado;
    }
    
    public void setEstado(EstadoProducto e) {
        this.estado = e;
        // Almacenarlo en un fichero o en la BD
    }*/
}
