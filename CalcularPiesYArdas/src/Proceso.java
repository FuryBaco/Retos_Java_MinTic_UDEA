public class Proceso {
    double yardas;
    double pulgadas;

    public Proceso(double yardas, double pulgadas) {
        this.yardas = yardas;
        this.pulgadas = pulgadas;
    }

    public double getYardas() {
        return yardas;
    }

    public void setYardas(double yardas) {
        this.yardas = yardas;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void calcular(double pies) {
        
        double resultadoYardas = pies / 3;
        setYardas(resultadoYardas);

        double resultadoPulgadas = pies * 12;
        setPulgadas(resultadoPulgadas);
    }

    
    
}
