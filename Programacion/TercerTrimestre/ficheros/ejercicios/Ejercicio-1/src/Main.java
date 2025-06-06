//Realizar una aplicación donde se pida la ruta de un fichero por teclado y
// un texto que queramos a escribir en el fichero.
// Deberá mostrar por pantalla el mismo texto pero variando entre mayúsculas y minúsculas,
// es decir, si se escribe “Bienvenido” deberá devolver “bIENVENIDO”.
// Deberás crear un método para escribir en el fichero el texto introducido y
//  otro para mostrar el contenido en mayúsculas.

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

    public static List<String> escribirFichero() {
        String contenido = "";
        Path ruta = Paths.get(pedirString("Ruta:"));
        List<String> lineas = new ArrayList<>();

        try {
            if (Files.exists(ruta) && Files.isRegularFile(ruta)) {



                contenido = pedirString("Introduce lo que quieres introducir en el fichero \n");

                Files.write(ruta, contenido.getBytes());

                lineas = leerFichero(ruta);


            } else {
                System.out.println("El archivo no existe");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lineas;
    }

    public static List<String> leerFichero(Path ruta){
        if (Files.exists(ruta)){
            try {
                return Files.readAllLines(ruta);
            } catch (IOException e) {
                System.out.println("El fichero no se puede leer");
            }
        }
        return new ArrayList<>();
    }

    public static void mostrarFichero(List<String> fichero) {
        for (String linea : fichero) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < linea.length(); i++) {
                char c = linea.charAt(i);
                if (i % 2 == 0) {
                    resultado.append(Character.toLowerCase(c));
                } else {
                    resultado.append(Character.toUpperCase(c));
                }
            }
            System.out.println(resultado);
        }
    }



    public static void main(String[] args) {
        mostrarFichero(escribirFichero());

    }
}