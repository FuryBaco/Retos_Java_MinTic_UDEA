/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedrgapi
 */
public class Perro extends Animal {

    public Perro(String especie, String sexo, int edad) {
        super("Perro", sexo, edad, false);
    }
    
    public int obtenerEdadEnHumanos() {
        return super.getEdad() * 7;
    }

    @Override
    public String hacerSonido() {
        return "Guauf";
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + '}';
    }
    
}
