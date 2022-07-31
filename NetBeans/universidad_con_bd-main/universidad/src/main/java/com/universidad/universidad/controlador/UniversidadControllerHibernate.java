
package com.universidad.universidad.controlador;

import com.universidad.universidad.modelo.Universidades;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UniversidadControllerHibernate {
    
    public UniversidadControllerHibernate(){
        
    }
    
    public boolean crearUniversidad(String nombre, String nit, String direccion, String email){
        //Crear objeto universidad
        Universidades objUni = new Universidades(nombre, nit, direccion, email);
        boolean insert = false;
        try{
            //Configurar la sesión de conexion
            SessionFactory sf = new Configuration().configure("config.xml").addAnnotatedClass(Universidades.class).buildSessionFactory();
            //Abrir sesión
            Session sesion = sf.openSession();
            //Preparar la sesión para realizar transacciones
            sesion.beginTransaction();

            //..preparar las transacciones
            //Indicar que almacene una nueva universidad en BD
            sesion.persist(objUni);

            //Enviar transacciones
            sesion.getTransaction().commit();

            //Cerrar transacciones
            sesion.close();
            insert = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return insert;
    }
    
}
