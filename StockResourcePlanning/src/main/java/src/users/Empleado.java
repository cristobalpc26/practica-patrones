/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.users;

/**
 *
 * @author cris
 */
public class Empleado extends Persona{
    
    public Empleado(String dni, String nombre, String apellidos, String correo, String password, String horario, String telefono, String categoria) {
        super(dni, nombre, apellidos, correo, password, horario, telefono, categoria);
    }

    @Override
    public void registrarEmpleado(Empleado e) {
    }

    @Override
    public void eliminarEmpleado(String dni) {
    }

    @Override
    public void modificarEmpleado(Empleado e) {
    }
    
}
