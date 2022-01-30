/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.fachada;

import src.patron_proxy.ProxyGestorBD;
import src.users.Empleado;

/**
 *
 * @author Carlos
 */
public class GestionEmpleados {
    private ProxyGestorBD pbd = ProxyGestorBD.getInstancia();
    
    public void insertarEmpleado(Empleado e){
        pbd.insertarEmpleado(e);
    }
    public void modificarEmpleado(Empleado e){
        pbd.modificarEmpleado(e);
    }
    public void eliminarEmpleado(String dni){
        pbd.eliminarEmpleado(dni);
        
    }
      public void consultarHistorial(){
        pbd.devolverHistorial();
        
    }
}
