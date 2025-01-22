//Escriba un programa que nos muestre cuantas veces aparece un carácter que se lee por
//teclado en una cadena.
//Ejemplo: Las vacaciones de Navidad
//Salida: La letra “a” aparece 5 veces
import java.util.Scanner;

public class Ejercicio3 {

    public static String pedirString(String mensaje){
        Scanner entrada = new Scanner(System.in);
        String cadena;

        System.out.println(mensaje);
        cadena = entrada.nextLine();

        return cadena;

    }

    public static int contarVocales(String cadena, String letra){
        int cont;

        cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(letra.equalsIgnoreCase(String.valueOf(cadena.charAt(i)))){
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena, letra;
        int cont;

        cadena = pedirString("Introduce una cadena de texto");
        System.out.println("Dime que vocal quieres que te busque:");
        letra = entrada.nextLine();
        cont = contarVocales(cadena,letra);

        System.out.println("La cadena de texto: " + cadena + " tiene un total de " + cont + " (" + letra + ")");
    }
}