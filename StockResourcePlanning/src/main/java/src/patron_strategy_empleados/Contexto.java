/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class Contexto {
    private Estrategia estrategia;
    private ArrayList<Empleado> empleados; // Lista de alumnos.

    public Contexto(Estrategia e, ArrayList<Empleado> empleados) {
        this.estrategia = e;
        this.empleados = empleados;
    }

    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(Estrategia e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public void ejecutaEstrategia() {
        estrategia.ordena(empleados);
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getDni());
        }
    }
}
