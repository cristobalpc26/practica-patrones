/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.patron_strategy_empleados;

import java.util.ArrayList;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public interface Estrategia {
    public void ordena(ArrayList<Empleado> empleados);
}
