import java.util.Scanner;

public class Entrada {

    double pies;

    public Entrada(double pies) {
        this.pies = pies;
    }
    
    public double getPies() {
        return pies;
    }

    public void setPies(double pies) {
        this.pies = pies;
    }

    public void pedirPies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los pies: ");
        setPies(sc.nextDouble());
    }
}
