//Ejercicio 1
//Crea un programa que permita gestionar las notas de los alumnos. Para ello crearás una clase
//alumno que tendrá los atributos nombre y nota. El programa permitirá crear alumnos, buscar
//las notas de un alumno dado el nombre y calcular la nota media de todos los alumnos.

import java.util.ArrayList;
import java.util.List;

public class Main {

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