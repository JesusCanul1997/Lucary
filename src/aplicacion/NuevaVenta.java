
package aplicacion;

import conexiones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class NuevaVenta extends javax.swing.JFrame {

   conexion con =new conexion();
   Connection cn =con.getConexion();
   static double total=0;
   private final int idseg;
    
    public NuevaVenta(int idseg) {
        initComponents();
        this.idseg=idseg;
     

    }

    private NuevaVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
       

           
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        preciop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Buscarproducto = new javax.swing.JButton();
        idp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpu = new javax.swing.JTextField();
        ap = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        nv = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        PT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        confi = new javax.swing.JButton();
        marcap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tipop = new javax.swing.JTextField();
        ump = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        borrardatos = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        rp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Venta");

        jLabel2.setText("Nombre Producto");

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

        jLabel3.setText("Precio");

        preciop.setEditable(false);
        preciop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciopActionPerformed(evt);
            }
        });

        jLabel4.setText("UM");

        Buscarproducto.setText("BUSCAR PRODUCTO"); // NOI18N
        Buscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarproductoActionPerformed(evt);
            }
        });

        idp.setEditable(false);

        jLabel5.setText("ID Producto");

        jLabel6.setText("BUSQUEDA DE PRODUCTO ");

        jLabel7.setText("ESPECIFICACION DE LA VENTA");

        jLabel8.setText("CANTIDAD DE PRODUCTO");

        cpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuActionPerformed(evt);
            }
        });
        cpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpuKeyTyped(evt);
            }
        });

        ap.setText("AGREGAR");
        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Articulo", "Marca", "Precio Unitario", "Unidades", "Sub-Total"
            }
        ));
        jScrollPane2.setViewportView(nv);

        jLabel9.setText("INFORMACION DE LA VENTA");

        PT.setEditable(false);
        PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTActionPerformed(evt);
            }
        });

        jLabel10.setText("PRECIO TOTAL");

        confi.setText("CONFIRMAR VENTA");
        confi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confiActionPerformed(evt);
            }
        });

        marcap.setEditable(false);

        jLabel11.setText("Marca");

        tipop.setEditable(false);

        ump.setEditable(false);

        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        borrardatos.setText("BORRAR DATOS");
        borrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrardatosActionPerformed(evt);
            }
        });

        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jLabel13.setText("Reserva");

        rp.setEditable(false);

        jLabel14.setText("tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(46, 46, 46)
                            .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(ap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confi, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(preciop, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ump, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marcap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(borrardatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Buscarproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Buscarproducto)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrardatos)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(consultar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(preciop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ap)
                    .addComponent(jButton3))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confi)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(11, 11, 11)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preciopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciopActionPerformed

    private void BuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarproductoActionPerformed
     String nom=nombrep.getText();
     try {
            String sql="SELECT * FROM productos WHERE NombreProducto='"+nom+"'";
            String datos[] = new String[7];
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
             datos[0]=rs.getString(1);//id
             datos[1]=rs.getString(2);//nombre
             datos[2]=rs.getString(3);//tipo
             datos[3]=rs.getString(4);//marca
             datos[4]=rs.getString(5);//um
             datos[5]=rs.getString(6);//unidades
             datos[6]=rs.getString(7);//precio
             
             idp.setText(datos[0]);
             preciop.setText(datos[6]);
             ump.setText(datos[4]);
             marcap.setText(datos[3]);
             tipop.setText(datos[2]);
             rp.setText(datos[5]);
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }//GEN-LAST:event_BuscarproductoActionPerformed

    private void PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTActionPerformed

    private void cpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpuActionPerformed

    private void borrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrardatosActionPerformed
             idp.setText("");
             preciop.setText("");
             ump.setText("");
             marcap.setText("");
             tipop.setText("");
             nombrep.setText("");
             rp.setText("");
             
        
    }//GEN-LAST:event_borrardatosActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
              ConsultaProducto ln = new ConsultaProducto();
              ln.setVisible(true);
              ln.setTitle("Productos");
              ln.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apActionPerformed
        
       //datoto BD
       String NN=String.valueOf(cpu.getText());
       if(!"".equals(NN)){
       DefaultTableModel modelo=(DefaultTableModel)nv.getModel();
       int dipo=Integer.parseInt(rp.getText());
       //dato 
       
       int cant=Integer.parseInt(cpu.getText());
       if (cant>dipo){
           JOptionPane.showMessageDialog(null, "CANTIDAD DE PRODUCTO NO DISPONIBLE","Cantidad Invalida",JOptionPane.DEFAULT_OPTION);
       }
       if(cant<=dipo){
          
          if(dipo>=1 && cant>0){
                  
            Object datos[]=new Object[6];

             datos[0]=idp.getText();
             datos[1]=nombrep.getText();
             datos[2]=marcap.getText();
             datos[3]=preciop.getText();
             datos[4]=String.valueOf(cant);
             double p=Double.parseDouble(preciop.getText());
             double sub=cant*p;
             datos[5]=String.valueOf(sub);
             modelo.addRow(datos);
             total+=sub; 
             
             idp.setText("");
             preciop.setText("");
             ump.setText("");
             marcap.setText("");
             tipop.setText("");
             nombrep.setText("");
             rp.setText("");
             cpu.setText("");
             PT.setText(String.valueOf(total));
             
          }//fin 2do if
          
          else{
          JOptionPane.showMessageDialog(null, "PRODUCTO NO DISPONIBLE O iNGRESE CORRECTAMENTE LAS UNIDADES SOLICITADAS","Producto Agotado",JOptionPane.DEFAULT_OPTION);
          }//fin else
        
       }//fin 1er if
       
       }else{
       JOptionPane.showMessageDialog(null, "Ingrese el numero de unidades a vender","Datos Incorrectos",JOptionPane.DEFAULT_OPTION);
       }
        

    }//GEN-LAST:event_apActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     DefaultTableModel model = (DefaultTableModel) nv.getModel(); 

        int a = nv.getSelectedRow(); 

          if (a<0){

        JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla" );  

        }else {
       int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el registro? ");

            if(JOptionPane.OK_OPTION==confirmar) {   
                    String to=String.valueOf(nv.getValueAt(a,5)); 
                    double s=Double.parseDouble(to);
                     
                    total-=s;
                    PT.setText(String.valueOf(total));
                    model.removeRow(a);
                    JOptionPane.showMessageDialog(null,"Registro Eliminado" );
                    
                  
             
             }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void confiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confiActionPerformed
    for (int i = 0; i < nv.getRowCount(); i++) {
         int cbd=0; //stock-unidades a vender
         String idto=String.valueOf(nv.getValueAt(i,0)); //ide
         String univen=String.valueOf(nv.getValueAt(i,4)); //unidades a vender
         int s=Integer.parseInt(idto); 
         int UV=Integer.parseInt(univen);//numventa
         
         try{
           String sql="SELECT NumUnidades FROM productos WHERE id_Producto='"+s+"'";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            String xe=rs.getString("NumUnidades");
            cbd=Integer.parseInt(xe);//numstock
            }
        
          } catch (SQLException ex) {
            Logger.getLogger(ConsultaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            int NewNU=cbd-UV;
            String sql="UPDATE productos SET NumUnidades='"+NewNU+"' where id_producto='"+idto+"'";
            PreparedStatement st=cn.prepareStatement(sql);
            st.executeUpdate();
                  
          } catch (SQLException ex) {
            Logger.getLogger(ConsultaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    
    try {
            PreparedStatement psd=cn.prepareStatement("INSERT INTO registroventa(id_empleado,id_producto,FechaVenta,MontoTotal) VALUES (?,?,?,?)");
           
           
          
            psd.setString(1,String.valueOf(idseg));
            psd.setString(2,"18");
            psd.setString(3,"2019-05-28");
            psd.setString(4,String.valueOf(total));

            psd.executeUpdate();
                                     
        } //fin del try
           catch (SQLException ex) {
            Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }//fin del catch
    
    JOptionPane.showMessageDialog(null,"SE ha guardado el registro en la BD");
    total=0;
    
    }//GEN-LAST:event_confiActionPerformed

    private void nombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrepActionPerformed

    private void cpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpuKeyTyped
        char x=evt.getKeyChar();
          if(cpu.getText().length()>8){
            evt.consume();  
        }
         if(!Character.isDigit(x)){
            evt.consume(); 
        }
    }//GEN-LAST:event_cpuKeyTyped

    private void nombrepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrepKeyTyped
        char x=evt.getKeyChar();
        if(nombrep.getText().length()>20){
            evt.consume();  
        }
      
    }//GEN-LAST:event_nombrepKeyTyped

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
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 new NuevaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarproducto;
    private javax.swing.JTextField PT;
    private javax.swing.JButton ap;
    private javax.swing.JButton borrardatos;
    private javax.swing.JButton confi;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField cpu;
    private javax.swing.JTextField idp;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marcap;
    private javax.swing.JTextField nombrep;
    private javax.swing.JTable nv;
    private javax.swing.JTextField preciop;
    private javax.swing.JTextField rp;
    private javax.swing.JTextField tipop;
    private javax.swing.JTextField ump;
    // End of variables declaration//GEN-END:variables

}
