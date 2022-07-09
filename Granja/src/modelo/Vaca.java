/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedrgapi
 */
public class Vaca extends Animal {
    
    private int cantidadLitrosLechePorDia;

    public Vaca(int cantidadLechePorDia, int edad) {
        super("Vaca", "Hembra", edad, false);
        this.cantidadLitrosLechePorDia = cantidadLechePorDia;
    }

    public int getCantidadLitrosLechePorDia() {
        return cantidadLitrosLechePorDia;
    }

    public void setCantidadLitrosLechePorDia(int cantidadLechePorDia) {
        this.cantidadLitrosLechePorDia = cantidadLechePorDia;
    }

    @Override
    public String hacerSonido() {
        return "Muuuuuu";
    }

    @Override
    public String toString() {
        return "Vaca{" + super.toString() +  ", cantidadLechePorDia=" + cantidadLitrosLechePorDia + '}';
    }
}
