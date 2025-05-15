public class Asignatura {
    private double nota;
    private String nombre;


    public Asignatura(String nombre, double nota) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nota=" + nota +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
