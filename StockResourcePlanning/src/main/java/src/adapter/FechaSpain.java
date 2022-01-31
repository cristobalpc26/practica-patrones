/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

/**
 *
 * @author Carlos
 */
public class FechaSpain {

    private String dia;
    private String mes;

    private String anyo;

    public FechaSpain(String dia, String mes, String anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Constructor
     *
     * @param date Fecha en formato de USA: MM,DD,AAAA.
     */
    public FechaSpain(String date) {
        String[] st = date.split("/");
        String dd = st[0];
        String mm = st[1];
        String aa = st[2];

        this.dia = dd;
        this.mes = mm;
        this.anyo = aa;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anyo;
    }

}
