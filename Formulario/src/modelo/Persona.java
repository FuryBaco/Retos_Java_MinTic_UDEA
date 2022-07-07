package modelo;

public class Persona{
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private Double cedula;

    //Constructor
    public Persona(String nombre, String apellido, int edad, double cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    @Override
    public String toString(){
        String info = ("Nombre: " + this.nombre + "\n" +
                       "Apellido: " + this.apellido + "\n" +
                       "Edad: " + this.edad + "\n" +
                       "Cedula: " + this.cedula + "\n");
        return info;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getCedula() {
        return cedula;
    }

    public void setCedula(Double cedula) {
        this.cedula = cedula;
    }
    
}