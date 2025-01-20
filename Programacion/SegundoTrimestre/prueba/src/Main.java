import java.util.Scanner;

public class Main {

    public static void pruebaMac(String mensaje){
        System.out.println(mensaje);
    }

    public static void funcion1(int num){

        System.out.println(num);

    }
    public static int suma(int a, int b){
        int suma;

        suma = a + b;

        return suma;
    }

    public static void main(String[] args) {
        System.out.printf("Hola mundo");
        System.out.println("Probando");
        System.out.println("Haciendo mas pruebas");
        System.out.println("Haciendo mas pruebas1");
        System.out.println("Haciendo mas pruebas2");

        int num = 5, a = 0;
        char c  = 'c';
        boolean bandera = true;

        a++; //== a = a + 1
        a += 5; // a = a + 5

        // O == ||
        if (bandera || !bandera){
            System.out.println("Hola");
        }
        // y == &&
        if(bandera && !bandera){
            System.out.println("Hola");
        }
        // NO == !
        if(!bandera){
            System.out.println("Hola");
        }
        //distinto == !=
        if(bandera != !bandera){
            System.out.println("Hola");
        }


        if(!bandera) {
            System.out.println("Hola");
        }else {
            System.out.println("Adios");
        }

        funcion1(num);

        suma(5,5);

        pruebaMac("esta es una prueba desde el mac");

        int num6;
        Scanner entrada  = new Scanner(System.in);
        a = entrada.nextInt();

        String nombre = "pablo";
        System.out.println(nombre.length());  //muestra la longitud de una variable

        System.out.println("hola mundo".length()); //muestra la longitud de una cadena de texto

        System.out.println("hola mundo".charAt(5)); //muestra el caracter de la posicion 5 de la cadena de texto

        System.out.println("hola mundo".substring(4)); //muestra una subcadena a partir del indice que indiquemos en este caso el 4

        System.out.println("hola mundo".substring(3,8)); // muestra una subcadena que inicia en el indice que le indiquemos hasta el indice que le indiquemos en este caso desde el indice 3 hasta el inidice 8

        String s =  "Java desde Cero";
        int salida = s.indexOf("Cero"); // retorna 11 que es la posicion en la que se encuentra la cadena "Cero"
        System.out.println(salida);

        String sa =  "Java desde Cero";
        int salida2 = s.indexOf('a', 3);
        System.out.println(salida2);

        System.out.println("hola".equals("Hola"));// compara cadenas

        String op = "Ana";
        String po = "O";

        int compare = op.compareTo(po);
        System.out.println(compare);
    }

}