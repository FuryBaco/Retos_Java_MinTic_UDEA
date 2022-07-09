package modelo;

public class AvionCarga extends Avion {
    
    //CONSTRUCTOR
    public AvionCarga(String color, double tamanio){
        //Llamar al método constructor de la super clase 'Avion'
        super(color, tamanio);
    }

    @Override
    public String toString() {
        String info = "----------AVION CARGA----------\n";
        info += "Color: " + getColor() + "\n";
        info += "Tamaño: " + getTamanio() + "\n";    
        return info;
    }

    //ACCIONES
    public void cargar(){
        System.out.println("Cargando...");
    }

    public void descargar(){
        System.out.println("Descargar...");
    }

}

