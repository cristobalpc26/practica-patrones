/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.patron_proxy;

import java.util.ArrayList;
import src.users.Empleado;

/**
 *
 * @author cris
 */
public interface ServicioBD {

    /**
     * Inserta un empleado en la base de datos.
     *
     * @param e Empleado a insertar
     */
    public void insertarEmpleado(Empleado e);

    public void eliminarEmpleado(String dni);

    public void modificarEmpleado(Empleado e);
    
    public String getDniEmpleado(String login, String passwd);
    
    // Admin 
    
    public ArrayList<Empleado> getEmpleados();
    
}
