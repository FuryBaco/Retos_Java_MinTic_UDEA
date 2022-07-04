import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String [] cancionesEscogidas = new String [] {
            "Mil horas",
            "Por ese hombre",
            "A esa",
            "Algo de mi",
            "Si me dejas ahora",
            "¿Quieres ser mi amante?",
            "Quel sorriso in volto",
            "Per una notte insieme",
            "Como un pintor",
            "Sencillamente",
            "Un segundo",
            "Enciéndeme",
            "Cuando me enamoro",
            "Tu eres mi tesoro",
            "Piccola anima",
            "Solo a ti pertenezco",
            "Todos por todos"
            };
        ReproductorMusica ventana1 =new ReproductorMusica(cancionesEscogidas);

        ventana1.devolverCancion ();
        ventana1.devolverCancion ();
        ventana1.devolverCancion ();
        ventana1.devolverCancion ();

        ventana1.agregarCancionesFavoritas ();
        ventana1.proximaCancion ();
        ventana1.agregarCancionesFavoritas ();
        ventana1.devolverCancion ();
        ventana1.agregarCancionesFavoritas ();

        ventana1.cambiarEstadoReproduccion ();
        ventana1.cambiarEstadoReproduccion ();
        ventana1.cambiarEstadoReproduccion ();
        ventana1.cambiarEstadoReproduccion ();
        ventana1.cambiarEstadoReproduccion ();

        //Print cancionesFavoritas
        System.out.println(Arrays.toString(ventana1.getCancionesFavoritas()));
        //Print pausado state
        System.out.println(ventana1.isPausado());
        //Print cancion reproduciendo
        System.out.println(ventana1.getCancionReproduciendo());


    }
}
