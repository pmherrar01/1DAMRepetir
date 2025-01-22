    //Escriba un programa que lea una cadena por teclado y la invierta
    import java.util.Scanner;
    public class Ejercicio2 {

        public static String pedirCadena(String mensaje){
            Scanner entrada = new Scanner(System.in);
            String cadena;

            System.out.println(mensaje);
            cadena = entrada.nextLine();

            return cadena;
        }

        public static String invertirCadena(String cadena){
            String cadenaInvertida = "";
            int i;

            for(i = cadena.length() - 1; i >=0; i--){
                cadenaInvertida += cadena.charAt(i);
            }

            return cadenaInvertida;

        }

        public static void main(String[] args) {
            String cadena, cadenaInvertida;

            cadena = pedirCadena("Introduce una cadena de texto");
            cadenaInvertida = invertirCadena(cadena);

            System.out.println("La cadena invertida:  " + cadenaInvertida);

        }
    }