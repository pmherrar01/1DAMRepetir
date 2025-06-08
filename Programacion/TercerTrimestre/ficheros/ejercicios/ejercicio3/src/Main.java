//Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los caracteres, las líneas y las palabras.
// Para simplificar supondremos que cada palabra está separada de otra por un único espacio en blanco o por un cambio de línea.

import javax.print.DocFlavor;
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

        if (Files.exists(ruta)){
            return  ruta;
        }

        return null;

    }

    public static List<String> leerFichero(Path ruta){
        List<String> lFichero = new ArrayList<>();

        try {
            if (Files.exists(ruta)){
            lFichero = Files.readAllLines(ruta);
            }

        } catch (IOException e) {
            System.out.println("error al leer el fichero");
        }

        return  lFichero;

    }

    public static int contarCaracteres(List<String> lContenido){
        int cont = 0;
        for (String c : lContenido){
         cont += c.length();
        }

        cont += lContenido.size() -1;

        return cont;
    }

    public static int contarPalabras(List<String> lContenido){
        int cont = 0;

        for (String linea : lContenido){
            String[] palabras = linea.split(" ");
            cont += palabras.length;
        }

        return cont;
    }

    public static void main(String[] args) {

        Path ruta = pasarARuta(pedirString("Introduce la ruta del fichero"));
        String nombreFichero = pedirString("Introduce el nombre del fichero");

        Path rutaFichero = ruta.resolve(ruta,nombreFichero);

    }
}