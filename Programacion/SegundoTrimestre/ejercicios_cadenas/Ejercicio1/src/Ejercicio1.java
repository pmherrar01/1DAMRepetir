//Escriba un programa que lea una cadena por teclado y muestre por pantalla la cantidad de
//vocales que tiene.
import java.util.Scanner;

public class Ejercicio1 {

    public static String pedirCadena(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        String cadena = entrada.nextLine();

        return cadena;
    }

    public static int contarVocales(String cadena){
        int cont, i;
        String vocales;

        cont = 0;
        vocales = "aeiouAeiou";

        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        String cadena;
        int cont;

        cadena = pedirCadena("Introduce una cadena de texto y te cuento las vocales");
        cont = contarVocales(cadena);
        System.out.println("En la cadena de texto: (" + cadena + ") hay una cantidad de " + cont + " vocales");
    }
}