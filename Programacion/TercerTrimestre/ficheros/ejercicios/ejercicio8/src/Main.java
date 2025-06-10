import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static List<Jugador> rellenarJugadores(){
        List<Jugador> lJugadores = new ArrayList<>();

        Jugador j1 = new Jugador(1, "Carlos", 25, 10, 5, 1500, Posicion.CENTROCAMPISTA);
        lJugadores.add(j1);
        Jugador j2 = new Jugador(2, "Pedro", 22, 8, 3);
        lJugadores.add(j2);
        Jugador j3 = new Jugador(3, "Luis", 28, 5);
        lJugadores.add(j3);
        Jugador j4 = new Jugador(4, "Pablo", 20, 13, 3,20, Posicion.PORTERO);
        lJugadores.add(j4);
        Jugador j5 = new Jugador(5, "Juan", 20, 5);
        lJugadores.add(j5);

        return lJugadores;
    }

    public static int pedirInt(String mensaje){
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();
        ENTRADA.nextLine();
        return num;
    }

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static void mostrarLista(List<Jugador> lJugadores){
        for (Jugador j: lJugadores){
            System.out.println(j);
        }
    }

    public static Jugador buscarJugador(List<Jugador> lJugadores){
        String nombre = pedirString("Introduce el nombre del jugador que deseas buscar");
        for (Jugador ju: lJugadores){
            if (ju.getNombre().equalsIgnoreCase(nombre)){
                return  ju;
            }
        }
        return null;
    }

    public static double calcularGastos(List<Jugador> lJugadores){
        double total = 0;

        for (Jugador j: lJugadores){
            total += j.getSalario();
        }

        return  total;
    }

    public static Jugador buscarMaximoGoleador(List<Jugador> lJugadores){
        int goles = 0;

        for (Jugador j: lJugadores){
            if (j.getNumGoles() >= goles){
                goles = j.getNumGoles();
            }
        }

        for (Jugador ju: lJugadores){
            if (ju.getNumGoles() == goles){
                return ju;
            }
        }
        return null;
    }

    public static void menu(List<Jugador> lJugadores){
        int opcion;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1- Mostrar Jugadores");
            System.out.println("2- Buscar Jugador");
            System.out.println("3- Mostrar cantidad salarios");
            System.out.println("4- Maximo goleador");
            System.out.println("5- salir");
            opcion = pedirInt("Elige una opcxion");

            switch (opcion){
                case 1:
                    mostrarLista(lJugadores);
                    break;
                case 2:
                    Jugador j;
                    j = buscarJugador(lJugadores);
                    if (j == null){
                        System.out.println("El jugador que deseas buscar no se encuentra");
                    }else{
                        System.out.println("El jugador que has buscado es :" + j);
                    }

                    break;
                case 3:
                    double gastos;

                    gastos = calcularGastos(lJugadores);

                    System.out.println("el total de gastos es: " + gastos);
                    break;
                case 4:
                    Jugador ju;

                    ju = buscarMaximoGoleador(lJugadores);

                    System.out.println("El maximo goleador es: " + ju);

                    break;
                default:
                    System.out.println("saliendo...");
                    break;
            }
        }while (opcion != 5);
    }

    public static void main(String[] args) {
        List<Jugador> lJugadores = new ArrayList<>();

        lJugadores = rellenarJugadores();
        menu(lJugadores);


    }
}