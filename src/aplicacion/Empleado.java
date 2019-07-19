
package aplicacion;

import java.awt.Image;
import java.awt.Toolkit;

public class Empleado extends javax.swing.JFrame {

    private final int id;

   
    public Empleado(int id) {
        initComponents();
        this.id=id;
    }

    private Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Image getIconImage(){
   Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
   return retValue;
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuRoot = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        ConsultarVenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ConsultarProductos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        SalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuRoot.setBackground(new java.awt.Color(0, 153, 153));
        MenuRoot.setPreferredSize(new java.awt.Dimension(347, 35));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        jMenu2.setText("Ventas");
        jMenu2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        NuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new16.png"))); // NOI18N
        NuevaVenta.setText("Nueva Venta");
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        jMenu2.add(NuevaVenta);

        ConsultarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/see16.png"))); // NOI18N
        ConsultarVenta.setText("Consultar Ventas");
        ConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(ConsultarVenta);

        MenuRoot.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jMenu1.setText("Productos");

        ConsultarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/see16.png"))); // NOI18N
        ConsultarProductos.setText("Consultar Productos");
        ConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProductosActionPerformed(evt);
            }
        });
        jMenu1.add(ConsultarProductos);

        MenuRoot.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir16.png"))); // NOI18N
        jMenu5.setText("Salir");

        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        CerrarSesion.setText("Cerrar sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jMenu5.add(CerrarSesion);

        SalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        SalirSistema.setText("Salir de Lucary");
        SalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSistemaActionPerformed(evt);
            }
        });
        jMenu5.add(SalirSistema);

        MenuRoot.add(jMenu5);

        setJMenuBar(MenuRoot);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
         NuevaVenta n = new NuevaVenta(id);
         n.setVisible(true);
         n.setTitle("Nueva Venta");
         n.setLocationRelativeTo(null);
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        login log = new login();
        log.setVisible(true);
        log.setTitle("LOGIN");
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void SalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSistemaActionPerformed
        CerrarSistema log=new CerrarSistema();
        log.setVisible(true);
        log.setTitle("LOGIN");
        log.setLocationRelativeTo(null);
    }//GEN-LAST:event_SalirSistemaActionPerformed

    private void ConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarVentaActionPerformed
      ConsultaVentas ln = new ConsultaVentas();
      ln.setVisible(true);
      ln.setTitle("Registros de Ventas");
      ln.setLocationRelativeTo(null);

    }//GEN-LAST:event_ConsultarVentaActionPerformed

    private void ConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProductosActionPerformed
              ConsultaProducto ln = new ConsultaProducto();
              ln.setVisible(true);
              ln.setTitle("Productos");
              ln.setLocationRelativeTo(null);
    }//GEN-LAST:event_ConsultarProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenuItem ConsultarProductos;
    private javax.swing.JMenuItem ConsultarVenta;
    private javax.swing.JMenuBar MenuRoot;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuItem SalirSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
