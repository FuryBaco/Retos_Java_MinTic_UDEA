import modelo.Animal;
import modelo.Gallina;
import modelo.Vaca;
import modelo.Tigre;

public class App {
    private static AdministradorGranja administradorGranjaClimaCalido = new AdministradorGranjaClimaCalido();
    
    private static AdministradorGranja administradorGranjaClimaFrio = new AdministradorGranjaClimaFrio();
    
    private static Vaca[] vacas = {new Vaca(3, 5), new Vaca(5, 2), new Vaca(2, 9), new Vaca(1, 10), new Vaca(6, 4)};
    
    private static Tigre[] tigre = {new Tigre("Macho", 25)};

    public static void main(String[] args) {
        administradorGranjaClimaFrio.agregarAnimales(vacas);
        administradorGranjaClimaFrio.agregarAnimales(tigre);
        administradorGranjaClimaFrio.mostrarTodosLosAnimales();
        System.out.println("Edad promedio " + administradorGranjaClimaFrio.obtenerEdadPromedioAnimales());
        System.out.println("Ganancias productos " + administradorGranjaClimaFrio.obtenerGananciasProductos());
    }
}