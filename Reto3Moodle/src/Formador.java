public class Formador extends UsuarioMoodle {

    public String escalafon;

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }

    public void calificar(Tripulante tripulanteACalificar, int k) {
        double[] calificacion = tripulanteACalificar.getCalificaciones();
        if (tripulanteACalificar.getEntregas()[k] == true) {
            calificacion[k] = 5.0;
            tripulanteACalificar.setCalificaciones(calificacion);
        } else if (tripulanteACalificar.getEntregas()[k] == false) {
            calificacion[k] = 0;
            tripulanteACalificar.setCalificaciones(calificacion);
        }
    }

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }

    @Override
    public String toString(){
        String info = ("Nombre Completo: " + this.getNombreCompleto() + "\n" +
                       "Documento de Identidad: " + this.getDocumentoIdentidad() + "\n" +
                       "Password: " + this.getPassword() + "\n" +
                       "Correo: " + this.getCorreo() + "\n" +
                       "Descripcion: " + this.getDescripcion() + "\n" +
                       "Escalafon: " + this.getEscalafon() + "\n");
        return info;
    }
    
}
