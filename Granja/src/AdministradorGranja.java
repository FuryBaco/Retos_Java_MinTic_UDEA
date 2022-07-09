/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import modelo.Animal;

/**
 *
 * @author pedrgapi
 */
public interface AdministradorGranja {
    
    public void agregarAnimales(Animal[] animales);
    
    public void mostrarTodosLosAnimales();
    
    public int obtenerEdadPromedioAnimales();
    
    public int obtenerGananciasProductos();
    
}
