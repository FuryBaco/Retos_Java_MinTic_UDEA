
import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /* Tripulante john = new Tripulante("Jhon Doe",
        "1037654354",
        "123456789",
        "john.doe@udea.edu.co",
        "Soy una persona con muchas grnas de aprender",
        5        
        );
        
        john.resolverReto(1);
        john.resolverReto(2);
        john.resolverReto(3);
        System.out.println(Arrays.toString(john.getCalificaciones()));
        
    Formador jane = new Formador(
        "3D",
        "Jane Di",
        "1038654355",
        "987654321",
        "jane.di@udea.edu.co",
        "Me apasiona enseñar!"        
        );
        
        //jane.calificar(john, 1);
        //jane.calificar(john, 2);

        for(int i = 0; i < 5; i++){
            jane.calificar(john, i);
        } */

String nombreTripulante = "John Doe";
String documentoIdentidadTripulante = "1037654354";
String passwordTripulante = "123456789";
String correoTripulante = "john.doe@udea.edu.co";
String descripcionTripulante = "Soy una persona con muchas ganas de aprender";
int actividadesAEvaluar = 5;

//[33mDatos del formador:
String escalafonFormador = "3D";
String nombreFormador = "Jane Di";
String documentoIdentidadFormador = "1038654355";
String passwordFormador = "987654321";
String correoFormador = "jane.di@udea.edu.co";
String descripcionFormador = "¡Me apasaiona enseñar!";

//[33mTEST 5 (INCORRECTO):
//[33m	Operaciones realizadas:
	Tripulante tripulante5 = new Tripulante(nombreTripulante, documentoIdentidadTripulante, passwordTripulante, correoTripulante, descripcionTripulante, actividadesAEvaluar);
	Formador formador5 = new Formador(escalafonFormador, nombreFormador, documentoIdentidadFormador, passwordFormador, correoFormador, descripcionFormador);	tripulante5.resolverReto(0);
	tripulante5.resolverReto(4);
	tripulante5.resolverReto(3);
	formador5.calificar(tripulante5, 0);
	formador5.calificar(tripulante5, 1);
	formador5.calificar(tripulante5, 2);
	formador5.calificar(tripulante5, 3);
     
    System.out.println(Arrays.toString(tripulante5.getEntregas()));
    System.out.println(Arrays.toString(tripulante5.getCalificaciones()));
    tripulante5.editarPerfil("John Doe", "1037654354", "123456789", "john.doe@udea.edu.co", "Soy una persona con muchas grnas de aprender");
    System.out.println(tripulante5);
    formador5.editarPerfil("Jane Di", "1038654355", "987654321", "jane.di@udea.edu.co", "Me apasiona enseñar!");
    System.out.println(formador5);
    }
}
