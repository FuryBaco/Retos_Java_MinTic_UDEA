package vista;

import javax.swing.JOptionPane;

import controlador.ControladorAvion;
import modelo.TipoAvion;

public class VistaAvion {
    ControladorAvion cAvion;

    public VistaAvion(){
        cAvion = new ControladorAvion();
    }

    public void menu(){
        String mensaje = "--------------FABRICA DE AVIONES-------------\n";
        mensaje += "1) Construir avion de pasajeros\n";
        mensaje += "2) Construir acion de carga\n";
        mensaje += "3) Mostrar aviones\n";
        mensaje += "-1) Salir";
        int opcion = 0;
        do{

            opcion = Integer.parseInt( JOptionPane.showInputDialog(null, mensaje) );
            switch(opcion){
                case 1:
                    int pasajeros = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros") );
                    String color = solicitar_datos_avion()[0];
                    double tamanio = Double.parseDouble(solicitar_datos_avion()[1]);
                    cAvion.fabricar_aviones(TipoAvion.AVION_PASAJEROS, color, tamanio, pasajeros);
                    break;
                case 2:
                    String[] datos = solicitar_datos_avion();
                    cAvion.fabricar_aviones(TipoAvion.AVION_CARGA, datos[0], Double.parseDouble(datos[1]), 0);
                    break;
                case 3:
                    String infoAviones = "-----------------AVIONES FABRICADOS-----------------\n";
                    for(int i = 0; i < cAvion.getLengthAvion(); i++){
                        infoAviones += cAvion.getAvion(i);
                    }
                    JOptionPane.showConfirmDialog(null,infoAviones);
                    break;
                case -1:
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "Por favor ingrese una opción válida");
            }

        }while(opcion != -1);
    }

    public String[] solicitar_datos_avion(){
        String color = JOptionPane.showInputDialog(null, "Ingrese el color del avión");
        String tamanio = JOptionPane.showInputDialog(null, "Ingrese el tamaño del avión");
        String[] respuesta = {color, tamanio};
        return respuesta;
    }

}

    
