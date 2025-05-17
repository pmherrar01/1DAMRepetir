//La RAE está preparando una nueva aplicación que funcione
// como un diccionario y te ha pedido que le ayudes en la labor.
// La aplicación debe pedirle al usuario una palabra y devolverle el significado de la misma,
// de la manera más eficiente posible.
//
//Para que puedas hacer pruebas, te han ofrecido el siguiente array de palabras:
//
//{"manzana", "fútbol", "cine",
//"montaña", "música", "computadora",
//"viaje"}
//Y estas son las definiciones de esas palabras,
// de forma que la posición 0 es la definición de la palabra 0, etc:
//
//{ "Fruto del manzano, de piel fina, pulpa jugosa y
//semillas en su interior.", "Deporte en el que dos equipos compiten
//por marcar goles en la portería contraria.", "Arte y técnica de hacer
//películas cinematográficas.", "Elevación natural y considerable de
//terreno.", "Arte de combinar los sonidos de la voz o de los
//instrumentos de manera que produzcan deleite", "Máquina electrónica
//capaz de almacenar información", "Desplazamiento de una persona de un
//lugar a otro."}
//La aplicación debe poblar la estructura de datos desde estos arrays y mostrar la definición al usuario de la palabra que pida.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    final static String[] ADEFINICIONES = { "Fruto del manzano, de piel fina, pulpa jugosa y semillas en su interior.", "Deporte en el que dos equipos compiten por marcar goles en la portería contraria.", "Arte y técnica de hacer películas cinematográficas.", "Elevación natural y considerable de terreno.", "Arte de combinar los sonidos de la voz o de los instrumentos de manera que produzcan deleite", "Máquina electrónica capaz de almacenar información", "Desplazamiento de una persona de un lugar a otro."};
    final static String[] APALABRAS = {"manzana", "fútbol", "cine", "montaña", "música", "computadora", "viaje"};

    public static void rellenarMapa(Map<String,String> mDicionario){

        for (int i = 0; i < APALABRAS.length; i++){
            mDicionario.put(APALABRAS[i].toLowerCase(), ADEFINICIONES[i]);
        }

    }

    public static void buscarDefinicion(Map<String,String> mDicionario){
        Scanner entrada = new Scanner(System.in);
        String palabraABuscar, resouesta;


        do {
            System.out.println("Palabra:");
            palabraABuscar = entrada.nextLine().trim().toLowerCase();



            if (mDicionario.containsKey(palabraABuscar)){
                System.out.println("Definicion:  " + mDicionario.get(palabraABuscar));
            }else {
                System.out.println("Esa palabra no se encuentra en el dicionario");
            }

            System.out.println("¿Deseas buscar otra palabra?");
            resouesta = entrada.nextLine();
        }while (resouesta.equalsIgnoreCase("si"));


    }

    public static void main(String[] args) {

        Map<String, String> mDicionario = new HashMap<>();
        rellenarMapa(mDicionario);
        buscarDefinicion(mDicionario);

    }
}