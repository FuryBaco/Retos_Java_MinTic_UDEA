package vista;
import javax.swing.JOptionPane;

import controlador.ControladorPersona;

public class GUIPersona {

    //ATRIBUTOS
    ControladorPersona controladorPersona;
    String nombre = "";

    //CONTRUCTOR
    public GUIPersona() {
        controladorPersona = new ControladorPersona();
    }

    //Crear persona
    public void crearPersona() {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            String apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cedula: "));
            controladorPersona.crearPersona(nombre, apellido, edad, cedula);
            JOptionPane.showMessageDialog(null, "Persona creada");
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    //mostrar persona en el JOptionpanel
    public void mostrarPersona() {
        String info = ("-----------------" + "Personas" + "-----------------\n");
        for(int i = 0; i < controladorPersona.lenghtPersona(); i++) {
            if (controladorPersona.getPersona(i) != null) {
                info += ("-----------------" + "Persona "+(i+1)+ "-----------------\n");
                info += controladorPersona.getPersona(i).toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, info);
    }

    //eliminar persona
    public void eliminarPersona() {
        try {
            double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cedula de la persona a eliminar: "));
            controladorPersona.eliminarPersona(cedula);
            JOptionPane.showMessageDialog(null, "Persona eliminada");
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }



    //Create  menu
    public void menu() {
        String mensaje = "----------FORMULARIO----------\n"
                + "1. Crear persona\n"
                + "2. Mostrar personas\n"
                + "3. Eliminar persona\n"
                + "4. Salir\n";
        int opcion = 0;
        System.out.println();
        
    do{
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    mostrarPersona();
                    break;
                case 3:
                    eliminarPersona();;
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } catch (Exception error) {
            // TODO Auto-generated catch block
            System.out.println("Error");
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }
    }while(opcion !=4);

    }
     
    
}
