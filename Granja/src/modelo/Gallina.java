/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package modelo;

/**
 *
 * @author pedrgapi
 */
public class Gallina extends Animal {
    
    private int cantidadHuevosPorDia;

    public Gallina(int cantidadHuevosPorDia, String especie, String sexo, int edad) {
        super(especie, sexo, edad, false);
        this.cantidadHuevosPorDia = cantidadHuevosPorDia;
    }

    public int getCantidadHuevosPorDia() {
        return cantidadHuevosPorDia;
    }

    public void setCantidadHuevosPorDia(int cantidadHuevosPorDia) {
        this.cantidadHuevosPorDia = cantidadHuevosPorDia;
    }

    @Override
    public String hacerSonido() {
        return "clo, cloc";
    }

    @Override
    public String toString() {
        return "Gallina{" + super.toString() + ", cantidadHuevosPorDia=" + cantidadHuevosPorDia + '}';
    }
}
