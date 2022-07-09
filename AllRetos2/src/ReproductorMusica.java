import java.util.Arrays;

public class ReproductorMusica {

    private String[] canciones;
    private String[] cancionesFavoritas;
    private boolean estadoReproductor = true;
    private int cancionesReproduciendo = 0;

    public ReproductorMusica(String[] canciones) {
        this.canciones = canciones;
        this.cancionesFavoritas = cancionesFavoritas;
    }
    
    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public String[] getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(String[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isEstadoReproductor() {
        return estadoReproductor;
    }

    public void setEstadoReproductor(boolean estadoReproductor) {
        this.estadoReproductor = estadoReproductor;
    }

    public int getCancionesReproduciendo() {
        return cancionesReproduciendo;
    }

    public void setCancionesReproduciendo(int cancionesReproduciendo) {
        this.cancionesReproduciendo = cancionesReproduciendo;
    }

    

    @Override
    public String toString() {
        return "ReproductorMusica [canciones=" + Arrays.toString(canciones) + ", cancionesFavoritas="
                + Arrays.toString(cancionesFavoritas) + ", cancionesReproduciendo=" + cancionesReproduciendo
                + ", estadoReproductor=" + estadoReproductor + "]";
    }

    public void proximaCancion() {
        cancionesReproduciendo++;
    }

    public void devolverCancion() {
        cancionesReproduciendo--;
    }

    public void cambiarEstadoReproduccion() {
        estadoReproductor = !estadoReproductor;
    }

    public void agregarCancionesFavoritas(String[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }
    
}
