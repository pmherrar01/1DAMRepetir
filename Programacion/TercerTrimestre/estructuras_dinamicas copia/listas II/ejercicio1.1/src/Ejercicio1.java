//Ejercicio 1.1
//Agrega ahora al ejercicio anterior las siguientes características.
//● Cada alumno tendrá asociadas las notas de N asignaturas definidas como nombre y
//nota. Por ejemplo, puede tener las notas del módulo programación que contendrían el
//nombre y la nota. Debería ser posible obtener todas las notas del alumno sabiendo
//tanto la asignatura como la nota.
//● Para cada alumno, existirá un método que permitirá calcular la nota media del alumno a
//partir de las notas de todas las asignaturas.
//● Añade la la funcionalidad de borrar un alumno a partir del nombre.

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static double calcularMedia(List<Alumno> lAlumnos){
        double media = 0;
        int i;

        for (i = 0; i < lAlumnos.size(); i++){
            media += lAlumnos.get(i).getNota() ;
        }

        return media/lAlumnos.size();

    }

    public static void main(String[] args) {
        List<Alumno> lAlumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Paco", 7.8);
        lAlumnos.add(alumno1);
        Alumno alumno2 = new Alumno("Pablo", 3.8);
        lAlumnos.add(alumno2);
        Alumno alumno3 = new Alumno("Jusn", 4);
        lAlumnos.add(alumno3);
        Alumno alumno4 = new Alumno("Pepe", 8);
        lAlumnos.add(alumno4);

        System.out.println("La nota media de los alumnos: " + lAlumnos + " es: " + calcularMedia(lAlumnos));
    }
}