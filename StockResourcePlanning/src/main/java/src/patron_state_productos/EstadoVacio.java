/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.patron_state_productos;

import javax.swing.JOptionPane;
import src.patron_factory_method_productos.Producto;

/**
 *
 * @author cris
 */
public class EstadoVacio implements EstadoProducto {

    @Override
    public void ejecutarModificacionUnidades(Producto p) {
        EstadoProducto lleno = new EstadoLleno();
        EstadoProducto neutro = new EstadoNeutro();

        if (p.getUnidades() > 0 && p.getUnidades() < p.getUnidadesMaximas()) {
            JOptionPane.showMessageDialog(null, "Stock actual del producto: "+p.getUnidades()+" unidades. Estado Neutro","Correcto!", JOptionPane.INFORMATION_MESSAGE);
            p.setEstadoActual(neutro);
        } else if (p.getUnidades() == p.getUnidadesMaximas()) {
            JOptionPane.showMessageDialog(null, "Stock actual del producto: "+p.getUnidades()+" unidades. Estado Lleno","Correcto!", JOptionPane.INFORMATION_MESSAGE);
            p.setEstadoActual(lleno);
        } else if(p.getUnidades()==0) {
            JOptionPane.showMessageDialog(null, "Stock actual del producto: "+p.getUnidades()+" unidades. Estado Vacio","Correcto!", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
