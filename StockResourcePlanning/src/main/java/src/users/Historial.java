/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.users;

import java.sql.Timestamp;

/**
 *
 * @author Carlos
 */
public class Historial {
    private String dni;
    private String id_producto;
    private int Unidades;
    private Timestamp hora_modificacion;

    public Historial(String dni, String id_producto, int Unidades, Timestamp hora_modificacion) {
        this.dni = dni;
        this.id_producto = id_producto;
        this.Unidades = Unidades;
        this.hora_modificacion = hora_modificacion;
    }

    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public Timestamp getHora_modificacion() {
        return hora_modificacion;
    }

    public void setHora_modificacion(Timestamp hora_modificacion) {
        this.hora_modificacion = hora_modificacion;
    }
    
    
}
