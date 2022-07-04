public class ReproductorMusica {
    
    //ATRIBUTOS
    private String[] canciones;
    private int cancionReproduciendo;
    private int[] cancionesFavoritas;
    private boolean pausado;    
    
    //MÉTODOS
    public ReproductorMusica(String[] canciones) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO
        this.canciones = canciones;
        this.cancionReproduciendo = 0;
        this.cancionesFavoritas = new int[canciones.length];
        for (int i = 0; i < cancionesFavoritas.length; i++) {
            cancionesFavoritas[i] = -1;
        }
        this.pausado = true;

    }
    
    public void proximaCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if (cancionReproduciendo < canciones.length - 1) {
            cancionReproduciendo++;
        } else {
            cancionReproduciendo = 0;
        }
    }
    
    public void devolverCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if (cancionReproduciendo > 0) {
            cancionReproduciendo--;
        } else {
            cancionReproduciendo = canciones.length - 1;
        }
    }
    
    public void cambiarEstadoReproduccion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if (pausado) {
            pausado = false;
        } else {
            pausado = true;
        }
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                return;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }                
    }

    public String[] getCanciones() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.canciones = canciones;
    }

    public int[] getCancionesFavoritas() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return pausado;
    }

    public void setPausado(boolean pausado) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionReproduciendo = cancionReproduciendo;
    }
    
}