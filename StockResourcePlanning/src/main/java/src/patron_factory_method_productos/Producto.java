/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_factory_method_productos;

import java.util.Date;
import src.patron_state_productos.EstadoLleno;
import src.patron_state_productos.EstadoNeutro;
import src.patron_state_productos.EstadoProducto;
import src.patron_state_productos.EstadoVacio;

/**
 *
 * @author cris
 */
public class Producto {

    public String id;
    public String categoria;
    public String nombre;
    public String marca;
    public double precio;
    public int unidades;
    public String procedencia;
    public String fechaLlegada;
    public String fechaCaducidad;
    public String localizacion;
    public EstadoProducto estadoActual;

    private final int unidadesMaximas=100;
    private Categoria c;
    
    
    public Producto(int unidades) {
       
        this.unidades = unidades;
    }

   

    public void añadirUnidades(int unidadesRepuestas) {
        unidades += unidadesRepuestas;

        if (unidades < unidadesMaximas && unidades >= 0) {
            estadoActual = new EstadoNeutro();

        }
        if (unidades > unidadesMaximas) {
            unidades = unidadesMaximas;
            estadoActual = new EstadoLleno();

        }
        estadoActual.ejecutarModificacionUnidades(this);
        resultado();
    }

    public void quitarUnidades(int unidadesRepuestas) {
        unidades -= unidadesRepuestas;

        if (unidades < unidadesMaximas && unidades >= 0) {
            estadoActual = new EstadoNeutro();
        }
        if (unidades < 0) {
            unidades = 0;
            estadoActual = new EstadoVacio();
        }

        estadoActual.ejecutarModificacionUnidades(this);
        resultado();
    }

    
    
    public void resultado() {
        estadoActual.ejecutarModificacionUnidades(this); //comprobamos el estado final
    }

    
    public Producto(String id, String categoria, String nombre, String marca, double precio, int unidades, String procedencia, String fechaLlegada, String fechaCaducidad, String localizacion) {
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
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
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

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getUnidadesMaximas() {
        return unidadesMaximas;
    }

    
    public EstadoProducto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoProducto estadoActual) {
        this.estadoActual = estadoActual;
    }
      public String getEstadoActualString() {
        return getEstadoActual().toString();
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
