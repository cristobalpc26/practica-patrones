/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.adapter;

import java.util.StringTokenizer;

/**
 *
 * @author Carlos
 */

//Se va a adaptar la fecha introducida en formato español (dd/mm/yyyy) a formato Date (yyyy-mm-dd) de Java

//Usaremos el patron Adapter cuando el usuario va a realizar una búsqueda del producto por fecha de caducidad. La fecha introducida
// se va a adaptar al formato date para que los resultados se muestren en la tabla de las interfaces BuscarProductoAdmin y BuscarProductoEmpleado 
public class AdaptadorFechaDate implements Fecha{

    private FechaSpain fps;

    public AdaptadorFechaDate(FechaSpain fsp) {
        this.fps = fsp;
    }

    @Override
    public String toString() {
        StringTokenizer st = new StringTokenizer(fps.toString(), "/");
        String dd = st.nextToken();
        String mm = st.nextToken();
        String aaaa = st.nextToken();

        return aaaa + "-" + mm + "-" + dd; //Devuelve el formato que queremos dar a la fecha española
    }

    @Override
    public String getAnyo() {
        return this.fps.getAnyo();
    }

    @Override
    public void setAnyo(String anyo) {
        this.fps.setAnyo(anyo);
    }

    @Override
    public String getMes() {
        return this.fps.getMes();
    }

    @Override
    public void setMes(String mes) {
        this.fps.setMes(mes);
    }

    @Override
    public String getDia() {
        return this.fps.getDia();
    }

    @Override
    public void setDia(String dia) {
        this.fps.setDia(dia);
    }

    


}
