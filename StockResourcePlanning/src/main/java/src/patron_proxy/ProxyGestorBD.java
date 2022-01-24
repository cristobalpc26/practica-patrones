/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_proxy;

import src.users.Empleado;

/**
 *
 * @author cris
 */
public class ProxyGestorBD implements ServicioBD{
    private ServicioBD serv;
    
    public ProxyGestorBD(ServicioBD servi) {
        this.serv = servi;
    }

    @Override
    public void insertarEmpleado(Empleado e) {
    }

    @Override
    public void eliminarEmpleado(String dni) {
    }

    @Override
    public void modificarEmpleado(Empleado e) {
    }

    @Override
    public String getDniEmpleado(String login, String passwd) {
        return this.serv.getDniEmpleado(login, passwd);
    }
   
}
