package conexiones;
//importacion de las librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class conexion {
    
    static Connection contacto=null;
    
    public Connection getConexion(){
        
    String driver="com.mysql.jdbc.Driver";
    String coneccion="jdbc:mysql://localhost/lucary";
    String usuario="root";
    String contra="";
    
    try{
        Class.forName(driver);
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"Driver no encontrado");
    }
     
    try{
      contacto=DriverManager.getConnection(coneccion,usuario,contra);}
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Conexion fallida en la BD");}
     return contacto;
   }
    public Statement createStatement(){
    throw new UnsupportedOperationException("No soportado");
    }
    public ResultSet consulta(String cadena){
    Connection con =getConexion();
    Statement declara;
    try{
      declara=con.createStatement();
      ResultSet respuesta=declara.executeQuery(cadena);
      return respuesta;
    }catch(SQLException e){
         JOptionPane.showMessageDialog(null,"Error de consulta\n"+ e);
    }
    return null;
    }
    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}