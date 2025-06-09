//Implementa una aplicación que mantenga un registro de las temperaturas máxima y mínima diarias medidas en una estación meteorológica.
// Los datos se guardarán en un archivo de texto con el siguiente formato:
//Fecha            Temperatura máxima     Temperatura mínima
//
//
//2020-01-15                  12                  -1
//
//
//2020-01-16                  15                   2
//Al arrancar la aplicación aparecerá un menú con las opciones:
//
//
//1. Registrar nueva temperatura.
//
//
//2. Mostrar historial de registros.
//
//
//3. Salir.
//
//
//El historial de registros mostrará todos los datos registrados junto con el máximo valor de las temperaturas máximas y el mínimo de las temperaturas mínimas.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextInt();
    }

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static void menu(){
        int opcion;
        Path ruta;
        Temperatura tem;


        ruta = Paths.get(pedirString("Introduce la ruta del fichero"));
        ruta = ruta.resolve(pedirString("Nombre del Fichero: "));



        do {

            System.out.println("-----MENU-----");
            System.out.println("1- Registrar Nueva Temperatura");
            System.out.println("2- Mostrar registro de temperaturas");
            System.out.println("3- Salir");
            opcion = pedirNum("Elige una opcion");

            switch (opcion){
                case 1:
                    tem = new Temperatura();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

            }

        }while (opcion != 3);

    }

    public static void main(String[] args) {
        menu();
    }
}