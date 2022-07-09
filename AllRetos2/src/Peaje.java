import java.util.Arrays;

public class Peaje {
    private String[] filaCoches;
    private String[] cochesFlyPass;
    private boolean estadoPeaje = true;
    private int cantidadCochesAtendidos = 1;
    private int cochesEnAtencion = 0;

    public Peaje(String[] filaCoches) {
        this.filaCoches = filaCoches;
        this.cochesFlyPass = cochesFlyPass;
        this.estadoPeaje = estadoPeaje;
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
        this.cochesEnAtencion = cochesEnAtencion;
    }

    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public int getCochesEnAtencion() {
        return cochesEnAtencion;
    }

    public void setCochesEnAtencion(int cochesEnAtencion) {
        this.cochesEnAtencion = cochesEnAtencion;
    }

    

    @Override
    public String toString() {
        return "Peaje [cantidadCochesAtendidos=" + cantidadCochesAtendidos + ", cochesEnAtencion=" + cochesEnAtencion
                + ", cochesFlyPass=" + Arrays.toString(cochesFlyPass) + ", estadoPeaje=" + estadoPeaje + ", filaCoches="
                + Arrays.toString(filaCoches) + "]";
    }

    public void proximoCoche() {}
    public void agregarCocheFlyPass() {}
    public void cambiarEstadoPeaje() {}

    
}