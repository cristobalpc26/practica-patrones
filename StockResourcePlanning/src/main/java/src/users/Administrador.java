/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.users;

import java.util.ArrayList;
import src.patron_iterator.AgregadoEmpleados;
import src.patron_iterator.IteradorEmpleados;
import src.patron_proxy.ProxyGestorBD;

/**
 *
 * @author cris
 */
public class Administrador extends Persona{
    // Patron Singleton
    private static Administrador instancia = new Administrador();
    private ProxyGestorBD proxy;
    public ArrayList<Empleado> empleados;
    private String login;
    private String password;
    
    private Administrador() {
        this.proxy = ProxyGestorBD.getInstancia();
        this.empleados = proxy.getEmpleados();
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Administrador getInstancia() {
        return instancia;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    @Override
    public void registrarEmpleado (Empleado e) {
        this.proxy.insertarEmpleado(e);
    }
    
    @Override
    public void eliminarEmpleado (String dni) {
        this.proxy.eliminarEmpleado(dni);
    }
    
    @Override
    public void modificarEmpleado (Empleado e) {
        this.proxy.modificarEmpleado(e);
    }
    
    //TODO: Metodos de administrador
    
    
}