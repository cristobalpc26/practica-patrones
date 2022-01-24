/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_proxy;

import java.util.ArrayList;
import src.patron_iterator.IteradorEmpleados;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public class ProxyGestorBD implements ServicioBD{
    private static ProxyGestorBD instancia = new ProxyGestorBD();
    private ServicioBD serv;
    
    private ProxyGestorBD() {
        this.serv = new ServidorBD();
    }

    public static ProxyGestorBD getInstancia() {
        return instancia;
    } 
    
    @Override
    public void insertarEmpleado(Empleado e) {
        this.serv.insertarEmpleado(e);
    }

    @Override
    public void eliminarEmpleado(String dni) {
        this.serv.eliminarEmpleado(dni);
    }

    @Override
    public void modificarEmpleado(Empleado e) {
        this.serv.modificarEmpleado(e);
    }

    @Override
    public String getDniEmpleado(String login, String passwd) {
        return this.serv.getDniEmpleado(login, passwd);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return this.serv.getEmpleados();
    }
   
}
