//Escriba un programa que lea una cadena por teclado y muestre por pantalla la cantidad de
//vocales que tiene.
import java.util.Scanner;

public class Ejercicio1 {

    public static String pedirCadena(String mensaje){
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();

        return cadena;
    }

    public static int contarVocales(String cadena){
        int cont, i;
        String vocales;

        cont = 0

        vocales = "a, e, i, o, u";

        for(i = 0; i < cadena.length(); i++){
            if(cadena.charAt().equalsIgnoreCase(vocales)){
                cont += 1;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        String cadena;

        cadena = pedirCadena("Introduce una cadena de texto y te cuento las vocales");
    }
}