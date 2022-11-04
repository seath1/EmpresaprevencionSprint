package cl.awakelab.empresaprevencion.modelos;

public class Capacitacion {

    private int idCapacitacion;

    private String nombreCapacitacion;

    private String EmpresaCapacitacion;

    private String fechaCapacitacion;

    private String ciudadCapacitacion;

    private Integer participantesCapacitacion;


    public Capacitacion() {
    }

    public Capacitacion(int idCapacitacion, String nombreCapacitacion, String empresaCapacitacion, String fechaCapacitacion, String ciudadCapacitacion, Integer participantesCapacitacion) {
        this.idCapacitacion = idCapacitacion;
        this.nombreCapacitacion = nombreCapacitacion;
        EmpresaCapacitacion = empresaCapacitacion;
        this.fechaCapacitacion = fechaCapacitacion;
        this.ciudadCapacitacion = ciudadCapacitacion;
        this.participantesCapacitacion = participantesCapacitacion;
    }

    public Capacitacion(String nombreCapacitacion, String empresaCapacitacion, String fechaCapacitacion, String ciudadCapacitacion, Integer participantesCapacitacion) {
        this.nombreCapacitacion = nombreCapacitacion;
        EmpresaCapacitacion = empresaCapacitacion;
        this.fechaCapacitacion = fechaCapacitacion;
        this.ciudadCapacitacion = ciudadCapacitacion;
        this.participantesCapacitacion = participantesCapacitacion;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public String getNombreCapacitacion() {
        return nombreCapacitacion;
    }

    public String getEmpresaCapacitacion() {
        return EmpresaCapacitacion;
    }

    public String getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public String getCiudadCapacitacion() {
        return ciudadCapacitacion;
    }

    public Integer getParticipantesCapacitacion() {
        return participantesCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public void setNombreCapacitacion(String nombreCapacitacion) {
        this.nombreCapacitacion = nombreCapacitacion;
    }

    public void setEmpresaCapacitacion(String empresaCapacitacion) {
        EmpresaCapacitacion = empresaCapacitacion;
    }

    public void setFechaCapacitacion(String fechaCapacitacion) {
        this.fechaCapacitacion = fechaCapacitacion;
    }

    public void setCiudadCapacitacion(String ciudadCapacitacion) {
        this.ciudadCapacitacion = ciudadCapacitacion;
    }

    public void setParticipantesCapacitacion(Integer participantesCapacitacion) {
        this.participantesCapacitacion = participantesCapacitacion;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion=" + idCapacitacion +
                ", nombreCapacitacion='" + nombreCapacitacion + '\'' +
                ", EmpresaCapacitacion='" + EmpresaCapacitacion + '\'' +
                ", fechaCapacitacion='" + fechaCapacitacion + '\'' +
                ", ciudadCapacitacion='" + ciudadCapacitacion + '\'' +
                ", participantesCapacitacion=" + participantesCapacitacion +
                '}';
    }
}