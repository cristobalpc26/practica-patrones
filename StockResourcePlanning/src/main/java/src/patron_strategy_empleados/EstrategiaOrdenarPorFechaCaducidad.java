/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 * @author Carlos
 */
public class EstrategiaOrdenarPorFechaCaducidad implements EstrategiaProductos {


    @Override
    public void ordenaProductos(ArrayList<Producto> productos) {
        //Comparador para ordenar los alumnos por su nombre
        Comparator fecha_caducidad = (Comparator) (Object o1, Object o2) -> {
            Producto p1 = (Producto) o1;
            Producto p2 = (Producto) o2;

            return p1.getFechaCaducidad().compareTo(p2.getFechaCaducidad());
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(productos, fecha_caducidad);
    }
}
