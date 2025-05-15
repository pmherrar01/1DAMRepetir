//Ejercicio 3
//Crea ahora una clase módulo. La clase módulo tendrá las siguientes características:
//● Un identificador único que se generará de forma automática.
//● Un nombre de módulo. Este atributo será de solo lectura y obligatorio.
//● Un profesor que impartirá el módulo. Será opcional.
//● 1 a N alumnos matriculados. Se podrán matricular nuevos alumnos y eliminarlos. Cada
//alumno tendrá un atributo nota, que será la nota del alumno en este módulo.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    final static Scanner ENTRADA = new Scanner(System.in);


    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static double pedirNum(String mensaje) {
        System.out.println(mensaje);
        return ENTRADA.nextDouble();
    }

    public static void crearAlumno(List<Alumno> lAlumuno) {
        Scanner teclado = new Scanner(System.in);
        int cantidadAsig, i;
        String nombreAsignatura;
        double notaAsi;
        Alumno alu = new Alumno(pedirString("Nombre del Alumno:"));

        System.out.println("Cuantas asignatuas tiene?");
        cantidadAsig = ENTRADA.nextInt();

        for(i = 0; i < cantidadAsig; i++){
            System.out.println("Nombre de la asignatura #" + (i+1) + ":" );
            nombreAsignatura = teclado.nextLine();
            System.out.println("Nota: ");
            notaAsi = Double.parseDouble(teclado.nextLine());
            alu.getAsignatura(nombreAsignatura,notaAsi);

        }

        lAlumuno.add(alu);
    }

    public static void calcularNotaMedia(List<Alumno> lAlumnos) {
        double notamedia = 0;

        for (Alumno alu : lAlumnos) {
            notamedia = alu.calcularNotaMedia();
            System.out.println("La nota media de " + alu.getNombre() + " es: " + notamedia);
        }

    }

    public static void borrarAlumno(List<Alumno> lAlumnos) {
        Alumno alu;
        String nombreABuscar;

        nombreABuscar = pedirString("Nombre del alumo que deseas borrar");

        alu = buscarAlumno(nombreABuscar, lAlumnos);
        if (alu != null) {
            lAlumnos.remove(alu);
            System.out.println("Alumno eliminado.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static Alumno buscarAlumno(String nombre, List<Alumno> lAlumnos) {
        for (Alumno a : lAlumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    private static void mostrarNotas(List<Alumno> lAlumnos) {
        System.out.print("Nombre del alumno: ");
        String nombre = ENTRADA.nextLine();
        Alumno alumno = buscarAlumno(nombre,lAlumnos);

        if (alumno != null) {
            System.out.println("Notas de " + alumno.getNombre() + ":");
            for (Asignatura a : alumno.getAsignaturas()) {
                System.out.println(a);
            }
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    public static void menu(List<Alumno> lAlumnos) {
        int opcion;

        do {
            System.out.println("\n--- Gestión de Notas ---");
            System.out.println("1. Crear alumno y agregar asignaturas");
            System.out.println("2. Ver notas de un alumno");
            System.out.println("3. Ver nota media de un alumno");
            System.out.println("4. Borrar alumno");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = ENTRADA.nextInt();
            ENTRADA.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearAlumno(lAlumnos);
                    break;
                case 2:
                    mostrarNotas(lAlumnos);
                    break;
                case 3:
                    calcularNotaMedia(lAlumnos);
                    break;
                case 4:
                    borrarAlumno(lAlumnos);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        List<Alumno> lAlumnos = new ArrayList<>();
        menu(lAlumnos);

    }
}