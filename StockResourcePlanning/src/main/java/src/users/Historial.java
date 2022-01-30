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
   private String id_producto;
   private int unidadesRepuestas;
   private Timestamp hora_modificacion;
    private int stockFinal;

    public Historial(String id_producto, int unidadesRepuestas, Timestamp hora_modificacion, int stockFinal) {
        this.id_producto = id_producto;
        this.unidadesRepuestas = unidadesRepuestas;
        this.hora_modificacion = hora_modificacion;
        this.stockFinal = stockFinal;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getUnidadesRepuestas() {
        return unidadesRepuestas;
    }

    public void setUnidadesRepuestas(int unidadesRepuestas) {
        this.unidadesRepuestas = unidadesRepuestas;
    }

    public Timestamp getHora_modificacion() {
        return hora_modificacion;
    }

    public void setHora_modificacion(Timestamp hora_modificacion) {
        this.hora_modificacion = hora_modificacion;
    }

    public int getStockFinal() {
        return stockFinal;
    }

    public void setStockFinal(int stockFinal) {
        this.stockFinal = stockFinal;
    }
    
}

