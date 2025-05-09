import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    final static Scanner ENTRADA = new Scanner(System.in);

    private String nombre;
    private List<Asignatura> lAsignaturas = new ArrayList<>();

    public Alumno(String nombre) {

        this.nombre = nombre;
        this.lAsignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void getAsignatura(String nombre, double nota){
        lAsignaturas.add(new Asignatura(nombre, nota));
    }

    public List<Asignatura> getAsignaturas() {
        return lAsignaturas;
    }


    public  double calcularNotaMedia(){
        double media = 0;

        for(Asignatura asi: lAsignaturas){
            media += asi.getNota();
        }

        return media/lAsignaturas.size();
    }

    public void mostrarNotas(){
        for(Asignatura asi: lAsignaturas){
            asi.toString();
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", lAsignaturas=" + lAsignaturas +
                '}';
    }
}
