public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    private boolean participaSorteo;
    //Y SU MÉTODO CONSTRUCTOR
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia, String credenciales,
            boolean participaSorteo) {
        super(idTiquete, nombreCompleto, direccionResidencia, credenciales);
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
}
