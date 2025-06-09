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
        try {
            if (Files.exists(ruta)) {
                lContenido = Files.readAllLines(ruta);
                for (int i = 1; i < lContenido.size(); i++) { // Saltar la cabecera
                    String linea = lContenido.get(i).trim();
                    if (linea.isEmpty()) continue;

                    String[] partes = linea.split("\t");
                    if (partes.length < 3) continue;

                    try {
                        LocalDate fecha = LocalDate.parse(partes[0]);
                        double temperaturaMaxima = Double.parseDouble(partes[1]);
                        double temperaturaMinima = Double.parseDouble(partes[2]);

                        Temperatura tem = new Temperatura(fecha, temperaturaMaxima, temperaturaMinima);
                        this.lTemperaturas.add(tem);
                    } catch (Exception e) {
                        System.out.println("Error al parsear línea: " + linea);
                    }
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
        for (String l : this.lContenido){
            System.out.println(l);
        }

        System.out.println("Temperatura maxima de las maximas: " + calcularTemperaturaMaxima());
        System.out.println("Temperatura minima de las minimas: " + calcularTemperaturaMinima());

    }

    public void escribirFichero(Path ruta){
        List<String> lcontenidoNuevo = new ArrayList<>();
        for (Temperatura tem: lTemperaturas){
            String linea = tem.getFecha() + "\t" + tem.getTemperaturaMaxima() +"\t" + tem.getTemperaturaMinima() ;
            lcontenidoNuevo.add("Fecha\tTemperatura maxima\tTemperatura minima");
            lcontenidoNuevo.add(linea);
        }


        try {
            Files.write(ruta,lcontenidoNuevo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void añadirTemperatura(Temperatura temp, Path ruta) {
        lTemperaturas.add(temp);
        escribirFichero(ruta);
    }

}
