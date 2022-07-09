import java.util.Arrays;

public class TurnoVirtual {

    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual = true;
    private int turnosEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = turnosPerdidos;
    }

    public String[] getTurnos() {
        return turnos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public int getTurnosEnAtencion() {
        return turnosEnAtencion;
    }

    public void setTurnosEnAtencion(int turnosEnAtencion) {
        this.turnosEnAtencion = turnosEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    @Override
    public String toString() {
        return "TurnoVirtual [cantidadTurnosAtendidos=" + cantidadTurnosAtendidos + ", estadoTurnoVirtual="
                + estadoTurnoVirtual + ", turnos=" + Arrays.toString(turnos) + ", turnosEnAtencion=" + turnosEnAtencion
                + ", turnosPerdidos=" + Arrays.toString(turnosPerdidos) + "]";
    }

    public void atenderProximoTurno() {}
    public void agregarTurnoPerdido() {}
    public void cambiarEstadoTurno() {}
    
}
