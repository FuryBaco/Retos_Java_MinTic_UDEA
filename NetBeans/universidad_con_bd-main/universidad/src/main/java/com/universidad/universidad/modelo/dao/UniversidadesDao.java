
package com.universidad.universidad.modelo.dao;

import com.universidad.universidad.modelo.Universidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UniversidadesDao extends Universidades {
    //ATRIBUTOS
    private Connection conn;
    
    //CONSTRUCTORES
    
    public UniversidadesDao(String nombre, String nit, String direccion, String email) {
        super(nombre, nit, direccion, email);
        conn = null;
    }

    public UniversidadesDao(Connection conn, String nombre, String nit, String direccion, String email) {
        super(nombre, nit, direccion, email);
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void setConn(Connection conn) {
        this.conn = conn;
    }

  
    //-------QUERIES--------
    /**
     * Método para insertar una universidad en la base de datos,
     * retorna un booleano (true si realiza la inserción y false en caso contrario)
     * @return 
     */
    public boolean insert(){
        boolean insert = false;
        if(conn != null){
          try{
            //PREPARAR consulta SQL (para evitar sql injection)
            String query = "INSERT INTO universidades(nit, nombre, direccion, email) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            //Setear consulta SQL (reemplazar los signos de interrogación)
            pst.setString(1, getNit());
            pst.setString(2, getNombre());
            pst.setString(3, getDireccion());
            pst.setString(4, getEmail());
            //EJECUTAR CONSULTA
            insert = pst.executeUpdate() == 1 ? true : false;
            }catch(SQLException e){
                e.printStackTrace();
            }  
        }
        
        return insert;
    }
    
    public static ResultSet selectAll(Connection conn){
        ResultSet result = null;
        try{
           String query = "SELECT * FROM universidades";
           //Crear objeto para ejecutar consultas SQL
           Statement st = conn.createStatement();
           //Ejecutar consulta
           result = st.executeQuery(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static ResultSet selectByNit(Connection conn, String nit){
        ResultSet result = null;
        try{
            String query = "SELECT * FROM universidades WHERE nit = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, nit);
            result = pst.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
    
    
    
    
  /**
   * NOTA: NO CONCATENAR DIRECTAMENTE LAS VARIABLES EN UNA CONSULTA SQL PORQUE 
   * PRESENTARÍA VULNERABILIDAD DE SQL INJECTION:
   * 
   * String user = "admin";
   * String password = " \" OR 1=1# ";
   * 
   * SELECT * FROM users WHERE user = "admin" AND pass = ' ' OR 1=1# '
   * 
   */ 
  
    
}
