package ConexionDB;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClassConexion {
    Connection con = null;
    Statement sentencia;
    
    public ClassConexion()
        {
            try
                {
                    con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\L.Enrique\\Documents\\NetBeansProjects\\JAVA Orientado a Objeto\\Gestion de Barcos\\GestionBarcoSistema.accdb");
                    sentencia = con.createStatement();
                     //JOptionPane.showMessageDialog(null, "Conexion a la base de datos Exitosa ");
                }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Conexion a DB erronea "+e);
                }
        
        }
    public Connection getConnection()
        {
        
        return  con;
        }
    
    
}
