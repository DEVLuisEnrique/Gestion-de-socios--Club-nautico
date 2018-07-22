
package Login;

import ConexionDB.ClassConexion;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Vusuario extends javax.swing.JDialog {
    //DefaultTableModel modelo = new DefaultTableModel();
    ClassConexion conex = new ClassConexion();
    
        Statement sentencia;
        Connection con=null;
        ResultSet r;
    public Vusuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.white);
       
        
        con = conex.getConnection();
       /*String titulos[] = 
            {   "Codigos",
                "Nombre",
               "Apellidos",
               "Telefono",
               "Email",
               "Usuario",
               "Clave"

            };
      modelo.setColumnIdentifiers(titulos);
      JTTablaUsuario.setModel(modelo);
        
      try
        {
            sentencia = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
        }
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en la sentencia");
        }
      
      
      try
        {
           ResultSet r = sentencia.executeQuery("Select * from RegistroUsuarios");
           String filas[] = new String[7];
           while(r.next())
            {
                filas[0] = r.getString("Codigos");
                filas[1] = r.getString("Nombre");
                filas[2] = r.getString("Apellidos");
                filas[3] = r.getString("Telefono");
                filas[4] = r.getString("Email");
                filas[5] = r.getString("Usuario");
                filas[6] = r.getString("Clave");
                modelo.addRow(filas);
            }
           JTTablaUsuario.setModel(modelo);
        }
      catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Error al extraer datos de la DB"); 
        }*/
       
       PropiedadesTabla(); 
        
    }
    
    
   public void PropiedadesTabla()
        {
             String titulos[] = 
            {   "Codigos",
                "Nombre",
               "Apellidos",
               "Telefono",
               "Email",
               "Usuario",
               "Clave"

            };
            DefaultTableModel modelo = new DefaultTableModel(null,titulos);
           JTTablaUsuario.setModel(modelo);
            
       try {
           sentencia =con.createStatement();
           r = sentencia.executeQuery("Select * From RegistroUsuarios");
           
            String filas[] = new String[7];
           while(r.next())
            {
                filas[0] = r.getString("Codigos");
                filas[1] = r.getString("Nombre");
                filas[2] = r.getString("Apellidos");
                filas[3] = r.getString("Telefono");
                filas[4] = r.getString("Email");
                filas[5] = r.getString("Usuario");
                filas[6] = r.getString("Clave");
                modelo.addRow(filas);
            }
           JTTablaUsuario.setModel(modelo);
            
       } catch (Exception  ex) {
           JOptionPane.showMessageDialog(null, "Error al mostrar los datos.", "AVISO", JOptionPane.PLAIN_MESSAGE);
       }
        
        
        } 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTTablaUsuario = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTTablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTTablaUsuario);

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminar.setText("Eliminar usuario");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("<Volver Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Colsuta Usuarios Registrados");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Digite Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneliminar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        
        vlogin vl = new vlogin();
        vl.setLocationRelativeTo(null);
        vl.setTitle("Login - Gestion de socios-Club nautico");
        vl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        try
            {
                con = conex.getConnection();
                Statement st = con.createStatement();
                String sql = "DELETE From RegistroUsuarios WHERE Codigos="+txtcodigo.getText();
               
                st.executeUpdate(sql);
                
                
                
                JOptionPane.showMessageDialog(null, "Eliminacion sastifactoria",null,JOptionPane.PLAIN_MESSAGE);
                
                 PropiedadesTabla(); 
                 txtcodigo.setText("");
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al intentar eliminar los datos",null,JOptionPane.ERROR_MESSAGE);
            }
        
    
        
    }//GEN-LAST:event_btneliminarActionPerformed

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vusuario dialog = new Vusuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTTablaUsuario;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
