package Login;

import ConexionDB.ClassConexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ventanaPrincipal.VGestionPricipal;
import Login.ValidarLogin;

public class vlogin extends javax.swing.JFrame {

    Connection con = null;
    ClassConexion conex = new ClassConexion();
    ValidarLogin metodos = new ValidarLogin();
    
    Statement st;
    ResultSet r;
    
    public vlogin() {
        initComponents();
        con = conex.getConnection();

        this.getContentPane().setBackground(Color.WHITE);

        try//Cargar imagen del login
        {
            Icon vlogin = new ImageIcon(getClass().getResource("/Imagenes/login1.png"));  //direccion de la imagen
            JLImagen.setIcon(vlogin);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imagen no encotrada", "AVISO", HEIGHT);//msg en caso de que no se haya encotrado la imagen
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLError = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        btniniciar = new javax.swing.JButton();
        btnregistrarse = new javax.swing.JButton();
        JLImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAdm = new javax.swing.JMenu();
        MenuUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de gestion de socios de club nautico");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario:");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clave:");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JLError.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        JLError.setForeground(new java.awt.Color(255, 0, 0));
        JLError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLError.setText("Bienvenido");
        JLError.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btniniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btniniciar.setText("Iniciar sesion");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        btnregistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregistrarse.setText("Registrarse");
        btnregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarseActionPerformed(evt);
            }
        });

        JLImagen.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        JLImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        MenuAdm.setText("Mantenimiento");

        MenuUsuario.setText("Consultar Usuarios");
        MenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarioActionPerformed(evt);
            }
        });
        MenuAdm.add(MenuUsuario);

        jMenuBar1.add(MenuAdm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusuario)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btniniciar)
                    .addComponent(btnregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(JLError, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btniniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrarse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(JLError)
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        
           
       if(metodos.validar_ingreso()==1)
        {
            dispose();
            VGestionPricipal dialog = new VGestionPricipal(new javax.swing.JFrame(), true);
            dialog.setLocationRelativeTo(null);
            dialog.setTitle("Gestion de socios");
            dialog.setVisible(true);
        }
       else
        {
            
            JLError.setText("Error de inicio de sesion revise los campos!");
            txtclave.setText("");
            txtusuario.setText("");
        }
       


    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarseActionPerformed
        VRegistro dialog = new VRegistro(new javax.swing.JFrame(), true);
        dispose();
        dialog.setLocationRelativeTo(null);
        dialog.setTitle("Registro de usuario");
        dialog.setVisible(true);


    }//GEN-LAST:event_btnregistrarseActionPerformed

    private void MenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarioActionPerformed
        Vusuario dialog = new Vusuario(new javax.swing.JFrame(), true);
        dispose();
        dialog.setLocationRelativeTo(null);
        dialog.setTitle("Administrador de usuarios");
        dialog.setVisible(true);
    }//GEN-LAST:event_MenuUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(vlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLError;
    private javax.swing.JLabel JLImagen;
    private javax.swing.JMenu MenuAdm;
    private javax.swing.JMenuItem MenuUsuario;
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnregistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JPasswordField txtclave;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
