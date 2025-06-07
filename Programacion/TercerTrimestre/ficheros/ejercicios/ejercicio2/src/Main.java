import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return ENTRADA.nextLine().trim();
    }

    public static Path pasarARuta(String ruta) {
        return Paths.get(ruta);
    }

    public static String leerFicheroComoTexto(Path directorio, String nombreFichero) {
        Path rutaFichero = directorio.resolve(nombreFichero);

        try {
            if (Files.exists(rutaFichero)) {
                // Leer todo el contenido como una única cadena
                return Files.readString(rutaFichero);
            } else {
                System.out.println("El fichero no existe: " + rutaFichero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return "";
    }

    public static void main(String[] args) {
        // Leer primer fichero
        Path dir1 = pasarARuta(pedirString("Introduce la ruta del primer fichero:"));
        String nombre1 = pedirString("Introduce el nombre del primer fichero:");
        String contenido1 = leerFicheroComoTexto(dir1, nombre1);

        // Leer segundo fichero
        Path dir2 = pasarARuta(pedirString("Introduce la ruta del segundo fichero:"));
        String nombre2 = pedirString("Introduce el nombre del segundo fichero:");
        String contenido2 = leerFicheroComoTexto(dir2, nombre2);

        // Ruta destino
        Path destino = pasarARuta(pedirString("Introduce la ruta de destino:"));

        // Crear el nombre del nuevo fichero
        String nombreFinal = nombre1.replace(".txt", "") + "_" + nombre2;
        Path rutaFinal = destino.resolve(nombreFinal);

        // Concatenar contenidos sin saltos adicionales
        String contenidoFinal = contenido1 + contenido2;

        try {
            // Escribir la cadena concatenada en el nuevo fichero
            Files.writeString(rutaFinal, contenidoFinal);
            System.out.println("Fichero creado exitosamente en: " + rutaFinal);
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }
}
