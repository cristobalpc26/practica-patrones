package src.fachada;

import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 */
public class FachadaEmpleadoSRP {

 

    GestionContabilidadProductos gcp = new GestionContabilidadProductos();

     //Acceso al subsistema de las acciones que realiza el empleado (modificar unidades producto)

    public void modificarProducto(Producto p) {
        gcp.modificarProducto(p);
    }
   

}
