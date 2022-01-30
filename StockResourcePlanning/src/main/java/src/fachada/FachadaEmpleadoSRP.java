package src.fachada;

import src.patron_factory_method_productos.Producto;
import src.users.Empleado;
import src.users.Historial;

/**
 *
 */
public class FachadaEmpleadoSRP {

 

    GestionContabilidadProductos gcp = new GestionContabilidadProductos();

     //Acceso al subsistema de las acciones que realiza el empleado (modificar unidades producto)

    public void modificarProducto(Producto p) {
        gcp.modificarProducto(p);
    }
       public void insertarHistorialProductos(Historial h) {
        gcp.insertarHistorialProductos(h);
    }
   

}
