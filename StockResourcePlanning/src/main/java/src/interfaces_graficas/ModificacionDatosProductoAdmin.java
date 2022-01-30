/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaces_graficas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.Validaciones;
import src.fachada.FachadaAdminSRP;
import src.patron_factory_method_productos.Categoria;
import src.patron_factory_method_productos.FabricaCategoria;
import src.patron_factory_method_productos.Producto;
import src.patron_proxy.ProxyGestorBD;

/**
 *
 * @author Carlos
 */
public class ModificacionDatosProductoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ModificacionDatosEmpleado
     */
    private FachadaAdminSRP fachada = new FachadaAdminSRP();
    private ProxyGestorBD sbd = ProxyGestorBD.getInstancia();

    private FabricaCategoria fcat = new FabricaCategoria();
    private BuscarProductoAdmin bp;

    public ModificacionDatosProductoAdmin(BuscarProductoAdmin BP) {
        this.bp = BP;
        initComponents();
        setTitle("Modificación de Datos del Producto");
        setLocationRelativeTo(null);
    }

    public String getIDaModificar() {
        return jTextFieldIdProductoAModificar.getText();
    }

    public String getCategoriaModificar() {
        return (String) jComboBoxCategoriaAmodificarProducto.getSelectedItem();
       
    }

    public String getNombreModificar() {
        return jTextFieldNombreProductoModificar.getText();
    }

    public String getMarcaModificar() {
        return jTextFieldMarcaProductoAModificar.getText();
    }

    public String getPrecioModificar() {
        return jTextFieldPrecioProductoAModificar.getText();
    }

    public String getUnidadesModificar() {
        return jTextFieldUnidadesAModificarProductoAdmin.getText();
    }

    public String getProcedenciaModificar() {
        return jTextFieldProcedenciaProductoAModificar.getText();
    }

    public String getFechaLlegadaModificar() {
        return jTextFieldFechaLlegadaProductoAModificar.getText();
    }

    public String getFechaCaducidadModificar() {
        return jTextFieldFechaCaducidadProductoAModificar.getText();
    }

    public String getLocalizacionModificar() {
        return jTextFieldFechaLocalizacionProductoAModificar.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldMarcaProductoAModificar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldNombreProductoModificar = new javax.swing.JTextField();
        jTextFieldUnidadesAModificarProductoAdmin = new javax.swing.JTextField();
        jTextFieldPrecioProductoAModificar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonActualizarDatosEmpleado = new javax.swing.JButton();
        jTextFieldFechaCaducidadProductoAModificar = new javax.swing.JTextField();
        jTextFieldFechaLlegadaProductoAModificar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldProcedenciaProductoAModificar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldFechaLocalizacionProductoAModificar = new javax.swing.JTextField();
        jTextFieldIdProductoAModificar = new javax.swing.JTextField();
        jButtonVolverAtrasModificarProductoAdmin = new javax.swing.JButton();
        jComboBoxCategoriaAmodificarProducto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldMarcaProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("Modificación de producto");

        jTextFieldNombreProductoModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextFieldUnidadesAModificarProductoAdmin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextFieldPrecioProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Precio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id del producto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Unidades");

        jButtonActualizarDatosEmpleado.setBackground(new java.awt.Color(255, 153, 0));
        jButtonActualizarDatosEmpleado.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonActualizarDatosEmpleado.setText("Actualizar");
        jButtonActualizarDatosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarDatosEmpleadoActionPerformed(evt);
            }
        });

        jTextFieldFechaCaducidadProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextFieldFechaLlegadaProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de llegada");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Procedencia");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de caducidad");

        jTextFieldProcedenciaProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Localizacion");

        jTextFieldFechaLocalizacionProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextFieldIdProductoAModificar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButtonVolverAtrasModificarProductoAdmin.setBackground(new java.awt.Color(255, 102, 102));
        jButtonVolverAtrasModificarProductoAdmin.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonVolverAtrasModificarProductoAdmin.setText("Atrás");
        jButtonVolverAtrasModificarProductoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAtrasModificarProductoAdminActionPerformed(evt);
            }
        });

        jComboBoxCategoriaAmodificarProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBoxCategoriaAmodificarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verduras", "Frutas", "Pescado", "Carne", "Pollo", "Embutidos", "Lacteos", "Dulces", "Bebidas", "Especias", "Salsas ", "Pasta ", "Snacks ", "Postres", "Otros ", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolverAtrasModificarProductoAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIdProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldNombreProductoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPrecioProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldUnidadesAModificarProductoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMarcaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldFechaLlegadaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldFechaCaducidadProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldProcedenciaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldFechaLocalizacionProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCategoriaAmodificarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonActualizarDatosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxCategoriaAmodificarProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreProductoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarcaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecioProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUnidadesAModificarProductoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProcedenciaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaLlegadaProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaCaducidadProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFechaLocalizacionProductoAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarDatosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverAtrasModificarProductoAdmin)
                .addGap(32, 32, 32))
        );

        jTextFieldIdProductoAModificar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverAtrasModificarProductoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAtrasModificarProductoAdminActionPerformed
        this.setVisible(false);
        bp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverAtrasModificarProductoAdminActionPerformed

    private void jButtonActualizarDatosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarDatosEmpleadoActionPerformed
        DateFormat forma = new SimpleDateFormat("yyyy" + '-' + "MM" + '-' + "dd");
        Date fechaCaducidadParseada, fechaLlegadaParseada, fechaActualParseada;


        if (getIDaModificar().isEmpty() || getCategoriaModificar().isEmpty() || getNombreModificar().isEmpty() || getMarcaModificar().isEmpty()
                || getPrecioModificar().isEmpty() || getUnidadesModificar().isEmpty() || getProcedenciaModificar().isEmpty()
                || getFechaLlegadaModificar().isEmpty() || getFechaCaducidadModificar().isEmpty() || getLocalizacionModificar().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campos vacios, rellene todos", "Error!", JOptionPane.ERROR_MESSAGE);
        }  else if (Validaciones.validarFecha(getFechaLlegadaModificar()) == false) {
            JOptionPane.showMessageDialog(null, "Formato Fecha llegada incorrecto", "Fecha llegada!", JOptionPane.ERROR_MESSAGE);
        } else if (Validaciones.validarFecha(getFechaCaducidadModificar()) == false) {
            JOptionPane.showMessageDialog(null, "Formato Fecha caducidad incorrecto", "Fecha caducidad!", JOptionPane.ERROR_MESSAGE);

        } else if (Validaciones.validarSoloNumerosPrecios(getPrecioModificar()) == false) {
            JOptionPane.showMessageDialog(null, "Solo escriba numeros decimales separado con un punto", "Precio!", JOptionPane.ERROR_MESSAGE);
        } else if (Validaciones.validarSoloNumerosUnidades(getUnidadesModificar()) == false) {
            JOptionPane.showMessageDialog(null, "Solo escriba numeros enteros", "Unidades!", JOptionPane.ERROR_MESSAGE);

        } else {
            //Aplicacion del FactoryMethod donde se crea el objteo categoria y se inserta el empleado obteniendo el nombre de la categoria del objeto creado.

            try {
                fechaCaducidadParseada = (Date) forma.parse(getFechaCaducidadModificar());
                fechaLlegadaParseada = (Date) forma.parse(getFechaLlegadaModificar());
                Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
                String fechaActual = forma.format(fecha);
                int unidadesParseadas = Integer.parseInt(getUnidadesModificar());
                fechaActualParseada = (Date) forma.parse(fechaActual);

                if (fechaLlegadaParseada.compareTo(fechaCaducidadParseada) > 0) {

                    JOptionPane.showMessageDialog(null, "La fecha de llegada tiene que ser menor O o igual que la de caducidad", "Fechas!", JOptionPane.ERROR_MESSAGE);
                } else if (fechaLlegadaParseada.compareTo(fechaActualParseada) < 0 || fechaCaducidadParseada.compareTo(fechaActualParseada) < 0) {
                    JOptionPane.showMessageDialog(null, "Las fechas tienen que ser mayores o iguales que la actual", "Fechas!", JOptionPane.ERROR_MESSAGE);

                } else if (unidadesParseadas < 0 || unidadesParseadas > 100) {

                    JOptionPane.showMessageDialog(null, "El número de unidades tiene que estar entre 0 y 100", "Unidades!", JOptionPane.ERROR_MESSAGE);

                } else {
                    Double precioDouble = Double.parseDouble(getPrecioModificar());
                    int unidadesInt = Integer.parseInt(getUnidadesModificar());

                    Categoria categoriaCreada = fcat.crearCategoria(getCategoriaModificar().trim());

                    // Si la categoria concreta concuerda con la puesta se crea el objeto categoria y posteriormente el objeto producto
                    if (categoriaCreada.getNombre().equals(getCategoriaModificar())) {
                        Producto p = new Producto(getIDaModificar(), categoriaCreada.getNombre(), getNombreModificar(), getMarcaModificar(),
                                precioDouble, unidadesInt, getProcedenciaModificar(),
                                getFechaLlegadaModificar(), getFechaCaducidadModificar(), getLocalizacionModificar());

                        fachada.modificarProducto(p);
                        JOptionPane.showMessageDialog(null, "Producto actualizado", "Correcto!", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        bp.setVisible(true);
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButtonActualizarDatosEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarDatosEmpleado;
    private javax.swing.JButton jButtonVolverAtrasModificarProductoAdmin;
    public javax.swing.JComboBox<String> jComboBoxCategoriaAmodificarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldFechaCaducidadProductoAModificar;
    public javax.swing.JTextField jTextFieldFechaLlegadaProductoAModificar;
    public javax.swing.JTextField jTextFieldFechaLocalizacionProductoAModificar;
    public javax.swing.JTextField jTextFieldIdProductoAModificar;
    public javax.swing.JTextField jTextFieldMarcaProductoAModificar;
    public javax.swing.JTextField jTextFieldNombreProductoModificar;
    public javax.swing.JTextField jTextFieldPrecioProductoAModificar;
    public javax.swing.JTextField jTextFieldProcedenciaProductoAModificar;
    public javax.swing.JTextField jTextFieldUnidadesAModificarProductoAdmin;
    // End of variables declaration//GEN-END:variables
}
