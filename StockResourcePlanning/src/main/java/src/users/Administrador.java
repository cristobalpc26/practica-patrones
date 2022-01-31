/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.users;

import java.util.ArrayList;
import src.fachada.FachadaAdminSRP;

/**
 *
 * @author cris
 */
public class Administrador extends Persona {

   
    private FachadaAdminSRP fachada;
    
    public ArrayList<Empleado> empleados;
    private String login;
    private String password;

    public Administrador() {
        this.fachada =  new FachadaAdminSRP();
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

 
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
