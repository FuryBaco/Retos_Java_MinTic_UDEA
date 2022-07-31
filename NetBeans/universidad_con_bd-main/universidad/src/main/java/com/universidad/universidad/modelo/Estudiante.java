
package com.universidad.universidad.modelo;

public class Estudiante extends Persona{
    //ATRIBUTO
    private String codigo;
    
    //CONSTRUCTOR

    public Estudiante(String codigo, String nombre, String apellido, int edad, String cedula, char sexo) {
        super(nombre, apellido, edad, cedula, sexo);
        this.codigo = codigo;
    }
    
    //CONSULTOR

    public String getCodigo() {
        return codigo;
    }
    
    
}
