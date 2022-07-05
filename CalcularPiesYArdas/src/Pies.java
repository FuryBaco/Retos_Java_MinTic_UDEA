public class Pies {

    Entrada miEntrada = new Entrada(0.0);
    Proceso miProceso = new Proceso(0.0, 0.0);
    Salida miSalida = new Salida();

    public void comenzarAccion() {
        miEntrada.pedirPies();
        miProceso.calcular(miEntrada.getPies());
        miSalida.imprimir(miProceso.getPulgadas(), miProceso.getYardas());
    }

    
}
