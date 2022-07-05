
public class Salida {

    public void imprimir(double resultadoPulgadas, double resultadoYardas) {


        //rintf("%.2f pies son %.2f yardas y %.2f pulgadas", pies, yardas, pulgadas);
        System.out.printf("%.2f pulgadas y %.2f yardas", resultadoPulgadas, resultadoYardas);
        //imprimir salto de linea
        System.out.println();
        System.out.println("El resultado en yardas es: " + resultadoYardas);
        System.out.println("El resultado en pulgadas es: " + resultadoPulgadas);

        

    }
    
}
