/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.gestor_bd;

import src.users.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author cris
 */
public class ServidorBD implements ServicioBD {

    private Connection con;
    private Statement set;
    private ResultSet rs;

    public void abrirConexion() {
        //String sURL = "jdbc:odbc:mvc";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/stockManager", "app", "app");
            System.out.println("Se ha conectado a la base de datos");
        } catch (Exception e) {
            System.out.println("No se ha conectado a la base de datos");
        }
    }

    public void cerrarConexion() {
        try {
            con.close();
        } catch (Exception e) {
        }
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
    public void getEmpleado(String login, String passwd) {
    }

}
