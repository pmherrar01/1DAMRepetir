//Ejercicio 6
//Lee 10 números por teclado. Guárdalos en una lista. Calcula y muestra la suma de los
//factoriales de los números.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){

        System.out.println(mensaje);
        return ENTRADA.nextInt();
    }

    public static void rellenarLista(List<Integer> lNumeros){
        int i;

        for (i = 0; i < 10 ; i++) {
            lNumeros.add(pedirNum("Introduce un numero"));
        }
    }

    public static int calcularFactorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        if (n > 12) {
            throw new IllegalArgumentException("El factorial de " + n + " excede el rango de int");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);


    }

    public static int  calcularSumaFactorial(List<Integer> lNumeros){
        int suma = 0;

        int i;

        for (i = 0; i < lNumeros.size(); i ++){
            suma += calcularFactorial(lNumeros.get(i));
        }

        return suma;
    }

    public static void main(String[] args) {
        List<Integer> lNumeros = new ArrayList<>();
        rellenarLista(lNumeros);
        System.out.println("La suma de los factoriales de:" + lNumeros + " es: " + calcularSumaFactorial(lNumeros));
    }
}