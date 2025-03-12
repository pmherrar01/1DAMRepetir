package objets;

public class Profesor {
    protected String dni, nombre, instituto;
    protected Especialidad especialidad;

    public Profesor(String dni, String nombre, Especialidad especialidad, String instituto) {
        this.dni = dni;
        this.nombre = nombre;
        this.instituto = instituto;
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getInfo() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", objets.Especialidad: " + especialidad + ", Instituto: " + instituto;
    }
}
