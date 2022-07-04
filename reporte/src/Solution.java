import java.io.PrintStream;
import java.util.Arrays;

public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static double[] reporte(double[] listaNotas) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        //calculate the average, min and max  of a given array
        double average = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            average += listaNotas[i];
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
        //put the average, min and max of a given array in a new array
        double[] newArray = {average / listaNotas.length, min, max};
        //return the new array
        return newArray;
        
    }

        }

