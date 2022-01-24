/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.users;

/**
 *
 * @author Carlos
 */
public abstract class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    private String horario;
    private String telefono;
    private String categoria;

    public Persona(String dni, String nombre, String apellidos, String correo, String contraseña, String horario, String telefono, String categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.horario = horario;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    // TODO: Añadir producto, etc.
}
