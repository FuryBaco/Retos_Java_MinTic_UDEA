import java.util.Scanner;

public class Empresa {
    private String nombre; 
    private String direccion;
    private String telefono;
    private String email;
    private String nit;
    private Carro carros[];


    //CONSTRUCTORES
    public Empresa(String nombre, String direccion, String telefono, String email, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nit = nit;
        this.carros = new Carro[50];
    }



    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getNit() {
        return nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //ACCIONES
    public void fabricar_carro(String color, String placa,  double vel_maxima) {
        //Crear un nuevo carro
        Carro carro = new Carro(color, placa, "2023", vel_maxima);
        int tamanio_arreglo = this.carros.length;
        int cont = 0;
        boolean flag = false;
        do{
            if(this.carros[cont] == null){
                this.carros[cont] = carro;
                flag = true;
            }
            cont++;
        }while (cont < tamanio_arreglo && !flag);
    }

    
    public void solicitar_datos_carro(){
        //Creador de objeto escaner con manejador de excepciones
        Scanner leer = new Scanner(System.in);
        try{
            System.out.println("Ingrese el color del carro: ");
            String color = leer.next();
            System.out.println("Ingrese la placa del carro: ");
            String placa = leer.next();
            System.out.println("Ingrese la velocidad maxima del carro: ");
            double vel_maxima = leer.nextDouble();
            this.fabricar_carro(color, placa, vel_maxima);
        }catch(Exception error){
            System.out.println("Error: " + error.getMessage());
        }
    }

    public void mostrar_carros(){
        int cont = 0;
        int tamanio_arreglo = this.carros.length;
        while(cont < tamanio_arreglo){
            if(this.carros[cont] != null){
                System.out.println("Carro: " + this.carros[cont].getColor() + " " + this.carros[cont].getplaca() + " " + this.carros[cont].getModelo() + " " + this.carros[cont].getVel_maxima());
            }
            cont++;
        }
    }

    public void menu(){
        Scanner leer = new Scanner(System.in);
        String menu = "--------------FABRICAR CARRO--------------\n";
        menu += "1. Fabricar carro\n";
        menu += "2. Mostrar carros\n";
        menu += "3. Salir\n";
        menu += ">>>"; 
        int opcion = 0;           
        do{
            try{
            System.out.print(menu);
            opcion = Integer.parseInt(leer.nextLine());
            switch(opcion){
                case 1:
                    this.solicitar_datos_carro();
                    break;
                case 2:
                    this.mostrar_carros();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            }catch(Exception error){
                System.out.println("Error: " + error.getMessage());
            }
        }while(opcion != 3);
        leer.next();
    }


    
}
