package ventanaPrincipal;

import ConexionDB.ClassConexion;
import Login.vlogin;
import java.awt.Color;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VGestionPricipal extends javax.swing.JDialog implements Runnable{
    LocalDate fecha = LocalDate.now();//Declaracion del metodo fecha
  // LocalTime hora  =LocalTime.now();
   String hora1,minuto,segundo,ampm;
   Calendar calendario;
   Thread h1;
 
    public VGestionPricipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        h1 = new Thread(this);
        h1.start();
        
       JLUsuario.setText(vlogin.txtusuario.getText());
        //color del formulario principal
        this.getContentPane().setBackground(Color.white);
        //Hora y fecha
        JLFecha.setText(fecha.toString());
       // JLHora.setText(hora.toString());
        
        //Cargar imagen del login
        try
            {
              Icon VGestionPricipal= new ImageIcon(getClass().getResource("/Imagenes/SGB1.png"));  //direccion de la imagen
              JLImagen.setIcon(VGestionPricipal);
            
            }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Imagen no encotrada", "AVISO", HEIGHT);//msg en caso de que no se haya encotrado la imagen
                }
       
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        JLHora = new javax.swing.JLabel();
        JLFecha = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistrarCliente = new javax.swing.JMenuItem();
        MenuVerRegistro = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hora:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Bienvenido:");

        JLUsuario.setText("Usuario");

        JLFecha.setText("Fecha");

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jMenu1.setText("Administrador");

        MenuRegistrarCliente.setText("Registrar Socio");
        MenuRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistrarCliente);

        MenuVerRegistro.setText("Consultar");
        MenuVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVerRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVerRegistro);

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("Informacion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(JLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(JLUsuario)
                    .addComponent(JLHora)
                    .addComponent(JLFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        
        int op = JOptionPane.showConfirmDialog(null,"Quieres salir del sistema?");
        
        if(op==JOptionPane.OK_OPTION)
            {
                
                JOptionPane.showMessageDialog(null,"Gracias por usar\nEl sistema de gestion de socios_Club Nautico.","Aviso",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                
            }
        else if(op==JOptionPane.NO_OPTION )
            {
               JOptionPane.showMessageDialog(null,"Bienvenido nuevamente");
            }
        else if(op==JOptionPane.CANCEL_OPTION )
            {
               JOptionPane.showMessageDialog(null,"Cancelado");
            }
        
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarClienteActionPerformed
        vRegistoSocios dialog = new vRegistoSocios(new javax.swing.JFrame(), true);
        dispose();
        dialog.setTitle("Registro de socios");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_MenuRegistrarClienteActionPerformed

    private void MenuVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVerRegistroActionPerformed
        versocios dialog = new versocios(new javax.swing.JFrame(), true);
        dispose();
        dialog.setTitle("Ver socios-barcos");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_MenuVerRegistroActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        
        this.setVisible(false);
        vlogin vl = new vlogin();
        vl.setLocationRelativeTo(null);
        vl.setTitle("Login - Gestion de socios-Club nautico");
        vl.setVisible(true);
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      vAyuda dialog = new vAyuda(new javax.swing.JFrame(), true);
      dialog.setLocationRelativeTo(null);
      dialog.setTitle("INFORMACION");
      dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(VGestionPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGestionPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGestionPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGestionPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VGestionPricipal dialog = new VGestionPricipal(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLHora;
    private javax.swing.JLabel JLImagen;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JMenuItem MenuRegistrarCliente;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenuItem MenuVerRegistro;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         Thread ct = Thread.currentThread();
      
      while(ct==h1)
        {
            calcula();
            JLHora.setText(hora1+":"+minuto+":"+segundo+" "+ampm);
            try
                {
                  Thread.sleep(1000);
                }
            catch(Exception e)
                    {
                    
                    }
        } 
    }
    private void calcula() {
        
        Calendar calendario = new GregorianCalendar();
        Date FHA = new Date();
        
        calendario.setTime(FHA);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM"))
            {
                int h= calendario.get(Calendar.HOUR_OF_DAY)-12;
                hora1=h>9?""+h:"0"+h;
            }
        else
            {
                hora1= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
            }
        
        minuto = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
         segundo = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
