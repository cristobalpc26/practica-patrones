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
    // Primer Patron
    private static Administrador instancia = new Administrador();

    private Administrador() {
    }

    public static Administrador getInstancia() {
        return instancia;
    }
    
    //TODO: Metodos de administrador
}