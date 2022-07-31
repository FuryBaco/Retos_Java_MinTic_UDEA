
package com.universidad.universidad.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="universidades")
public class Universidades {
    /**
     * Nota:
     * EL nombre de los atributos debe ser igual al nombre de los campos 
     * cuando omitimo (name="nombre_campo")
     */
    //ATRIBUTOS
    @Id
    @Column(name="nit")
    private String nit;
    @Column(name="nombre")
    private String nombre;
    @Column(name="direccion")
    private String direccion;
    @Column(name="email")
    private String email;
    //private ArrayList<String> telefonos;
    

    public Universidades(String nombre, String nit, String direccion, String email) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.email = email;
        //this.telefonos = new ArrayList<String>();
    }
    
    
    //CONSULTORES

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
/*
    public ArrayList<String> getTelefonos() {
        return telefonos;
    }*/
    
    //MODIFICADORES

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
/*
    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    */
    
}
