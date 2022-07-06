import java.util.Date;

public class App {

    public static void main(String[] args) {
        
        Guerrero miGuerrero = new Guerrero("JuanMa", 'M', 50, 40, 60, 80);
        NPJ miNPJ = new NPJ("Carolina", 'F', 70, 30, 80, "Medica");

        miGuerrero.asignarMision(new Date(), "Salvar al reino");
        System.out.println(miGuerrero.verMisiones());

        Mago miMago = new Mago("Teresa", 'F', 70, 40, 90, 100);
        //Humano miHumano = new Humano("", 'F', 1, 1, 1);

        //crear un nuevo mago pidiendo los datos por teclado
        System.out.println("Ingrese el nombre del mago: ");
        String nombre = System.console().readLine();
        System.out.println("Ingrese el sexo del mago: ");
        char sexo = System.console().readLine().charAt(0);
        System.out.println("Ingrese la vida del mago: ");
        double vida = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la defensa del mago: ");
        double defensa = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la velocidad del mago: ");
        double velocidad = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el nivel de magia del mago: ");
        double nivelMagia = Double.parseDouble(System.console().readLine());
        Mago miMago2 = new Mago(nombre, sexo, vida, defensa, velocidad, nivelMagia);
        
        //mostrar el nivel de magia y la clase del mago
        System.out.println("Clase: " + miMago2.getClase());
        System.out.println("Nivel de magia: " + miMago2.getNivelMagia());
        System.out.println("Nombre: " + miMago2.getNombre());
        System.out.println("Sexo: " + miMago2.getSexo());
        System.out.println("Vida: " + miMago2.getVida());
        System.out.println("Defensa: " + miMago2.getDefensa());
        System.out.println("Velocidad: " + miMago2.getVelocidad());

    }

}
