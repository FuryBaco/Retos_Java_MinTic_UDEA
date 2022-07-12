
import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Tripulante john = new Tripulante("Jhon Doe",
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
        }
        
    System.out.println(Arrays.toString(john.getCalificaciones()));
    System.out.println(Arrays.toString(john.getEntregas()));
    john.editarPerfil("John Doe", "1037654354", "123456789", "john.doe@udea.edu.co", "Soy una persona con muchas grnas de aprender");
    System.out.println(john);
    jane.editarPerfil("Jane Di", "1038654355", "987654321", "jane.di@udea.edu.co", "Me apasiona enseñar!");
    System.out.println(jane);
    }
}
