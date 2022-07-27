package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    String bd = "escuela";
    String url = "jdbc:mysql://localhost:3306/escuela?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user = "root";
    String password = "Dm14Yt05Ja20";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;

   // public Conexion() {
   //}
    
   public Connection conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto a base de datos");
                    } catch (ClassNotFoundException | SQLException ex) {
                        System.out.println("No se pudo conectar");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
        
}
  /*  public static void main(String args[]) {
       Conexion conn = new Conexion();
       Connection conexion = conn.conectar();
   } */
}


