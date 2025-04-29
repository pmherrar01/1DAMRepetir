import java.util.Scanner;

public class Alumno {

    final static Scanner ENTRADA = new Scanner(System.in);

    private String nombre;
    private double nota;

    public double getNota() {
        return nota;
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno getAlumno(){

        return new Alumno( nombre,  nota);

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
