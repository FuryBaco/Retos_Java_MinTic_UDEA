public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    private boolean participaSorteo = false;
    //Y SU MÉTODO CONSTRUCTOR
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }
    public void participarSorteo(){
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        if (isParticipaSorteo() == false){
            setParticipaSorteo(true);
        }
        else{
            setParticipaSorteo(false);
        }
    }
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }
    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    @Override
    public String toString(){
        String info = ("ID del tiquete: " + this.idTiquete + "\n" +
                       "Nombre del cliente: " + this.nombreCompleto + "\n" +
                       "Direccion del cliente: " + this.direccionResidencia + "\n" +
                       "Credenciales del cliente: " + this.credenciales + "\n" +
                       "¿Participa en el sorteo?: " + this.participaSorteo + "\n");
        return info;
    }
}