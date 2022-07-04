import java.util.Arrays;

public class reporte {
    //create an array named listaNotas of type double that contains students grades
    public static void main(String[] args) {
        double listaNotas[] = {5.0, 4.0, 3.0, 2.0, 1.0};
        //calculate the average of a given array
        double average = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            average += listaNotas[i];
        //calculate the minimum and maximum of a given array
        }
        double min = listaNotas[0];
        double max = listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] < min) {
                min = listaNotas[i];
            }
            if (listaNotas[i] > max) {
                max = listaNotas[i];
            }
        }
        //print the average, minimum and maximum of a given array
        System.out.println("El promedio es: " + average / listaNotas.length);
        System.out.println("El minimo es: " + min);
        System.out.println("El maximo es: " + max);

        //put the average, minimum and maximum of a given array in a new array
        double[] newArray = {average / listaNotas.length, min, max};
        //print the new array
        System.out.println(Arrays.toString(newArray));
    }

        }

        
    

