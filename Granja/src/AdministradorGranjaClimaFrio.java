/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import modelo.Animal;
import modelo.Gallina;
import modelo.Vaca;

/**
 *
 * @author pedrgapi
 */
public class AdministradorGranjaClimaFrio implements AdministradorGranja {

    private static final int COSTO_LITRO_LECHE = 2000;
    private static final int COSTO_HUEVO = 600;
    
    private Animal[] animales;

    public AdministradorGranjaClimaFrio() {
        this.animales = new Animal[0];
    }
    
    @Override
    public void agregarAnimales(Animal[] animales) {
        int animalesNoAgregados = 0;
        Animal[] animalesNuevos = new Animal[this.animales.length + animales.length];
        for (int i = 0; i < this.animales.length; i++) {
            animalesNuevos[i] = this.animales[i];
        }
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].isEsSalvaje()) {
                animalesNoAgregados++;
                System.out.println("No se agrego el animal " + animales[i].getEspecie() + " porque es salvaje.");
            } else {
                animalesNuevos[i + this.animales.length] = animales[i];
                System.out.println("Animal " + animales[i].getEspecie() + " agregado.");
            }
        }
        this.animales = new Animal[animalesNuevos.length - animalesNoAgregados];
        for (int i = 0; i < this.animales.length; i++) {
            this.animales[i] = animalesNuevos[i];
        }
    }

    @Override
    public void mostrarTodosLosAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.toString());
        }
    }

    @Override
    public int obtenerEdadPromedioAnimales() {
        int sumaEdades = 0;
        for (int i = 0; i< animales.length; i++) {
            sumaEdades += animales[i].getEdad();
        }
        return sumaEdades / animales.length;
    }

    @Override
    public int obtenerGananciasProductos() {
        int ganancias = 0;
        for (Animal animal : animales) {
            if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                ganancias += vaca.getCantidadLitrosLechePorDia() * COSTO_LITRO_LECHE;
            } else if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                ganancias += gallina.getCantidadHuevosPorDia() * COSTO_HUEVO;
            }
        }
        return ganancias;
    }
    
}
