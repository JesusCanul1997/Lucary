package aplicacion;

import conexiones.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NuevaProducto extends javax.swing.JFrame {

    conexion con =new conexion();
    Connection cn =con.getConexion();
    
    public NuevaProducto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombrep = new javax.swing.JTextField();
        unidadesp = new javax.swing.JTextField();
        preciop = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        marcap = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        medidap = new javax.swing.JComboBox<>();
        tipop = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Nuevo Producto");

        jLabel2.setText("TIPO PRODUCTO");

        jLabel3.setText("NOMBRE DEL PRODUCTO");

        jLabel4.setText(" CANTIDAD DE UNIDADES");

        jLabel5.setText("UNIDAD DE MEDIDA");

        jLabel6.setText("PRECIO UNITARIO");

        nombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrepActionPerformed(evt);
            }
        });
        nombrep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrepKeyTyped(evt);
            }
        });

        unidadesp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unidadespKeyTyped(evt);
            }
        });

        preciop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciopActionPerformed(evt);
            }
        });
        preciop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preciopKeyTyped(evt);
            }
        });

        jButton1.setText("AGREGAR PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("MARCA");

        marcap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcapKeyTyped(evt);
            }
        });

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        medidap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAJA ", "METRO", "KILO", "LITRO ", "GALON", "PIEZA", " " }));

        tipop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "construccion", "Madera", "Electricidad", "Herramientas", "Baño y fontanería", "Accesorios de Cocina", "Accesorios de Jardín", "Pintura", "Decoración", "Mobiliario y ordenación", "Climatización" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(74, 74, 74)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nombrep, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marcap, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadesp)
                                .addComponent(preciop)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(medidap, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(marcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(unidadesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(medidap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preciop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
        
        
        
        int numuni=Integer.parseInt(unidadesp.getText());
       float preciouni= Float.parseFloat(preciop.getText());
       String n=nombrep.getText();
       String m=marcap.getText();
       String nu=unidadesp.getText();
       String p=preciop.getText();
       
        if (!"".equals(n)&&!"".equals(m)&&!"".equals(nu)&&!"".equals(p)){
            
        try {
        String typeproducto=null;
        String unimed=null;
        
        
        
        int ip=tipop.getSelectedIndex();
        int um=medidap.getSelectedIndex();
        switch(ip){
            case 0:
               typeproducto="construccion";
               break; 
            case 1:
               typeproducto="madera";
               break; 
             case 2:
               typeproducto="Electricidad";
               break;
             case 3:
               typeproducto="Herramientas";
               break; 
             case 4:
               typeproducto="Baño y fontanería";
               break; 
             case 5:
               typeproducto="Accesorios de Cocina";
               break;
             case 6:
               typeproducto="Accesorios de Jardín";
               break; 
             case 7:
               typeproducto="Pintura";
               break;
              case 8:
               typeproducto="Decoración";
               break;
              case 9:
               typeproducto="Mobiliario y ordenación";
               break;
                case 10:
               typeproducto="Climatización";
               break;      
        }
        
        switch(um){
            case 0:
               unimed="caja";
               break; 
            case 1:
               unimed="Metro";
               break; 
             case 2:
               unimed="kilo";
               break;
             case 3:
               unimed="litro";
               break;  
             case 4:
               unimed="galon";
               break;
             case 5:
               unimed="pieza";
               break;  
            

        }
         
       
            PreparedStatement ps=cn.prepareStatement("INSERT INTO productos(NombreProducto,TipoProducto,MarcaProducto,TipoUnitario,NumUnidades,PrecioUnitario) VALUES (?,?,?,?,?,?)");
           
            ps.setString(1,n);
            ps.setString(2,typeproducto);
            ps.setString(3,m);
            ps.setString(4,unimed);
            ps.setInt(5,numuni);
            ps.setFloat(6, preciouni);
            ps.executeUpdate();
             
            JOptionPane.showMessageDialog(null,"Se ha agregado un nuevo producto al inventario\n","Registro Exitoso",JOptionPane.DEFAULT_OPTION);
            
            nombrep.setText("");
            marcap.setText("");
            unidadesp.setText("");
            preciop.setText("");
            
        }catch (SQLException ex) {
         Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,"Ha ingresado mal los datos");
        }catch(HeadlessException e){
        JOptionPane.showMessageDialog(null,"Ha ingresado mal los datos");
        }
       }else{
       JOptionPane.showMessageDialog(null,"Ingrese bien los datos\n");
            
       }//fin del esle
       
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"A ingresado mal los datos\n");
       }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrepActionPerformed

    private void preciopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void unidadespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unidadespKeyTyped
        char x=evt.getKeyChar();
        
        if(unidadesp.getText().length()>8){
            evt.consume();
            
        }
        
         if(!Character.isDigit(x)){
            evt.consume(); 
        }
    }//GEN-LAST:event_unidadespKeyTyped

    private void preciopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preciopKeyTyped
         char x=evt.getKeyChar();
        if(preciop.getText().length()>10){
            evt.consume();
            
        }
         if((x<'0'||x>'9')&&(x!='.')){
            evt.consume(); 
        }
    }//GEN-LAST:event_preciopKeyTyped

    private void nombrepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrepKeyTyped
        char x=evt.getKeyChar();
        if(nombrep.getText().length()>20){
            evt.consume();
            
        }
    }//GEN-LAST:event_nombrepKeyTyped

    private void marcapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcapKeyTyped
                char x=evt.getKeyChar();
        if(marcap.getText().length()>20){
            evt.consume();
            
        }
    }//GEN-LAST:event_marcapKeyTyped

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
            java.util.logging.Logger.getLogger(NuevaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NuevaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField marcap;
    private javax.swing.JComboBox<String> medidap;
    private javax.swing.JTextField nombrep;
    private javax.swing.JTextField preciop;
    private javax.swing.JComboBox<String> tipop;
    private javax.swing.JTextField unidadesp;
    // End of variables declaration//GEN-END:variables
}
