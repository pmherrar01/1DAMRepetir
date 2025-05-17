import java.util.ArrayDeque;   // ← mejor que Stack
import java.util.Deque;
import java.util.Scanner;

public class EjerciciosPilas {

    private static final Scanner ENTRADA = new Scanner(System.in);

    /* ---------- Utilidades de entrada ---------- */

    private static String pedirString(String mensaje) {
        System.out.print(mensaje + ": ");
        return ENTRADA.nextLine().trim();
    }

    private static int pedirNum(String mensaje) {
        int n;
        while (true) {
            System.out.print(mensaje + ": ");
            if (ENTRADA.hasNextInt()) {
                n = ENTRADA.nextInt();
                ENTRADA.nextLine();          // ← consume el salto de línea pendiente
                break;
            } else {
                System.out.println("Debes introducir un número.");
                ENTRADA.nextLine();          // ← descarta lo mal escrito
            }
        }
        return n;
    }

    /* ---------- Lógica del navegador ---------- */

    private static void menu() {

        Deque<String> pilaBack    = new ArrayDeque<>();
        Deque<String> pilaForward = new ArrayDeque<>();
        String paginaActual = "Inicio";
        boolean salir = false;

        while (!salir) {
            System.out.println("\nPágina actual: " + paginaActual);
            System.out.println("""
                    Opciones:
                    1. Visitar nueva página
                    2. Ir atrás
                    3. Ir adelante
                    4. Salir""");

            int opcion = pedirNum("Elige una opción");

            switch (opcion) {
                case 1 -> {                       // visitar nueva página
                    String nueva = pedirString("Ingresa la URL");
                    if (!nueva.isEmpty()) {
                        pilaBack.push(paginaActual);  // guarda la actual
                        paginaActual = nueva;
                        pilaForward.clear();          // pierdes la ruta hacia delante
                    }
                }
                case 2 -> {                       // ir atrás
                    if (pilaBack.isEmpty()) {
                        System.out.println("No hay páginas anteriores.");
                    } else {
                        pilaForward.push(paginaActual);
                        paginaActual = pilaBack.pop();
                    }
                }
                case 3 -> {                       // ir adelante
                    if (pilaForward.isEmpty()) {
                        System.out.println("No hay páginas posteriores.");
                    } else {
                        pilaBack.push(paginaActual);
                        paginaActual = pilaForward.pop();
                    }
                }
                case 4 -> {
                    salir = true;
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    /* ---------- main ---------- */

    public static void main(String[] args) {
        menu();
    }
}
