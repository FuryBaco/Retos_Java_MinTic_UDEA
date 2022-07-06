public class TurnoVirtual {
    //ATRIBUTOS

    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual;
    private int turnoEnAtencion;
    private int cantidadTurnosAtendidos; 

    //CONSTRUCTOR

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        //fill turnosPerdidos with empty strings
        for (int i = 0; i < turnosPerdidos.length; i++) {
            turnosPerdidos[i] = "";
        }
        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion = 0;
        this.cantidadTurnosAtendidos = 1;
    }

    //GETTERS AND SETTERS

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

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    //METODOS

    public void atenderProximoTurno() {
        if (this.estadoTurnoVirtual) {
            this.turnoEnAtencion = (this.turnoEnAtencion + 1) % this.turnos.length;
            this.cantidadTurnosAtendidos++;
        }
    }

    public void agregarTurnoPerdido() {
        if (this.estadoTurnoVirtual) {
            for (int i = 0; i < this.turnosPerdidos.length; i++) {
                if (this.turnosPerdidos[i].equals("")) {
                    this.turnosPerdidos[i] = this.turnos[this.turnoEnAtencion];
                    break;
                }
            }
        }
    }

    public void cambiarEstadoTurno() {
        if (this.estadoTurnoVirtual) {
            this.estadoTurnoVirtual = false;
        } else {
            this.estadoTurnoVirtual = true;
        }
    }
}