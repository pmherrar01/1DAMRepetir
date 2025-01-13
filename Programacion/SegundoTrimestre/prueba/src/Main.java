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
    }
}