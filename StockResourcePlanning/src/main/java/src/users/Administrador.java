/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.users;

/**
 *
 * @author cris
 */
public class Administrador {
    // Patron Singleton
    private static Administrador instancia = new Administrador();
    private String login;
    private String password;
    
    private Administrador() {
    }

    public Administrador(String login, String password) {
        this.login = login;
        this.password = password;
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
    
    public void registrarEmpleado () {
        
    }
    
    public String eliminarEmpleado (String dni) {
        return dni;
    }
    
    public void modificarEmpleado (String dni) {
        
    }
    
    //TODO: Metodos de administrador
}