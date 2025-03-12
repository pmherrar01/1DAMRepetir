import objets.Especialidad;

public class Vacante {
    private static int contador = 1;
    private int id;
    private String instituto;
    private Especialidad especialidad;
    private String fechaInicio;
    private String fechaFin;

    public Vacante(String instituto, Especialidad especialidad, String fechaInicio, String fechaFin) {
        this.id = contador++;
        this.instituto = instituto;
        this.especialidad = especialidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Vacante(String instituto, Especialidad especialidad, String fechaInicio) {
        this(instituto, especialidad, fechaInicio, "CURSO COMPLETO");
    }

    public int getId() {
        return id;
    }

    public String getInstituto() {
        return instituto;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
}
