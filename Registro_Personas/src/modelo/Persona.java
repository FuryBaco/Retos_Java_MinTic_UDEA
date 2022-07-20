package modelo;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String cedula;
    
    // CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, char sexo, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
    }

    // GETTERS Y SETTERS
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        String info = "";
        info = "------------------------------------------------------\n";
        info += "Nombre: " + nombre + "\n";
        info += "Apellido: " + apellido + "\n";
        info += "Edad: " + edad + "\n";
        info += "Sexo: " + sexo + "\n";
        info += "Cedula: " + cedula + "\n";
        info += "------------------------------------------------------\n";
        return info;
    }
      
    
}
