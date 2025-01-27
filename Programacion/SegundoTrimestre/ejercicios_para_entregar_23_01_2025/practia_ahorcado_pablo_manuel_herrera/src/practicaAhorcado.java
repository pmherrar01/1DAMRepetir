import java.util.Scanner;
import java.util.Random;

public class practicaAhorcado {

    public static final String[] palabrasFaciles = {"perro", "gato", "mesa", "silla", "guante", "elefante", "mariposa", "libro", "puerta", "pelota", "nube", "montaña"};
    public static final String[] palabrasDificiles = {"computadora", "universidad", "telescopio", "bicicleta", "escarabajo", "escenario", "tecnología", "confidencial"};
    public static int dificultad = 0;
    public static int intentos = 0;

    public static String seleccionarPalabra() {
        String palabraAleatoria;
        int i;
        if (dificultad == 1) {
            i = (int) (Math.random() * palabrasFaciles.length);
            palabraAleatoria = palabrasFaciles[i];
        } else {
            i = (int) (Math.random() * palabrasDificiles.length);
            palabraAleatoria = palabrasDificiles[i];
        }

        return palabraAleatoria;
    }

    public static void jugarPartida(String palabraParaAdivinar) {
        Scanner entrada1 = new Scanner(System.in);
        char[] guiones = new char[palabraParaAdivinar.length()];
        int i;
        char letra;
        boolean conseguido = false;
        boolean perder = false;

        for (i = 0; i < palabraParaAdivinar.length(); i++) {
            guiones[i] = '-';
        }

        do {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println("La palabra a adivinar es: ");
            System.out.println(String.valueOf(guiones));
            System.out.println("Introduce una letra:");
            letra = entrada1.next().charAt(0);

            if (!comprobarLetra(letra, guiones, palabraParaAdivinar)) {
                System.out.println("La letra " + letra + " no está en la palabra");
                intentos--;

                if (intentos == 0) {
                    System.out.println("¡No has adivinado la palabra! La palabra era: " + palabraParaAdivinar);
                    perder = true;
                }
            } else {
                if (compararPalabras(guiones, palabraParaAdivinar)) {
                    System.out.println("¡ENHORABUENA! Has ganado");
                    conseguido = true;
                }
            }

        } while (!conseguido && !perder);

    }


    public static boolean comprobarLetra(char letra, char[] palabraOculta, String palabraCompleta) {
        boolean encontrada;
        int i;
        encontrada = false;

        for (i = 0; i < palabraCompleta.length(); i++) {
            if (palabraCompleta.charAt(i) == letra) {
                palabraOculta[i] = letra;
                encontrada = true;

            }
        }

        return encontrada;
    }

    public static boolean compararPalabras(char[] guiones, String palabraAdivinar) {
        int i;

        for (i = 0; i < palabraAdivinar.length(); i++) {
            if (guiones[i] != palabraAdivinar.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean error;

        error = true;

        do {
            System.out.println("----- BIENBENIDO AL AHORCADO -----");
            System.out.println("Modos de juego disponibles:");
            System.out.println("1. Partida fácil");
            System.out.println("2. Partida dificil");
            System.out.println("Selecciona un modo de juego");
            num = entrada.nextInt();

            switch (num) {
                case 1:
                    System.out.println("1");
                    dificultad = 1;
                    intentos = 10;
                    break;
                case 2:
                    System.out.println("2");
                    dificultad = 2;
                    intentos = 6;
                    break;
                default:
                    System.out.println("Error ese numero no es admitido");
                    error = false;
            }

        } while (!error);

    }

    public static void main(String[] args) {
        menu();
        jugarPartida(seleccionarPalabra());
    }
}