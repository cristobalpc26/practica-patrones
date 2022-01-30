/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface ServicioBD {

    /**
     * Inserta un empleado en la base de datos.
     *
     * @param e Empleado a insertar
     */
    // Empleados
    public void insertarEmpleado(Empleado e);

    public void eliminarEmpleado(String dni);

    public void modificarEmpleado(Empleado e);

    public String getDniEmpleado(String login, String passwd);

    public ArrayList<Empleado> consultagetEmpleadosNombre(String nombre);

    public ArrayList<Empleado> consultagetEmpleadosDNI(String dni);

    public ArrayList<Empleado> getEmpleados();

    public ArrayList<String> getDNIEmpleados();
    
    


    // Productos
    public void insertarProducto(Producto p);

    public void eliminarProducto(String id_producto);

    public void modificarProducto(Producto p);

    public void modificarUnidadesProducto(int unidades, Producto p);

    public ArrayList<Producto> consultagetProductoNombre(String nombre);
    
     public ArrayList<Producto> consultagetProductoId(String id);


    public ArrayList<Producto> consultagetProductosFechaCaducidad(String Fecha);

    public ArrayList<Producto> consultagetProductosUnidades(int unidades);

    public ArrayList<Producto> getProductos();

    public ArrayList<String> getIDSproductos();
    
    //Historial de actividad
    
    public ArrayList<Historial>devolverHistorial();

}
