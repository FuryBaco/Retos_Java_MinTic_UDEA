/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad_gui.notas_estudiante.modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private double[] notas;
    
    //CONSTRUCTOR
    public Estudiante(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = new double[5];
        inicializarNotas();
    }
    
    public void inicializarNotas(){
        for(int i=0; i < notas.length; i++){
            notas[i] = 0;
        }
    
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double[] getNotas() {
        return notas;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void setNota(double nota, int index) {
        notas[index] = nota;
    }
    
    public double calcularPromedioNotas(){
        double promedio = 0.0;
        for(int i=0; i < notas.length; i++){
            promedio += notas[i];
        }
        promedio /= notas.length;
        return promedio;
    }
}
