/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_proxy;

import java.util.ArrayList;
import java.util.Date;
import src.patron_factory_method_productos.Producto;
import src.patron_iterator.IteradorEmpleados;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class ProxyGestorBD implements ServicioBD{
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProducto(String id_producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarProducto(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultagetProductoNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultagetProductosFechaCaducidad(Date Fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultagetProductosUnidades(int unidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> getProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
