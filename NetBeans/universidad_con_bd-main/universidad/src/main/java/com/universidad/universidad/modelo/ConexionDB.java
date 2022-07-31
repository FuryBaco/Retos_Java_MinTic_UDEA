
package com.universidad.universidad.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    //ATRIBUTO
    private Connection conexion;
    
    //CONSTRUCTOR
    public ConexionDB(){
        try{
            /*conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad_udea" +
                                   "user=root&password=root");
*/
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad_udea", "root", "root");
            if(conexion != null){
                System.out.println("Conexión exitosa a la base de datos");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //CONSULTOR
    public Connection getConexion(){
        return conexion;
    }
    
    //ACCIONES
    public void cerrarConexion() throws SQLException{
        conexion.close();
    }
}
