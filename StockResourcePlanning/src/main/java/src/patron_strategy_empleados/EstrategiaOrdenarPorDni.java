/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class EstrategiaOrdenarPorDni implements Estrategia{
    @Override
    public void ordena(ArrayList<Empleado> empleados) {
             //Comparador para ordenar los alumnos por su nombre
        Comparator dni = (Comparator) (Object o1, Object o2) -> {
            Empleado e1 = (Empleado) o1;
            Empleado e2 = (Empleado) o2;
            
            return e1.getDni().compareTo(e2.getDni());
        };

        //Ordenamos los objetos del array por el atributo nombre
        Collections.sort(empleados, dni);
    }
}
