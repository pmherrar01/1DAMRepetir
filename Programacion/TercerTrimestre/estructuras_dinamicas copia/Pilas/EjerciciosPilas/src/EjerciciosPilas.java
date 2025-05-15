import java.util.Scanner;
import java.util.Stack;

public class EjerciciosPilas {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static int pedirNum(String menasje){
        System.out.println(menasje);
        return ENTRADA.nextInt();
    }

    public static void menu(Stack<String> pPaginas) {
        String paginaActual = "Inicio";
        int opcion;


        do{
            System.out.println("\nPágina actual: " + paginaActual);
            System.out.println("Opciones:");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Ir atrás");
            System.out.println("3. Ir adelante");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = pedirNum("elige una opcion");

            switch (opcion){
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opcion != 4);


    }

    public static void main(String[] args) {
        Stack<String> pPaginas = new Stack<>();
    }
}