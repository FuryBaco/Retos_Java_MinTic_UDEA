
package com.universidad.universidad.controlador;

import com.universidad.universidad.modelo.ConexionDB;
import com.universidad.universidad.modelo.Universidades;
import com.universidad.universidad.modelo.dao.UniversidadesDao;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UniversidadController {
    //ATRIBUTO
    private ConexionDB objConn;
    
    public UniversidadController(){
        objConn = new ConexionDB();
    }
    
    public ConexionDB getObjConn(){
        return objConn;
    }
    
    public boolean crearUniversidad(String nit, String nombre, String direccion, String email){
        boolean crear = false;
        //Crear objeto Universidad
        UniversidadesDao universidad = new UniversidadesDao(objConn.getConexion(), nit, nombre, direccion, email);
        crear = universidad.insert();
        return crear;
    }
    
    public ArrayList<Universidades> obtenerUniversidades(){
        ResultSet result = UniversidadesDao.selectAll(objConn.getConexion());
        ArrayList<Universidades> universidades = new ArrayList<Universidades>();
        try{
            //Iterar result
            while(result.next()){
                String nombre = result.getString("nombre");
                String nit = result.getString("nit");
                String direccion = result.getString("direccion");
                String email = result.getString("email");
                //Crear objeto
                Universidades objUni = new Universidades(nombre, nit, direccion, email);
                //Añadir objeto al arrayList
                universidades.add(objUni);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return universidades;
    }
    
    public void obtenerUniversidadXNit(){
        
    }
    
     
}
