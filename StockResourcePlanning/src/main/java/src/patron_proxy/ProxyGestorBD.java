/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_proxy;

import java.util.ArrayList;
import src.patron_factory_method_productos.Producto;
import src.users.Empleado;
import src.users.Historial;

/**
 *
 * @author cris
 */
public class ProxyGestorBD implements ServicioBD{
   
    // Uso del patrrón Singleton en el proxy.
    
    private static ProxyGestorBD instancia = new ProxyGestorBD();
    private ServicioBD serv;
    
    private ProxyGestorBD() {
        this.serv = new ServidorBD();
    }

    public static ProxyGestorBD getInstancia() {
        return instancia;
    } 
    
    @Override
    public void insertarEmpleado(Empleado e) {
        this.serv.insertarEmpleado(e);
    }

    @Override
    public void eliminarEmpleado(String dni) {
        this.serv.eliminarEmpleado(dni);
    }

    @Override
    public void modificarEmpleado(Empleado e) {
        this.serv.modificarEmpleado(e);
    }

    @Override
    public String getDniEmpleado(String login, String passwd) {
        return this.serv.getDniEmpleado(login, passwd);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return this.serv.getEmpleados();
    }

    @Override
    public ArrayList<Empleado> consultagetEmpleadosNombre(String nombre) {
        return this.serv.consultagetEmpleadosNombre(nombre);
    }

    @Override
    public ArrayList<Empleado> consultagetEmpleadosDNI(String dni) {
        return this.serv.consultagetEmpleadosDNI(dni);
    }

    @Override
    public void insertarProducto(Producto p) {
        this.serv.insertarProducto(p);
    }

    @Override
    public void eliminarProducto(String id_producto) {
        this.serv.eliminarProducto(id_producto);
    }

    @Override
    public void modificarProducto(Producto p) {
        this.serv.modificarProducto(p);
    }

    @Override
    public ArrayList<Producto> consultagetProductoNombre(String nombre) {
        return this.serv.consultagetProductoNombre(nombre);
    }

    @Override
    public ArrayList<Producto> consultagetProductosFechaCaducidad(String fecha) {
        return this.serv.consultagetProductosFechaCaducidad(fecha);
    }

    @Override
    public ArrayList<Producto> consultagetProductosUnidades(int unidades) {
        return this.serv.consultagetProductosUnidades(unidades);
    }

    @Override
    public ArrayList<Producto> getProductos() {
        return this.serv.getProductos();
    }

    @Override
    public void modificarUnidadesProducto(int unidades, Producto p) {
        this.serv.modificarUnidadesProducto(unidades, p);
    }

    @Override
    public ArrayList<String> getDNIEmpleados() {
        return this.serv.getDNIEmpleados();
    }

    @Override
    public ArrayList<String> getIDSproductos() {
        return this.serv.getIDSproductos();
    }

    @Override
    public ArrayList<Historial>devolverHistorial() {
        return this.serv.devolverHistorial();
    }

    @Override
    public ArrayList<Producto> consultagetProductoId(String id) {
       
        return this.serv.consultagetProductoId(id);
    }

    @Override
    public void insertarHistorialProductos(Historial h) {
        this.serv.insertarHistorialProductos(h);
    }
   
}
