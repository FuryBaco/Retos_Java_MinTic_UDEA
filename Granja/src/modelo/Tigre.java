/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package modelo;

/**
 *
 * @author pedrgapi
 */
public class Tigre extends Animal {

    public Tigre(String sexo, int edad) {
        super("Tigre", sexo, edad, true);
    }

    @Override
    public String hacerSonido() {
        return "grgrgrgr";
    }

    @Override
    public String toString() {
        return "Tigre{" + super.toString()+ '}';
    }
}
