
package Login;
import java.sql.*;
import ConexionDB.ClassConexion;
import javax.swing.JOptionPane;

public class ValidarLogin {
  
 ClassConexion con = new ClassConexion();
   
    
    
public int validar_ingreso()
    {
    
        String usuario = Login.vlogin.txtusuario.getText();
        String clave = String.valueOf(Login.vlogin.txtclave.getPassword());
    
        int resultado=0;
        String sql="Select * From RegistroUsuarios Where Usuario='"+usuario+"' and Clave=('"+clave+"')";
        Connection conect=null;
        try {
        conect = con.getConnection();
        Statement st = conect.createStatement();
            ResultSet rs;
            rs= st.executeQuery(sql);
            
           if(rs.next())
            {
                resultado=1;
            } 
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario no registrado!", "aviso", JOptionPane.ERROR_MESSAGE);
        }
        //Cerrar coneccion
        /*finally
            {
                try {
                    conect.close();
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error de desconeccion", "aviso", JOptionPane.ERROR_MESSAGE);
                }
            }*/
        
        
      return resultado;  
    }       
    
    
    
    
}
