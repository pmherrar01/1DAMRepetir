import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje) {
        int numero;
        boolean error;

        numero = 0;

        do {
            error = false;
            System.out.println(mensaje);
            try {
                numero = ENTRADA.nextInt();
                if (numero < 1 || numero > 10) {
                    System.out.println("Error: el número debe estar entre 1 y 10.");
                    error = true;
                }
            } catch (Exception e) {
                System.out.println("Error: entrada no válida, introduce un número.");
                ENTRADA.next(); // Limpiar entrada inválida
                error = true;
            }
        } while (error);

        return numero;
    }

    public static void rellenarLista(List<Integer> lNumeros){
        while (lNumeros.size()<3){
            lNumeros.add(pedirNum("Introuce un numero que este entrel el 1 y el 10"));
        }
    }

    public static void mostrarLista(List<Integer> lNumeros){
        System.out.println(lNumeros);
    }

    public static void adivinarNum(List<Integer> lNumeros) {
        int num, intentosMaximos = 6; // Número razonable de intentos
        List<Character> lNumOcultos = new ArrayList<>();

        // Inicializar lNumOcultos con guiones
        for (int i = 0; i < 3; i++) {
            lNumOcultos.add('-');
        }

        int encontrados = 0;
        System.out.println("Adivina los 3 números. Estado inicial: " + lNumOcultos);

        for (int intento = 0; intento < intentosMaximos && encontrados < 3; intento++) {
            num = pedirNum("Introduce un número del 1 al 10 para adivinar el número misterioso: ");

            boolean adivinado = false;
            for (int i = 0; i < lNumeros.size(); i++) {
                if (lNumeros.get(i) == num && lNumOcultos.get(i) == '-') {
                    lNumOcultos.set(i, Character.forDigit(num, 10));
                    encontrados++;
                    adivinado = true;
                    System.out.println("¡Has adivinado un número!");
                    break;
                }
            }

            if (!adivinado) {
                System.out.println("Número no encontrado o ya adivinaste ese.");
            }
            System.out.println("Estado actual: " + lNumOcultos);
        }

        if (encontrados == 3) {
            System.out.println("¡Felicidades! Has adivinado todos los números.");
        } else {
            System.out.println("Se acabaron los intentos. Los números eran: " + lNumeros);
        }
    }

    public static void main(String[] args) {
        List<Integer> lNumeros = new ArrayList<>();

        rellenarLista(lNumeros);
        mostrarLista(lNumeros);
        adivinarNum(lNumeros);
    }
}