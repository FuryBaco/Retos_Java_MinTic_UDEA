//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()
import java.util.Random;

public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    private boolean[] pantallas;
    private String credencialesPrevia;

    //Y SU MÉTODO CONSTRUCTOR
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia, String credenciales,
            boolean[] pantallas, String credencialesPrevia) {
        super(idTiquete, nombreCompleto, direccionResidencia, credenciales);
        this.pantallas = pantallas;
        pantallas = new boolean[3];
        for (int i = 0; i < pantallas.length; i++) {
            pantallas[i] = false;
        }
        this.credencialesPrevia = "";
    }
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    public void asignarPantalla(int pantalla){
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //asignarPantalla() 
        pantallas[pantalla] = !pantallas[pantalla];   
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public boolean[] isPantallas() {
        return pantallas;
    }
    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }
    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }
    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }

}
