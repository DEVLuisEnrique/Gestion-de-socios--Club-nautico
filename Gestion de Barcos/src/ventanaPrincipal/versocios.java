
package ventanaPrincipal;

import ConexionDB.ClassConexion;
import java.awt.Color;
import static java.awt.Frame.NORMAL;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class versocios extends javax.swing.JDialog {
//DefaultTableModel modelo = new DefaultTableModel();
ClassConexion conex = new ClassConexion();
    Connection con;
   Statement orden; 
   ResultSet r;
    public versocios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        con = conex.getConnection();
        jComboBox1.addItem("");
        txtnombre.setEditable(false);
        txttelefono.setEditable(false);
        txtapellidos.setEditable(false);
        txtcedula.setEditable(false);
        txtcodigo.setEditable(false);
        this.getContentPane().setBackground(Color.white);  
        PropiedadesTabla();
        registrocombox();
        
     
    }
    
 public void PropiedadesTabla()
        {
            String titulos[]=
                {   
                    "Codigo",
                    "Nombre",
                    "Matricula de barco",
                    "Nombre de barco",
                    "Numero de amarre",
                    "Cuota",
                    "Destino",
                    "Fecha de salida",
                    "Fecha de llegada"
                };
            DefaultTableModel modelo = new DefaultTableModel(null,titulos);
            JTTabla.setModel(modelo);
            
       try {
           orden =con.createStatement();
           r = orden.executeQuery("Select * From RegistroSocios");
           
           while(r.next())
            {
                Object filas[]=
                    {   r.getString("Codigos"),
                        r.getString("Nombre"),
                        r.getString("Matricula_Barco"),
                        r.getString("Nombre_Barco"),
                        r.getString("Numero_Amarre"),
                        r.getString("Cuota"),
                        r.getString("Destino"),
                        r.getString("Fecha_salida"),
                        r.getString("Fecha_llegada")
                    };
                         modelo.addRow(filas);
                    }
                JTTabla.setModel(modelo);
            
       } catch (Exception  ex) {
           JOptionPane.showMessageDialog(null, "Error al mostrar los datos.", "AVISO", JOptionPane.PLAIN_MESSAGE);
       }
        
        
        }
public void registrocombox()
    {
       try {
           orden =con.createStatement();
           r = orden.executeQuery("Select * from RegistroSocios");
           
           while(r.next())
            {
              jComboBox1.addItem(r.getString("Codigos"));
              //jComboBox1.addItem(r.getString("Nombre"));
            }
           
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"error"+ ex);
       }
        
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnvolver = new javax.swing.JButton();
        txtapellidos = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtfiltro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        txtsalida = new javax.swing.JTextField();
        txtllegada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione socio: ");

        JTTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTTabla);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Datos de socio");

        btnvolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnvolver.setText("<volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Cedula:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Tel/Cel:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Gestion General");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel15.setText("Filtrar por nombre:");

        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfiltroKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEliminar.setText("Eliminar ");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        btnModifica.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnModifica.setText("Modificar");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("?");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnModifica)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar)
                    .addComponent(btnModifica)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Fecha de salida");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Fecha de llegada");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Destino");

        txtdestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnvolver)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(179, 179, 179)
                                        .addComponent(jLabel5)
                                        .addGap(180, 180, 180)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(418, 418, 418)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(73, 73, 73))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(63, 63, 63)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8))
                                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel10))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnvolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtllegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
                dispose();
                VGestionPricipal dialog = new VGestionPricipal(new javax.swing.JFrame(), true);
                dialog.setLocationRelativeTo(null);
                dialog.setTitle("Gestion de socios");
                dialog.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
       con = conex.getConnection();
       if(con!=null){
            try {
               orden = con.createStatement();
               r =orden.executeQuery("Select * From RegistroSocios Where Codigos="+jComboBox1.getSelectedItem());
              // r =orden.executeQuery("Select * From RegistroSocios Where Nombre="+jComboBox1.getSelectedItem());
               if(r.next())
                {
                 txtcodigo.setText(r.getString("Codigos"));
                 txtsalida.setText(r.getString("Fecha_Salida"));
                 txtllegada.setText(r.getString("Fecha_llegada"));
                 txtdestino.setText(r.getString("Destino"));
                 txtnombre.setText(r.getString("Nombre"));
                 txtapellidos.setText(r.getString("Apellidos"));
                 txtcedula.setText(r.getString("Cedula"));
                 txttelefono.setText(r.getString("Telefono"));
                 
                 String titulos[]=
                {   
                    "Codigo",
                    "Nombre",
                    "Matricula de barco",
                    "Nombre de barco",
                    "Numero de amarre",
                    "Cuota",
                    "Destino",
                    "Fecha de salida",
                    "Fecha de llegada"
                };
                 
                 
            DefaultTableModel modelo = new DefaultTableModel(null,titulos);
                Object filas[]=
                    {   r.getString("Codigos"),
                        r.getString("Nombre"),
                        r.getString("Nombre_Barco"),
                        r.getString("Numero_Amarre"),
                        r.getString("Cuota"),
                        r.getString("Destino"),
                        r.getString("Fecha_salida"),
                        r.getString("Fecha_llegada")
                    };
                
                         modelo.addRow(filas);
                    
                JTTabla.setModel(modelo);
                 
                }
           
            } catch (SQLException ex) {
               System.out.println("");
           }
       } 
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtfiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyReleased
       filtrarNombre(txtfiltro.getText().trim());
    }//GEN-LAST:event_txtfiltroKeyReleased

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        
        if(txtcodigo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Seleccione socio!");
            }
        else
            {
              String Option[] ={"Editar","Cancelar"};
              int eleccion;
                eleccion = JOptionPane.showOptionDialog(null, "Quieres editar el registro? ","Edicion", WIDTH, HEIGHT, null, Option, NORMAL);
                
                if(eleccion==JOptionPane.YES_OPTION)
                    {
                        //-----------CODIGO SQL----------------
                            con = conex.getConnection();
                            if(con!=null)
                                {
                                try {
                                    orden =con.createStatement();//String sql="Update RegistroSocios Set Fecha_salida='"+txtsalida.getText()+"',"
                                           // + "Fecha_llegada='"+txtllegada.getText()+"',Destino='"+txtdestino.getText()+"' Where Codigo="+txtcodigo.getText()+"";
                                    String sql="Update RegistroSocios Set Fecha_salida='"+txtsalida.getText()+"',"
                                            + "Fecha_llegada='"+txtllegada.getText()+"',Destino='"+txtdestino.getText()+"' Where Codigos='"+txtcodigo.getText()+"'";
                                    orden.executeUpdate(sql);
                                    JOptionPane.showMessageDialog(null,"Editado");
                                    PropiedadesTabla();
                                    txtnombre.setText("");
                                    txtapellidos.setText("");
                                    txtcedula.setText("");
                                    txttelefono.setText("");
                                    txtcodigo.setText("");
                                    txtsalida.setText("");
                                    txtllegada.setText("");
                                    txtdestino.setText("");
                                } catch (SQLException ex) {
                                    
                                    JOptionPane.showMessageDialog(null,"Error al editar"+ex);
                                }
                                    
                                }
                            
                        
                        //---------------------------
                             
                    }
                else
                    {
                        if(eleccion == JOptionPane.NO_OPTION)
                            {
                             JOptionPane.showMessageDialog(null,"Registro no editado");
                            }
                    }
            
            }
        
        
        
    }//GEN-LAST:event_btnModificaActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       
        if(txtcodigo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Seleccione codigo de socio!");
            }
        else
            {
              String Option[] ={"Eliminar","Cancelar"};
              int eleccion;
                eleccion = JOptionPane.showOptionDialog(null, "Quieres eliminar el registro? ","ELIMINAR", WIDTH, HEIGHT, null, Option, NORMAL);
                
                if(eleccion==JOptionPane.YES_OPTION)
                    {
                        //-----------CODIGO SQL----------------
                            con = conex.getConnection();
                            if(con!=null)
                                {
                                try {
                                    orden =con.createStatement();
                                    String sql ="DELETE From RegistroSocios where Codigos="+this.jComboBox1.getSelectedItem();
                                    orden.executeUpdate(sql);
                                    JOptionPane.showMessageDialog(null,"Eliminado");
                                    PropiedadesTabla();
                                    txtnombre.setText("");
                                    txtapellidos.setText("");
                                    txtcedula.setText("");
                                    txttelefono.setText("");
                                    txtcodigo.setText("");
                                    txtsalida.setText("");
                                    txtllegada.setText("");
                                    txtdestino.setText("");
                                } catch (SQLException ex) {
                                    
                                    JOptionPane.showMessageDialog(null,"Error al eliminar"+ex);
                                }
                                    
                                }
                            
                        
                        //---------------------------
                             
                    }
                else
                    {
                        if(eleccion == JOptionPane.NO_OPTION)
                            {
                             JOptionPane.showMessageDialog(null,"Registro no ELIMINADO");
                            }
                    }
            
            }
        
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, "Los campos que solo se pueden modificar son:\n"
               + "Fecha de salida\nFecha de llegada\nDestino\n"
               + "Si estos campos esta <<NULL>> el barco se encuentra en estado de amarre.", "Ayuda", WIDTH);
    }//GEN-LAST:event_jButton1ActionPerformed
   
   
    public void filtrarNombre(String name)
        {
       try {
           orden= con.createStatement();
           //filtar nombre de la base de datos
           String cod = "Select * From RegistroSocios Where Nombre LIKE '%"+txtfiltro.getText().trim()+"%' ";
           r = orden.executeQuery(cod);
                 String titulos[]=
                {
                    "Codigo",
                    "Nombre",
                    "Nombre de barco",
                    "Numero de amarre",
                    "Cuota",
                    "Destino",
                    "Fecha de salida",
                    "Fecha de llegada"
                };
            DefaultTableModel modelo = new DefaultTableModel(null,titulos);
            JTTabla.setModel(modelo);
    
           
           while(r.next())
            {
                Object filas[]=
                    {
                       r.getString("Codigos"),
                        r.getString("Nombre"),
                        r.getString("Nombre_Barco"),
                        r.getString("Numero_Amarre"),
                        r.getString("Cuota"),
                        r.getString("Destino"),
                        r.getString("Fecha_salida"),
                        r.getString("Fecha_llegada"),
                       
                       
                    };
                modelo.addRow(filas);
               }
                       
                JTTabla.setModel(modelo);
                
       } catch (SQLException ex) {
           Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
       }
            
        }
    
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
            java.util.logging.Logger.getLogger(versocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(versocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(versocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(versocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                versocios dialog = new versocios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTable JTTabla;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnvolver;
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtfiltro;
    private javax.swing.JTextField txtllegada;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsalida;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
