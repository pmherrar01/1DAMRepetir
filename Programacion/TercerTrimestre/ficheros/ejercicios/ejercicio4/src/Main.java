//En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
// Diseña un programa que procese el fichero y nos muestre el menor y el mayor

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static Path pasarARuta(String x){
        Path ruta = Paths.get(x);
        String fichero;

        if (Files.exists(ruta)){
            System.out.println("Introduce el nombre del fichero: ");
            fichero = ENTRADA.nextLine();
            ruta = ruta.resolve(fichero);
            if (Files.isRegularFile(ruta)){
                return ruta;
            }else {
                System.out.println("El fichero no existe.");
                return  null;
            }
        }else {
            System.out.println("La ruta no existe");
            return null;
        }

    }

    public static List<String> leerFichero(Path rutaFichero){
        List<String> lContenido = new ArrayList<>();

        try {

                lContenido = Files.readAllLines(rutaFichero);

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
        return lContenido;
    }

    public static int buscarNumPequeño(List<String> lContenido){
        int numMenor = Integer.MAX_VALUE, num;

        for (String l : lContenido){
            try{
                num = Integer.parseInt(l.trim());
                if(num < numMenor){
                    numMenor = num;
                }

            }catch (NumberFormatException e){

            }

        }


        return numMenor;

    }

    public static int calcularNumMayor(List<String> lContenido){
        int numMayor = Integer.MIN_VALUE, num;
        for (String l : lContenido){
            try {
                num = Integer.parseInt(l.trim());
                if (num > numMayor){
                    numMayor = num;
                }
            }catch (NumberFormatException e){

            }
        }
        return numMayor;
    }

    public static void mostrarContenido(List<String> lContenido){
        for (String l: lContenido){
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        int numMayor, numMenor;
        Path rutaFichero;
        List<String> lContenido = new ArrayList<>();

        rutaFichero = pasarARuta(pedirString("ntroduce la ruta donde se encuentra el fichero:"));

        lContenido = leerFichero(rutaFichero);

        numMayor = calcularNumMayor(lContenido);
        numMenor = buscarNumPequeño(lContenido);

        mostrarContenido(leerFichero(rutaFichero));
        System.out.println(" numero menor y mayor de este fiecheros son:  mayor: " + numMayor + " menor: " + numMenor);


    }
}