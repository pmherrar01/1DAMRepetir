//Ejercicio 1
//Lee 10 números por teclado, insértalos en una lista y muéstralos por pantalla.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){
        int num;
        System.out.println(mensaje);
        return ENTRADA.nextInt();
    }

    public static void rellenarLista(List<Integer> lNumeros){
        int i;

        for(i = 0; i < 10; i++){
            lNumeros.add(pedirNum("Introduce el nuemero que quieres introducir"));
        }

    }

    public static void mostrarLista(List<Integer> lNumeros){
        System.out.println("Lista de 10 numeros :" + lNumeros);
    }

    public static void main(String[] args) {
        List<Integer> lNumeros = new ArrayList<>();
        rellenarLista(lNumeros);
        mostrarLista(lNumeros);

    }
}