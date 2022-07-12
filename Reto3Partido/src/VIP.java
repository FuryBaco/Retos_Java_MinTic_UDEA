//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()
import java.util.Arrays;
import java.util.Random;

public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    private boolean[] pantallas;
    private String credencialesPrevia;

    //Y SU MÉTODO CONSTRUCTOR
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.pantallas = new boolean[3];
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
        if(pantalla == 1 || pantalla == 2 || pantalla == 3){
          pantallas[pantalla - 1] = !pantallas[pantalla - 1];
        }  
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
    @Override
    public String toString(){
        String info = ("ID del tiquete: " + this.idTiquete + "\n" +
                       "Nombre del cliente: " + this.nombreCompleto + "\n" +
                       "Direccion del cliente: " + this.direccionResidencia + "\n" +
                       "Credenciales del cliente: " + this.credenciales + "\n" +
                       "Estado de las pantallas del cliente" + Arrays.toString(this.pantallas) + "\n" +
                       "Credenciales del cliente: " + this.credenciales + "\n" +
                       "Credenciales del cliente para la previa: " + this.credencialesPrevia);
        return info;
    }

}