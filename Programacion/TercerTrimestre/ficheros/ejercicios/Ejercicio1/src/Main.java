//Crea una aplicación en java que reciba por teclado un directorio y una extensión de archivo y muestre en pantalla sólo los ficheros con esa extensión.
//
//Ejemplo:
//Introduce directorio:    C:\Pruebas
//Filtrar por extensión:   txt
//Salida de C:\Pruebas
//info.txt
//fichero.txt


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);
    static Path RUTA = Paths.get("");

    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static boolean comprobarDirectorio(String x) {
        Path ruta = Paths.get(x);
        RUTA = ruta;

        if (Files.exists(ruta) || Files.isDirectory(ruta)) {
            return true;
        } else {
            return false;
        }

    }

    public static void buscarExtension(Path ruta) {
        boolean encontrado = false;
        String respuesta = "", extension;


        do {
            extension = pedirString("Introduce la extension que deseas buscar");
            try {
                for (Path pa : Files.walk(ruta).toList()) {
                    if (Files.isRegularFile(pa)) {
                        if (pa.getFileName().toString().endsWith(extension)) {
                            System.out.println(pa.getFileName());
                            encontrado = true;
                        }
                    }
                }

                if (!encontrado) {
                    System.out.println("Esa extencion no se encuentra en este directorio ):");
                    System.out.println("Quieres buscar otra extension?");
                    respuesta = ENTRADA.nextLine();
                }


            } catch (IOException e) {
                System.out.println("Eror al leer el directorio.");
            }
        } while (respuesta.equalsIgnoreCase("si" ) || !encontrado);
    }

    public static void main(String[] args) {


        if (comprobarDirectorio(pedirString("Introduce una ruta"))) {
            System.out.println("Ruta correcta");
            buscarExtension(RUTA);
        } else {
            System.out.println("Esa ruta no existe");
        }


    }
}