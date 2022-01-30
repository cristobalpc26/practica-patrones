package src.fachada;

import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 */
public class FachadaAdminSRP {

    GestionEmpleados ge = new GestionEmpleados();

    GestionAdminProductos gp = new GestionAdminProductos();


    //Acceso al subsistema de las acciones que realiza el administrador con os empleados
    public void modificarEmpleado(Empleado e) {
        ge.modificarEmpleado(e);
    }

    public void eliminarEmpleado(String dni) {
        ge.eliminarEmpleado(dni);
    }

    public void insertarEmpleado(Empleado e) {
        ge.insertarEmpleado(e);
    }
    //Acceso al subsistema de las acciones que realiza el administrador con los productos

    public void eliminarProducto(String id_producto) {
        gp.eliminarProducto(id_producto);
    }

    public void insertarProducto(Producto p) {
        gp.insertarProducto(p);
    }

    public void modificarProducto(Producto p) {
        gp.modificarProducto(p);
    }
    public void verHistorialdeActividad() {
        ge.consultarHistorial();
    }

}
