import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Modulo {
    private static int cont = 1;
    private int idModulo;
    private String nombre;
    private Profesor profesor;
    private List<Alumno> lAlumnos;


    public Modulo(String nombre) {
        this.idModulo = cont++;
        this.nombre = nombre;
        this.lAlumnos = new ArrayList<>();
    }

    public int getId() {
        return idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}



