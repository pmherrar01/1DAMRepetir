import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RegistroTemperaturas {

    final static Scanner ENTRADA = new Scanner(System.in);

    private List<Temperatura> lTemperaturas = new ArrayList<>();
    private List<String> lContenido = new ArrayList<>();
    private Path ruta = Paths.get("/Users/pablo/Desktop/1DAMRepetir/Programacion/TercerTrimestre/ficheros/ejercicios/ejercicio6/ficherosEjercicio6/temperaturas.txt");


    public RegistroTemperaturas() {
        Temperatura tem;
        this.lContenido = leerfichero();

        for (int i = 1; i < lContenido.size(); i++) {
            String linea = lContenido.get(i).trim();


            String[] partes = linea.split(";");


            try {

                LocalDate fecha = LocalDate.parse(partes[0]);
                int temperaturaMaxima = Integer.parseInt(partes[1]);
                int temperaturaMinima = Integer.parseInt(partes[2]);

                tem = new Temperatura(fecha,temperaturaMaxima,temperaturaMinima);

                this.lTemperaturas.add(tem);


            }catch (Exception e){
                System.out.println("Error al parsear en la linea: " + linea );
            }

        }

    }

    private List<String> leerfichero() {
        List<String> lineas = new ArrayList<>();
        try {
            if (Files.exists(this.ruta)) {
                lineas = Files.readAllLines(this.ruta);

            }
        } catch (IOException e) {
            System.out.println("Error al lleer el fichero");
        }

        return lineas;

    }

    private int calcularTemperaturaMaxima(){
        int temperaturaMAxima = -Integer.MAX_VALUE;

        for (Temperatura tem : this.lTemperaturas){
            if (tem.getTemperaturaMaxima() > temperaturaMAxima){
                temperaturaMAxima = tem.getTemperaturaMaxima();
            }
        }

        return  temperaturaMAxima;
    }

    private int calcularTemperaturaMinima(){
        int temperaturaMinima = Integer.MAX_VALUE;

        for (Temperatura tem: lTemperaturas){
            if (tem.getTemperaturaMinima() < temperaturaMinima){
                temperaturaMinima = tem.getTemperaturaMinima();
            }
        }

        return temperaturaMinima;
    }

    public void mostrarTemperaturas(){
        for (Temperatura tem: lTemperaturas){
            System.out.println(tem);
        }

        System.out.println("La temperatura maxima de las temperaturas maximas es: " + calcularTemperaturaMaxima());
        System.out.println("La temperatura minima de las temperaturas minimas es: " + calcularTemperaturaMinima());
    }

    private LocalDate pedirFecha(String mensaje){

        System.out.println(mensaje);
        return  LocalDate.parse(ENTRADA.nextLine());

    }

    private int pedirTemperatura(String mensaje){
        int temperatura;
        System.out.println(mensaje);
        temperatura = ENTRADA.nextInt();
        ENTRADA.nextLine();

        return temperatura;
    }

    private void escribirNuevasTemperaturas(Temperatura tem){
        if (Files.exists(this.ruta)){
            String linea = "" +
                    "" + tem.getFecha() + ";" + tem.getTemperaturaMaxima() + ";" + tem.getTemperaturaMinima();
            try {
                Files.write(this.ruta, Collections.singleton(linea), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero");
            }
        }
    }

    public void añadirTemperatura(){
        Temperatura tem;
        tem =  new Temperatura(pedirFecha("Introduce la fecha para registrar la fecha (AÑO-MES-DIA)"), pedirTemperatura("Introduce la temperatura maxima;"), pedirTemperatura("Introduce la temperatura minima"));

        this.lTemperaturas.add(tem);

        escribirNuevasTemperaturas(tem);

        System.out.println("Temperatura añadida coreptamente");
    }

}
