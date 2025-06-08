import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public static Path pasarARuta(String x) {

        Path ruta = Paths.get(x);

        if (Files.exists(ruta) && Files.isDirectory(ruta)) {
            return ruta;
        }

        return null;
    }

    public static Path rutaFichero(Path ruta, String fichero) {

        Path rutaFichero = null;

        if (ruta == null) {
            System.out.println("La ruta no existe");
        } else {
            rutaFichero = ruta.resolve(fichero);
        }

        return rutaFichero;

    }

    public static List<String> leeerFichero(Path rutaFichero) {

        List<String> lFichero = new ArrayList<>();


        try {
            lFichero = Files.readAllLines(rutaFichero);

        } catch (IOException e) {
            System.out.println("error al leer el fichero");
        }

        return lFichero;
    }

    public static List<String> unirListas(List<String> a, List<String> b) {
        List<String> lUnida = new ArrayList<>();
        String contenidoA, contenidoB, contenido;

        contenidoA = String.join("", a);
        contenidoB = String.join("", b);

        contenido = contenidoA + contenidoB;

        lUnida.add(contenido);


        return lUnida;
    }

    public static void escribirFichero(List<String> lUnida, Path rutaFicheroNuevo) {


        try {
            if (!Files.exists(rutaFicheroNuevo)) {
                Files.createFile(rutaFicheroNuevo);
                System.out.println("Archivo creado");
                Files.write(rutaFicheroNuevo,lUnida);
            }else {
                System.out.println("el archico ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }


    }

    public static void main(String[] args) {

        Path rutaPrimerFichero = pasarARuta(pedirString("Introduce la ruta del primer archivo"));
        String nombrePrimerFichero = pedirString("Introduce el nombre del primer fichero");

        Path rutaSegundoFichero = pasarARuta(pedirString("Introduce la ruta del segundo fichero"));
        String nombreSegundoFichero = pedirString("Nombre del segundo fichero");

        rutaPrimerFichero = rutaFichero(rutaPrimerFichero, nombrePrimerFichero);
        rutaSegundoFichero = rutaFichero(rutaSegundoFichero, nombreSegundoFichero);

        Path rutaFicheroNuevo = pasarARuta(pedirString("Introduce la ruta destino del nuevo fichero"));
        String nombreFicheroFinal = nombrePrimerFichero.replace(".txt", "") + "_" + nombreSegundoFichero;
        rutaFicheroNuevo = rutaFichero(rutaFicheroNuevo,nombreFicheroFinal);

        List<String> lContenidoNuevo = unirListas(leeerFichero(rutaPrimerFichero),leeerFichero(rutaSegundoFichero));
        escribirFichero(lContenidoNuevo, rutaFicheroNuevo);


    }
}
