import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    final static Scanner ENTRADA = new Scanner(System.in);
    final static int NUMASIGNATURA = 4;


    private String nombre;
    private double nota;
    private List<Asignatura> lAsignatura = new ArrayList<>();

    public double getNota() {
        return nota;
    }

    public Alumno(String nombre, double nota, List<Asignatura> lAsignatura) {
        this.nombre = nombre;
        this.nota = nota;
        this.lAsignatura = lAsignatura;
    }

    public Alumno getAlumno(){

        return new Alumno( nombre,  nota, lAsignatura);

    }



    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}

