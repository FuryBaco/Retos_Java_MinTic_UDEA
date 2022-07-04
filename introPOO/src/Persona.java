public class Persona {
    public String nombre;
    public String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.print("Soy un onjeto persona");
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
}
