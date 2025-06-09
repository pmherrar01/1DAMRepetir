import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static final Path ruta = Paths.get("/Users/pablo/Desktop/1DAMRepetir/Programacion/TercerTrimestre/ficheros/ejercicios/ejercicio7/FicherosEjercicio7/code.txt");
    static final Path rutaFicheroSinCodificar = Paths.get("/Users/pablo/Desktop/1DAMRepetir/Programacion/TercerTrimestre/ficheros/ejercicios/ejercicio7/FicherosEjercicio7/textoSinCodificar.txt");
    static final Path rutaFicheroCodificado = Paths.get("/Users/pablo/Desktop/1DAMRepetir/Programacion/TercerTrimestre/ficheros/ejercicios/ejercicio7/FicherosEjercicio7/textoCodificado.txt");

    public static List<String> leerFichero(Path x) {

        List<String> lContenido = new ArrayList<>();


        try {
            if (Files.exists(x)) {
                lContenido = Files.readAllLines(x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lContenido;
    }

    public static Map<Character, Character> rellenarMapa() {
        List<String> lContenuido = leerFichero(ruta);
        Map<Character, Character> mapaCode = new HashMap<>();

        String alfabeto = lContenuido.get(0).replaceAll("\\s+", "");
        String cifrado = lContenuido.get(1).replaceAll("\\s+", "");

        for (int i = 0; i < alfabeto.length(); i++) {
            mapaCode.put(alfabeto.charAt(i), cifrado.charAt(i));
        }

        return mapaCode;
    }

    public static void mostrarMapa(Map<Character, Character> mapa) {
        for (Map.Entry<Character, Character> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    public static void codificarFichero(Map<Character, Character> mapa) {
        List<String> lContenidoSinCodificar = leerFichero(rutaFicheroSinCodificar);

        System.out.println("contenido del fichero sin codificar");
        for (String l : lContenidoSinCodificar){
            System.out.println(l);
        }
        List<String> codificado = new ArrayList<>();


        for (String linea : lContenidoSinCodificar) {
            StringBuilder nuevaLinea = new StringBuilder();
            for (char c : linea.toLowerCase().toCharArray()) {
                if (mapa.containsKey(c)) {
                    nuevaLinea.append(mapa.get(c));
                } else {
                    nuevaLinea.append(c);
                }
            }
            codificado.add(nuevaLinea.toString());


        }

        System.out.println(codificado);

        try {
            // Crea el archivo si no existe, pero siempre escribe
            if (!Files.exists(rutaFicheroCodificado)) {
                Files.createFile(rutaFicheroCodificado);
            }
            Files.write(rutaFicheroCodificado, codificado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Map<Character, Character> mapaCode = new HashMap<>();

        mapaCode = rellenarMapa();

        mostrarMapa(mapaCode);

        codificarFichero(mapaCode);


    }
}