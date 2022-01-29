/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaces_graficas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import src.Validaciones;
import src.fachada.FachadaSRP;
import src.patron_proxy.ProxyGestorBD;
import src.users.Empleado;

/**
 *
 * @author Carlos
 */
public class RegistrarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarProducto
     */
    private FachadaSRP fachada = new FachadaSRP();
        private ProxyGestorBD sbd = ProxyGestorBD.getInstancia();

    private HomeAdmin ha;


    public RegistrarEmpleado(HomeAdmin HA) {
        initComponents();
        setTitle("Registro de Empleado");
        this.ha = HA;
        setLocationRelativeTo(null);

    }
        public String getDNIregistrar() {
        return jTextFieldDniARegistrar.getText();
    }

    public String getNombreRegistrar() {
        return jTextFieldNombreARegistrar.getText();
    }

    public String getApellidosRegistrar() {
        return jTextFieldApellidosARegistrar.getText();
    }

    public String getCorreoRegistrar(){
        return jTextFieldCorreoARegistrar.getText();
    }

    public String getContraseñaRegistrar() {
        return jTextFieldContraseñaARegistrar.getText();
    }

    public String getHorarioRegistrar() {
        return (String) jComboBoxHorarioRegistro.getSelectedItem();
    }

    public String getTelefonoRegistrar() {
        return jTextFieldTelefonoARegistrar.getText();
    }

    public String getCategoriaARegistrar() {
        return (String) jComboBoxCategoriaRegistro.getSelectedItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolverAtrasRegistrarEmpleado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefonoARegistrar = new javax.swing.JTextField();
        jTextFieldDniARegistrar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreARegistrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldApellidosARegistrar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContraseñaARegistrar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldCorreoARegistrar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVolverAtrasRegistrarProducto = new javax.swing.JButton();
        jButtonRegistrarDatosEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxCategoriaRegistro = new javax.swing.JComboBox<>();
        jComboBoxHorarioRegistro = new javax.swing.JComboBox<>();

        jButtonVolverAtrasRegistrarEmpleado.setBackground(new java.awt.Color(255, 102, 102));
        jButtonVolverAtrasRegistrarEmpleado.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonVolverAtrasRegistrarEmpleado.setText("Atrás");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DNI");

        jTextFieldTelefonoARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jTextFieldDniARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextFieldDniARegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniARegistrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Categoria");

        jTextFieldNombreARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Horario");

        jTextFieldApellidosARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        jTextFieldContraseñaARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("Registro de empleado");

        jTextFieldCorreoARegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");

        jButtonVolverAtrasRegistrarProducto.setBackground(new java.awt.Color(255, 102, 102));
        jButtonVolverAtrasRegistrarProducto.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonVolverAtrasRegistrarProducto.setText("Atrás");
        jButtonVolverAtrasRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAtrasRegistrarProductoActionPerformed(evt);
            }
        });

        jButtonRegistrarDatosEmpleado.setBackground(new java.awt.Color(51, 153, 0));
        jButtonRegistrarDatosEmpleado.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonRegistrarDatosEmpleado.setText("Insertar");
        jButtonRegistrarDatosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarDatosEmpleadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono");

        jComboBoxCategoriaRegistro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBoxCategoriaRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        jComboBoxCategoriaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaRegistroActionPerformed(evt);
            }
        });

        jComboBoxHorarioRegistro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBoxHorarioRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde" }));
        jComboBoxHorarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVolverAtrasRegistrarProducto)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCorreoARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldTelefonoARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldDniARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellidosARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextFieldContraseñaARegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jComboBoxCategoriaRegistro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxHorarioRegistro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistrarDatosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDniARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidosARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCorreoARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContraseñaARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHorarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefonoARegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarDatosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButtonVolverAtrasRegistrarProducto))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDniARegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniARegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniARegistrarActionPerformed

    private void jComboBoxCategoriaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaRegistroActionPerformed

    private void jComboBoxHorarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorarioRegistroActionPerformed

    private void jButtonVolverAtrasRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAtrasRegistrarProductoActionPerformed
     this.setVisible(false);
       ha.setVisible(true);
    }//GEN-LAST:event_jButtonVolverAtrasRegistrarProductoActionPerformed

    private void jButtonRegistrarDatosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarDatosEmpleadoActionPerformed
        ArrayList<String> listaDNI = sbd.getDNIEmpleados();
         Empleado e = new Empleado(getDNIregistrar(), getNombreRegistrar(), getApellidosRegistrar(), getCorreoRegistrar(), getContraseñaRegistrar(),
                getHorarioRegistrar(), getTelefonoRegistrar(), getCategoriaARegistrar());
         
         
        if (getDNIregistrar().isEmpty() || getNombreRegistrar().isEmpty() || getApellidosRegistrar().isEmpty() ||  getCorreoRegistrar().isEmpty() ||getContraseñaRegistrar().isEmpty() 
                || getHorarioRegistrar().isEmpty() || getTelefonoRegistrar().isEmpty() || getCategoriaARegistrar().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campos vacios, rellene todos", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (Validaciones.esValidoNumeroTelefono(getTelefonoRegistrar()) == false) {
            JOptionPane.showMessageDialog(null, "Numero de telefono Incorrecto", "Error Telefono!", JOptionPane.ERROR_MESSAGE);
        }else if(Validaciones.validarDNI(getDNIregistrar()) == false){
            JOptionPane.showMessageDialog(null, "Numero de DNI Incorrecto", "Error DNI!", JOptionPane.ERROR_MESSAGE);
        }else if(listaDNI.contains(getDNIregistrar())){
            JOptionPane.showMessageDialog(null, "DNI'S duplicados", "Error DNI!", JOptionPane.ERROR_MESSAGE);
        }else if(Validaciones.validarCorreo(getCorreoRegistrar()) == false){
            JOptionPane.showMessageDialog(null, "El correo debe estar bien escrito", "Error Correo!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            fachada.insertarEmpleado(e);
            JOptionPane.showMessageDialog(null, "Empleado registrado", "Correcto!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            ha.setVisible(true);

        }
        
        
    }//GEN-LAST:event_jButtonRegistrarDatosEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarDatosEmpleado;
    private javax.swing.JButton jButtonVolverAtrasRegistrarEmpleado;
    private javax.swing.JButton jButtonVolverAtrasRegistrarProducto;
    public javax.swing.JComboBox<String> jComboBoxCategoriaRegistro;
    public javax.swing.JComboBox<String> jComboBoxHorarioRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApellidosARegistrar;
    private javax.swing.JTextField jTextFieldContraseñaARegistrar;
    private javax.swing.JTextField jTextFieldCorreoARegistrar;
    private javax.swing.JTextField jTextFieldDniARegistrar;
    private javax.swing.JTextField jTextFieldNombreARegistrar;
    private javax.swing.JTextField jTextFieldTelefonoARegistrar;
    // End of variables declaration//GEN-END:variables
}
