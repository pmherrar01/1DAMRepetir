import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palabra {

    final static Scanner ENTRADA = new Scanner(System.in);

    private String nombrePalabra;
    private List<String> lDefiniciones;

    public Palabra(String nombrePalabra) {
        this.nombrePalabra = nombrePalabra;
        this.lDefiniciones = new ArrayList<>();
    }

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine().trim().toLowerCase();
    }

    public void insertarDefinicion(){
        String definicion;
        boolean fin = false;
        do {
            definicion = pedirString("Definicion:   (Sino quieres añadir otra definicion escribe 'FIN')");
            if (definicion.equalsIgnoreCase("fin")){
              fin = true;
            }else{
                lDefiniciones.add(definicion);
            }

        }while (fin);

    }

    public String getNombrePalabra() {
        return nombrePalabra;
    }

    public List<String> getlDefiniciones() {
        return lDefiniciones;
    }
}
