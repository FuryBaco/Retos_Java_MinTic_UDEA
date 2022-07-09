package controlador;

import modelo.Avion;
import modelo.AvionCarga;
import modelo.AvionPasajeros;
import modelo.TipoAvion;

public class ControladorAvion {
    //ATRIBUTOS
    private Avion[] aviones;

    //CONSTRUCTOR
    public ControladorAvion(){
        this.aviones = new Avion[3];
    }

    //CONSULTORES 
    public Avion getAvion(int pos){
        return aviones[pos];
    }

    public int getLengthAvion(){
        return aviones.length;
    }


    //MODIFICADORES
    public void setAvion(Avion avion, int pos){
        aviones[pos] = avion;
    }

    //ACCIONES
    public void fabricar_aviones(TipoAvion tipoAvion, String color, double tamanio, int pasajeros){
        switch(tipoAvion){
            case AVION_CARGA:
                AvionCarga avionCarga = new AvionCarga(color, tamanio);
                setAvion(avionCarga, 0);
                break;
            case AVION_PASAJEROS:
                AvionPasajeros avionPasajeros = new AvionPasajeros(pasajeros, color, tamanio);
                setAvion(avionPasajeros, 1);
                break;
            default:
                break;
        }
    }
}

