/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.users;

import java.util.ArrayList;
import src.fachada.GestionEmpleados;
import src.fachada.GestionAdminProductos;
import src.patron_iterator.AgregadoEmpleados;
import src.patron_iterator.IteradorEmpleados;
import src.patron_proxy.ProxyGestorBD;

/**
 *
 * @author cris
 */
public class Administrador extends Persona {

    // Patron Singleton
    private static Administrador instancia = new Administrador();
    private GestionEmpleados gemp;
    private GestionAdminProductos gprod;

    public ArrayList<Empleado> empleados;
    private String login;
    private String password;

    public Administrador() {
        this.gemp = new GestionEmpleados();
        this.gprod = new GestionAdminProductos();

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
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

}
