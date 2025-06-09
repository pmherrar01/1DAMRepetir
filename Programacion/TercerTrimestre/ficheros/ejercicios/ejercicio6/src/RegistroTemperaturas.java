import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroTemperaturas {
    private List<Temperatura> lTemperaturas = new ArrayList<>();
    private List<String> lContenido = new ArrayList<>();

    public RegistroTemperaturas(Path ruta) {
        String[] partes = null;
        Temperatura tem;

        try {
            if (Files.exists(ruta)) {
                this.lContenido = Files.readAllLines(ruta);
                for (int i = 1; i < this.lContenido.size(); i++){
                    partes = this.lContenido.get(i).split("\t");

                    LocalDate fecha = LocalDate.parse(partes[0]);
                    double temperaturaMaxima = Double.parseDouble(partes[1]);
                    double temperaturaMinima = Double.parseDouble(partes[2]);

                    tem  = new Temperatura(fecha,temperaturaMaxima,temperaturaMinima);

                    this.lTemperaturas.add(tem);

                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }

    }

    public double calcularTemperaturaMaxima(){
        double temperaturaMaxima = -Double.MAX_VALUE;

        for (Temperatura tem: lTemperaturas){
            if (tem.getTemperaturaMaxima() > temperaturaMaxima){
                temperaturaMaxima = tem.getTemperaturaMaxima();
            }
        }

        return  temperaturaMaxima;

    }

    public double calcularTemperaturaMinima(){
        double temperaturaMinima = Double.MAX_VALUE;

        for (Temperatura tem: lTemperaturas){
            if (tem.getTemperaturaMinima() < temperaturaMinima){
                temperaturaMinima = tem.getTemperaturaMinima();
            }
        }

        return  temperaturaMinima;
    }

    public void mostrarRegistro(){
        for (Temperatura tem : lTemperaturas){
            System.out.println(tem);
        }

        System.out.println("Temperatura maxima de las maximas: " + calcularTemperaturaMaxima());
        System.out.println("Temperatura minima de las minimas: " + calcularTemperaturaMinima());

    }

    public void escribirFichero(Path ruta){
        List<String> lcontenidoNuevo = new ArrayList<>();
        for (Temperatura tem: lTemperaturas){
            String linea = tem.getFecha() + "\\t" + tem.getTemperaturaMaxima() +"\\t" + tem.getTemperaturaMinima() + "\n";
            lcontenidoNuevo.add(linea);
        }


        try {
            Files.write(ruta,lcontenidoNuevo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void añadirNuevaTemperatura(Temperatura tem, Path ruta){
        
    }

}
