/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.interfaces_graficas.BuscarProductoEmpleado;
import src.interfaces_graficas.HomeInicio;
import java.io.IOException;
import java.util.ArrayList;
import src.patron_iterator.Agregado;
import src.patron_iterator.AgregadoEmpleados;
import src.patron_iterator.Iterador;
import src.patron_proxy.ProxyGestorBD;
import src.patron_proxy.ServidorBD;
import src.patron_strategy_empleados.Contexto;
import src.patron_strategy_empleados.Estrategia;
import src.patron_strategy_empleados.EstrategiaOrdenarPorDni;
import src.patron_strategy_empleados.EstrategiaOrdenarPorNombre;
import src.users.Administrador;
import src.users.Empleado;

/**
 *
 * @author Carlos
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    
    private static BuscarProductoEmpleado ejecucion;
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Administrador a = Administrador.getInstancia();
        Contexto contexto = new Contexto(new EstrategiaOrdenarPorDni(), a.empleados);
        contexto.ejecutaEstrategia();
        /*try {
            // Crea la lista. 
            ArrayList aux = new ArrayList();
            Empleado uni1 = new Empleado("12345678", "Pepe", "Informática", "Alcalá","a","a","a","a");
            Empleado uni2 = new Empleado("48438979", "Cristina", "Farmacia", "Complutense","a","a","a","a");
            Empleado uni3 = new Empleado("62654698", "David", "Medicina", "Alcalá","a","a","a","a");
            Empleado uni4 = new Empleado("75542987", "Laura", "Derecho", "Carlos III","a","a","a","a");
            aux.add(uni1);
            aux.add(uni2);
            aux.add(uni3);
            aux.add(uni4);

            // Crea el agregado.
            Agregado agregado = new AgregadoEmpleados(aux);
            // Crea el iterador.
            Iterador iterador = agregado.crearIterador();

            // Recorre la lista con el iterador.
            while (iterador.hayMas()) {
                Empleado uni = (Empleado) iterador.elementoActual();
                System.out.println(uni.toString());
                iterador.siguiente();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        }*/
        
    }
    
}
