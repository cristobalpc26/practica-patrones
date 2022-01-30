/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_strategy_empleados_productos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class EstrategiaOrdenarPorUnidadesProductos implements EstrategiaProductos {

    @Override
    public void ordenaProductos(ArrayList<Producto> productos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator nombre = (Comparator) (Object o1, Object o2) -> {
            Producto p1 = (Producto) o1;
            Producto p2 = (Producto) o2;

            Integer unidadesP1 = p1.getUnidades();
            Integer unidadesP2 = p2.getUnidades();
                      

            return unidadesP1.compareTo(unidadesP2);
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(productos, nombre);
    }

  

   

}
