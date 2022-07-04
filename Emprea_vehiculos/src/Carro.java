public class Carro {
    

    //ATRIBUTOS
    private String color;
    private String placa;
    private String modelo;
    private double vel_maxima;

    //CONSTRUCTORES
    public Carro(String color, String placa, String modelo, double vel_maxima) {
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.vel_maxima = vel_maxima;
    }

    //GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }   

    public String getplaca() {
        return placa;
    }

    /* public void setplaca(String placa) {
        this.placa = placa;
    } */

    public String getModelo() {
        return modelo;
    }

    /* public void setModelo(String modelo) {
        this.modelo = modelo;
    } */

    public double getVel_maxima() {
        return vel_maxima;
    }

    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    //METODOS
    public void acelerar() {
        System.out.println("Acelerando...🚘");
    }

    public void frenar() {
        System.out.println("Frenando....⏹️");
    }

    /* public void desacelerar() {
        System.out.println("Desacelerando...");
    } */

    public void girar_derecha() {
        System.out.println("--->...");
    }

    public void girar_izquierda() {
        System.out.println("<---...");
    }


}
