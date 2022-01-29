/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import src.patron_factory_method_productos.Producto;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class ContextoEmpleados {
    private EstrategiaEmpleados estrategia;
    private ArrayList<Empleado> empleados; // Lista de empleados.

    public ContextoEmpleados(EstrategiaEmpleados e, ArrayList<Empleado> empleados) {
        this.estrategia = e;
        this.empleados = empleados;
    }

   

 
    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(EstrategiaEmpleados e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public void ejecutaEstrategiaEmpleados() {
        estrategia.ordenaEmpleados(empleados);
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
      
}
