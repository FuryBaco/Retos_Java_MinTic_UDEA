package controlador;
import modelo.Persona;

public class ControladorPersona{
  //ATRIBUTOS
  private Persona[] personas;

  //CONTRUCTOR
  public ControladorPersona(){
    personas = new Persona[10];
  }

  public Persona getPersona(int pos){
    return personas[pos];
  }

  public int lenghtPersona(){
    return personas.length;
  }

  public void setPersona(Persona persona, int pos){
    this.personas[pos] = persona;
  }

  public void crearPersona(String nombre, String apellido, int edad, double cedula){
    Persona persona = new Persona(nombre, apellido, edad, cedula);
    int tamanio_arreglo = this.personas.length;
        int cont = 0;
        boolean flag = false;
        do{
            if(this.personas[cont] == null){
                this.personas[cont] = persona;
                flag = true;
            }
            cont++;
        }while (cont < tamanio_arreglo && !flag);
  }

  public void mostrarPersona(){
        int cont = 0;
        int tamanio_arreglo = this.personas.length;
        while(cont < tamanio_arreglo){
            if(this.personas[cont] != null){
                System.out.println("----------Persona " + (cont+1) + "----------\n");
                System.out.println("Nombre: " + this.personas[cont].getNombre());
                System.out.println("Apellido: " + this.personas[cont].getApellido());
                System.out.println("Edad: " + this.personas[cont].getEdad());
                System.out.println("Cedula: " + this.personas[cont].getCedula());
                System.out.println();
            }
            cont++;
        }
  }


  public void indicePersona(String nombre){
    int cont = 0;
    int tamanio_arreglo = this.personas.length;
    while(cont < tamanio_arreglo){
      if(this.personas[cont] != null){
        if(this.personas[cont].getNombre().equals(nombre)){
          System.out.println("----------Persona " + (cont+1) + "----------\n");
          System.out.println("Nombre: " + this.personas[cont].getNombre());
          System.out.println("Apellido: " + this.personas[cont].getApellido());
          System.out.println("Edad: " + this.personas[cont].getEdad());
          System.out.println("Cedula: " + this.personas[cont].getCedula());
          System.out.println();
        }
      }
      cont++;

    }
  }
}
