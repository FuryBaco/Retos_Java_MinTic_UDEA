/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedrgapi
 */
public abstract class Animal {
    
    private String especie;
    private String sexo;
    private int edad;
    private boolean esSalvaje;


    public Animal(String especie, String sexo, int edad, boolean esSalvaje) {
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.esSalvaje = esSalvaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsSalvaje() {
        return esSalvaje;
    }

    public void setEsSalvaje(boolean esSalvaje) {
        this.esSalvaje = esSalvaje;
    }
    
    public abstract String hacerSonido();

    String mensaje = getEstadoSalvaje();
    //crear variable que guarde estado de essalvaje y devuelva un mensaje de acuerdo a eso
    public String getEstadoSalvaje() {
        if (esSalvaje) {
            return "Es salvaje";
        } else {
            return "No es salvaje";
        }
    }

    @Override
    public String toString() {
        return "especie=" + especie + ", sexo=" + sexo + ", edad=" + edad + ", esSalvaje=" + mensaje;
    }
    
}
