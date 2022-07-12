import java.util.Arrays;

public class Tripulante extends UsuarioMoodle {
    private double[] calificaciones;
    private boolean[] entregas;

    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = new double[n];
        for (int i = 0; i < n; i++) {
            calificaciones[i] = 0.0;
        }
        this.entregas = new boolean[n];
        for (int i = 0; i < n; i++) {
            this.entregas[i] = false;
        }
    }

    public void resolverReto(int retoAEntregar){
        this.entregas[retoAEntregar] = true;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }

    @Override
    public String toString(){
        String info = ("Nombre Completo: " + this.getNombreCompleto() + "\n" +
                       "Documento de Identidad: " + this.getDocumentoIdentidad() + "\n" +
                       "Password: " + this.getPassword() + "\n" +
                       "Correo: " + this.getCorreo() + "\n" +
                       "Descripcion: " + this.getDescripcion() + "\n" +
                       "Calificaciones: " + Arrays.toString(this.getCalificaciones()) + "\n" +
                       "Entregas: " + Arrays.toString(this.getEntregas()) + "\n");
        return info;
    }
}