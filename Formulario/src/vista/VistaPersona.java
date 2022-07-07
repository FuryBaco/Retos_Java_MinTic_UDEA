package vista;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.directory.InitialDirContext;

import controlador.ControladorPersona;
import modelo.Persona;

public class VistaPersona{

    //ATRIBUTOS
    private ControladorPersona controladorPersona;

    public void menu(){
      Scanner leer = new Scanner(System.in);
      try{
        int respuesta = 0;
        System.out.println("Desea agregar otra persona? (1=si, 2=no)");
        respuesta = Integer.parseInt(leer.nextLine());
        ControladorPersona cPersona = new ControladorPersona();

      do{
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = leer.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = Integer.parseInt(leer.nextLine());

        System.out.println("Ingrese la cedula: ");
        double cedula = Double.parseDouble(leer.nextLine());

        cPersona.crearPersona(nombre, apellido, edad, cedula);
        System.out.println("Persona creada");
        System.out.println();
        cPersona.indicePersona(nombre);
        //imprimir nueva linea para que no se vea el error de la siguiente linea
        System.out.println("\n");

        System.out.println("Desea agregar otra persona? (1=si, 2=no)");
        respuesta = Integer.parseInt(leer.nextLine());

      }while(respuesta == 1);

      cPersona.mostrarPersona();
        
      }catch(Exception error){
        
      }
    }
}
