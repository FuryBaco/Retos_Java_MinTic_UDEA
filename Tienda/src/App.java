import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> tienda = new ArrayList<>();
        tienda.add(new Cliente("Valeria Di", "10367876345", 2700, "05/07/2022", "0022"));
        tienda.add(new Cliente("Johan Doe", "1037645345", 9500, "05/07/2022", "0022"));
        tienda.add(new Cliente("Maurice Doe", "98765234", 300, "05/07/2022", "0022"));
        tienda.add(new Cliente("Matthew Doe", "1036789453", 15000, "05/07/2022", "0022"));
        tienda.add(new Cliente("Agustina Doe", "10003456", 1800, "05/07/2022", "0022"));
        tienda.add(new Cliente("Agustina Doe", "10003456", 10000, "05/07/2022", "0022"));
        tienda.add(new Cliente("Milena Doe", "20003456", 400, "05/07/2022", "0022"));
        tienda.add(new Cliente("Carla Di", "103789762", 3000, "05/07/2022", "0022"));
        tienda.add(new Cliente("Luz Di", "32675123", 400, "05/07/2022", "0022"));
    }
}
