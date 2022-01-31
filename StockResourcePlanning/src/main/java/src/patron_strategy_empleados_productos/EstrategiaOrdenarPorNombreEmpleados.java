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
public class EstrategiaOrdenarPorNombreEmpleados implements EstrategiaEmpleados {

    @Override
    public void ordenaEmpleados(ArrayList<Empleado> empleados) {
        //Comparador para ordenar los empleados por su nombre
        Comparator nombre = (Comparator) (Object o1, Object o2) -> {
            Empleado e1 = (Empleado) o1;
            Empleado e2 = (Empleado) o2;

            return e1.getNombre().compareTo(e2.getNombre());
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(empleados, nombre);
    }

   

}
