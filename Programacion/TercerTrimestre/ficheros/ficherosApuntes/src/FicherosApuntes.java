import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FicherosApuntes {
    public static void main(String[] args) {

        Path p = Paths.get("C:\\Users\\pmherrerar01\\Desktop\\1DAMRepetir\\Programacion\\TercerTrimestre\\ficherosApuntes\\ejemplosFicheros\\f1.txt");
        Path pd = Paths.get("C:\\Users\\pmherrerar01\\Desktop\\1DAMRepetir\\Programacion\\TercerTrimestre\\ficherosApuntes\\ejemplosFicheros\\f2.txt");

        try {
            Files.copy(p,pd);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path directorioTxt = Paths.get("C:\\Users\\pmherrerar01\\Desktop\\1DAMRepetir\\Programacion\\TercerTrimestre\\ficheros\\ejercicios\\Ejercicio1\\Ficheros");
        List<String> l;
        try {
           if (Files.isRegularFile(directorioTxt)){
               l = Files.readAllLines(directorioTxt);
               for(String linea: l){
                   System.out.println(linea);
               }
           }

        } catch (IOException e) {
            System.out.println("No existe");
        }

    }
}