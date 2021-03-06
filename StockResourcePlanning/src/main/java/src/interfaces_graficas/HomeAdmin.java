/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaces_graficas;

/**
 *
 * @author Carlos
 */
public class HomeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form homeEmpleado
     */
    private HomeInicio hi;

    private BuscarEmpleado be = new BuscarEmpleado(this);
    private RegistrarEmpleado re = new RegistrarEmpleado(this);
    private BuscarProductoAdmin bp = new BuscarProductoAdmin(this);
    private HistorialProducto hp = new HistorialProducto(this);
    private RegistrarProducto rp = new RegistrarProducto(this);

    public HomeAdmin(HomeInicio HI) {
        initComponents();
        this.hi = HI;
        setTitle("Página Principal de Administrador");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonRegistrarProducto = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVisualizarHistorialProducto = new javax.swing.JButton();
        jButtonBuscarEmpleados1 = new javax.swing.JButton();
        jButtonBuscarProductos = new javax.swing.JButton();
        jButtonAltaEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(619, 428));

        jButtonRegistrarProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonRegistrarProducto.setForeground(new java.awt.Color(0, 153, 51));
        jButtonRegistrarProducto.setText("Registrar Producto");
        jButtonRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProductoActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCerrarSesion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Seleccione la acción que quiera realizar");
        jLabel1.setToolTipText("");

        jButtonVisualizarHistorialProducto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonVisualizarHistorialProducto.setForeground(new java.awt.Color(0, 153, 51));
        jButtonVisualizarHistorialProducto.setText("Historial Producto");
        jButtonVisualizarHistorialProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarHistorialProductoActionPerformed(evt);
            }
        });

        jButtonBuscarEmpleados1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonBuscarEmpleados1.setText("Buscar Empleado");
        jButtonBuscarEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEmpleados1ActionPerformed(evt);
            }
        });

        jButtonBuscarProductos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonBuscarProductos.setForeground(new java.awt.Color(0, 153, 51));
        jButtonBuscarProductos.setText("Buscar Producto");
        jButtonBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductosActionPerformed(evt);
            }
        });

        jButtonAltaEmpleado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButtonAltaEmpleado.setText("Registrar Empleado");
        jButtonAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerrarSesion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizarHistorialProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonVisualizarHistorialProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(410, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarHistorialProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarHistorialProductoActionPerformed
       this.setVisible(false);
        this.hp.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarHistorialProductoActionPerformed

    private void jButtonBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductosActionPerformed
        this.setVisible(false);
        this.bp.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarProductosActionPerformed

    private void jButtonAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaEmpleadoActionPerformed
        this.setVisible(false);
        this.re.setVisible(true);
    }//GEN-LAST:event_jButtonAltaEmpleadoActionPerformed

    private void jButtonRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProductoActionPerformed
        this.setVisible(false);
        this.rp.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarProductoActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.setVisible(false);
        this.hi.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonBuscarEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEmpleados1ActionPerformed
        this.setVisible(false);
        this.be.setVisible(true);

    }//GEN-LAST:event_jButtonBuscarEmpleados1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaEmpleado;
    private javax.swing.JButton jButtonBuscarEmpleados1;
    private javax.swing.JButton jButtonBuscarProductos;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonRegistrarProducto;
    private javax.swing.JButton jButtonVisualizarHistorialProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
