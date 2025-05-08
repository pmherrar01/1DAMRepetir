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
import java.util.Scanner;

public class Ejercicio1 {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static double calcularMedia(List<Alumno> lAlumnos){
        double media = 0;
        int i;

        for (i = 0; i < lAlumnos.size(); i++){
            media += lAlumnos.get(i).getNota() ;
        }

        return media/lAlumnos.size();

    }


    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static double pedirNum(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextDouble();
    }

    public static void crearAlumno(List<Alumno> lAlumuno){
        Alumno alu = new Alumno(pedirString("Nombre del Alumno:"), pedirNum("Nota media:"));
        lAlumuno.add(alu);
    }

    public static void buscarNota(List<Alumno> lAlumuno){
        String nombreALumnoABuscar = pedirString("Dime el alumo que quieres buscar: ");
        boolean encontrado = false;

        for (Alumno alu: lAlumuno){
            if (nombreALumnoABuscar.equalsIgnoreCase(alu.getNombre())){
                System.out.println("La nota media del alumno: " + alu.getNombre() + " es " + alu.getNota());
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("Alumno no encontrado");
        }

    }

    public static double calcularNotaMedia(List<Alumno> lAlumnos){
        double notamedia = 0;

        for (Alumno alu: lAlumnos){
            notamedia += alu.getNota();
        }

        return notamedia/lAlumnos.size();
    }

    public static void menu(List<Alumno> lAlumnos){
        int opcion;

        do {
            System.out.println("\n--- Gestión de Notas ---");
            System.out.println("1. Crear alumno");
            System.out.println("2. Buscar nota de un alumno");
            System.out.println("3. Calcular nota media");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = ENTRADA.nextInt();
            ENTRADA.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearAlumno(lAlumnos);
                    break;
                case 2:
                    buscarNota(lAlumnos);
                    break;
                case 3:
                    System.out.println("La nota media de todos los alumnos es: " + calcularNotaMedia(lAlumnos));
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        List<Alumno> lAlumnos = new ArrayList<>();
        menu(lAlumnos);

    }
}