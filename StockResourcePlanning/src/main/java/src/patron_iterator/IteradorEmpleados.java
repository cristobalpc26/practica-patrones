/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.patron_iterator;

/**
 *
 * @author Carlos
 */
public class IteradorEmpleados  implements Iterador {

    private AgregadoEmpleados agregado;
    // Indica la posición actual en la lista.
    private int indice = 0;

    /**
     * Constructor.
     *
     * @param agregado Agregado concreto.
     */
    public IteradorEmpleados(AgregadoEmpleados agregado) {
        this.agregado = agregado;
    }

    @Override
    public Object primero() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (!agregado.empleados.isEmpty()) {
            indice = 0;
            objeto = agregado.empleados.get(0);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public Object siguiente() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.empleados.size()) {
            objeto = agregado.empleados.get(indice);
            indice++;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    @Override
    public boolean hayMas() {
        boolean resultado = true;
        if (agregado.empleados.isEmpty() || indice == agregado.empleados.size()) {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public Object elementoActual() throws IndexOutOfBoundsException {
        Object objeto = null;
        if (indice < agregado.empleados.size()) {
            objeto = agregado.empleados.get(indice);
        } else {
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }
}
