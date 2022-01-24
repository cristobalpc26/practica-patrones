/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_iterator;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class AgregadoEmpleados implements Agregado {
    // Lista de elementos a recorrer.

    public ArrayList empleados;

    /**
     * Constructor.
     *
     * @param vec Lista de elementos a recorrer.
     */
    public AgregadoEmpleados(ArrayList vec) {
        empleados = vec;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorEmpleados(this);
    }
}

