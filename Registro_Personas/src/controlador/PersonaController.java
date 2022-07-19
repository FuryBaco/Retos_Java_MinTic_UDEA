package controlador;
import java.util.ArrayList;
import modelo.*;

public class PersonaController {
    private ArrayList<Persona> personas;

    // CONSTRUCTOR
    public PersonaController() {
        personas = new ArrayList<Persona>();
    }

    // GETTERS Y SETTERS
    /* public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    } */

    public Persona getPersona(int index) {
        return personas.get(index);
    }

    public void setPersona(Persona persona, int index) {
        personas.set(index, persona);
    }

    // METODOS
    public void agregarPersona(String nombre, String apellido, int edad, char sexo, String cedula) {
        Persona persona = new Persona(nombre, apellido, edad, sexo, cedula); 
        personas.add(persona);
    }

    
    
}
