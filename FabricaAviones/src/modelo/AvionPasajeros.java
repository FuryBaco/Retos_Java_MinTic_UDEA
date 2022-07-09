package modelo;

public class AvionPasajeros extends Avion {
    //ATRIBUTOS
    private int pasajeros;

    //CONSTRUCTOR
    public AvionPasajeros(int pasajeros, String color, double tamanio){
        //Enviar parámetros al constructor de la superClase Avion
        super(color, tamanio);
        this.pasajeros = pasajeros;
    }

    

    @Override
    public String toString() {
        String info = "----------AVION PASAJEROS----------\n";
        info += "Color: " + getColor() + "\n";
        info += "Tamaño: " + getTamanio() + "\n";    
        info += "Pasajeros: " + pasajeros + "\n";
        return info;
    }



    public int getPasajeros(){
        return pasajeros;
    }

    public void setPasajeros(int pasajeros){
        this.pasajeros = pasajeros;
    }

    //ACCIONES
    public void servir(){
        System.out.println("Sirviendo alimentos a los pasajeros...👮‍♀️");
    }
}

