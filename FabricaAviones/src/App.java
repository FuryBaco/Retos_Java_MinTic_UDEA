
import modelo.Avion;
import modelo.AvionCarga;
import modelo.AvionPasajeros;
import vista.VistaAvion;


public class App 
{
    public static void main( String[] args )
    {
        VistaAvion vAvion = new VistaAvion();
        vAvion.menu();
    }

    public static void fabricar_avion_carga(){
        AvionCarga avionCarga = new AvionCarga("Gris", 20.5);
        //ejecutar las acciones
        avionCarga.cargar();
        avionCarga.despegar();
        avionCarga.aterrizar();
        avionCarga.frenar();
        avionCarga.descargar();
    }
}

