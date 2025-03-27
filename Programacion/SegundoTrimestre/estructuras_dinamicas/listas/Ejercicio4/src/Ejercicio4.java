//Lee 10 números por teclado. Guárdalos en una lista. Muéstrala. Elimina los números pares.
//Muéstrala otra vez.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextInt();
    }

    public static void rellenarLista(List<Integer> lNumeros){
        int i ;

        for(i = 0; i < 10; i++){
            lNumeros.add(pedirNum("Introduce un numero"));
        }
    }

    public static void mostrarLista(String mensaje, List<Integer> lNumeros){
        System.out.println(mensaje + lNumeros);
    }

    public static void eliminarPares(List<Integer> lNumeros){
        int i;

        for(i = 0; i < 10; i++){
            if (lNumeros.get(i) % 2 == 0){
                lNumeros.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lNumeros = new ArrayList<>();
        rellenarLista(lNumeros);
        mostrarLista("Lista sin ordenar", lNumeros);
        eliminarPares(lNumeros);
        mostrarLista("Ordenada", lNumeros);
    }
}