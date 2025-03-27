//Ejercicio 2
//Lee 10 números por teclado, insértalos en una lista ordenados ascendentemente y muéstralos
//por pantalla.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio2{

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextInt();
    }

    public static void rellenarLista(List<Integer> lNumeros){
        int i;

        for (i = 0; i < 10; i++){
            lNumeros.add(pedirNum("Introduce un numero"));
        }
    }

    public static void mostrarLista(List<Integer> lNumeros){
        System.out.println("Lista ordenada de forma ascendente: " + lNumeros);
    }


    public static void main(String[] args)  {
        List<Integer> lNumeros = new ArrayList<>();
        rellenarLista(lNumeros);
        Collections.sort(lNumeros);
        mostrarLista(lNumeros);

    }

}