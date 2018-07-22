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
                   String sql="jdbc:sqlserver://localhost:1433;databaseName=GestionSociosClub;IntegratedSecurity=true";
                   con=DriverManager.getConnection(sql);
                  // JOptionPane.showMessageDialog(null, "Conexion a la base de datos Exitosa ");
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
