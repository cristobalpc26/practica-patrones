/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.gestor_bd;

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
    
    public void getDniEmpleado(String login, String passwd);
}
