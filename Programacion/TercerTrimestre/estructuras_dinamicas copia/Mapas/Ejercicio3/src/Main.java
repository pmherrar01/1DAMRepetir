//La nueva versión de la aplicación debe permitir almacenar una o más descripciones para la misma palabra. A parte de las palabras anteriores, debe incluir:
//
//{"libro", "tierra", "mesa", "teléfono", "flor"}
//Cada una de esas palabras tiene dos descripciones; por ejemplo, al libro le corresponden las descripciones 0 y 1, a la tierra la 2 y 3, etc.
//
//{"Conjunto de muchas hojas de papel u otro material semejante.", "Obra científica, literaria o de cualquier otra
//índole.", "Planeta del sistema solar que ocupa la tercera órbita en torno al sol.", "Superficie terrestre habitada por los seres
//humanos.", "Mueble compuesto de una tabla horizontal sostenida por uno o varios pies o patas.", "Cada una de las comidas principales del
//día.", "Aparato que permite la comunicación a distancia mediante señales eléctricas.", "Aparato telefónico.", "Órgano de las
//plantas fanerógamas que contiene los órganos reproductores.", "Planta herbácea o leñosa que se cultiva en jardines, parques y macetas, y tiene flores
//generalmente muy vistosas."}
//Implementa la nueva versión del programa, rellenando la estructura de datos elegida y mostrando las definiciones de la palabra elegida por el usuario.

import java.util.*;

public class Main {

    final static String[] ADEFINICIONES = { "Fruto del manzano, de piel fina, pulpa jugosa y semillas en su interior.", "Deporte en el que dos equipos compiten por marcar goles en la portería contraria.", "Arte y técnica de hacer películas cinematográficas.", "Elevación natural y considerable de terreno.", "Arte de combinar los sonidos de la voz o de los instrumentos de manera que produzcan deleite", "Máquina electrónica capaz de almacenar información", "Desplazamiento de una persona de un lugar a otro.","Conjunto de muchas hojas de papel u otro material semejante.", "Obra científica, literaria o de cualquier otraíndole.", "Planeta del sistema solar que ocupa la tercera órbita en torno al sol.", "Superficie terrestre habitada por los seres humanos.", "Mueble compuesto de una tabla horizontal sostenida por uno o varios pies o patas.", "Cada una de las comidas principales del día.", "Aparato que permite la comunicación a distancia mediante señales eléctricas.", "Aparato telefónico.", "Órgano de las plantas fanerógamas que contiene los órganos reproductores.", "Planta herbácea o leñosa que se cultiva en jardines, parques y macetas, y tiene flores generalmente muy vistosas."};
    final static String[] APALABRAS = {"manzana", "fútbol", "cine", "montaña", "música", "computadora", "viaje", "libro", "tierra", "mesa", "teléfono", "flor"};

    public static void rellenarMapa(Map<String, List<String>> mDiccionario) {
        int cont = 0;

        for (int i = 0; i < APALABRAS.length; i++) {
            if(i < 7){
                mDiccionario.put(APALABRAS[i].toLowerCase(), new ArrayList<>() );
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont++;
            }else{
                mDiccionario.put(APALABRAS[i].toLowerCase(),new ArrayList<>());
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont ++;
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont ++;
            }
        }
    }

    public static void buscarDefinicion(Map<String, List<String>> mDiccionario) {
        Scanner entrada = new Scanner(System.in);
        String palabraABuscar;
        String respuesta;

        do {
            System.out.print("Palabra: ");
            palabraABuscar = entrada.nextLine().trim().toLowerCase();

            if (mDiccionario.containsKey(palabraABuscar)) {
                System.out.println("Definiciones:");
                List<String> definiciones = mDiccionario.get(palabraABuscar);
                for (String def : definiciones) {
                    System.out.println("- " + def);
                }
            } else {
                System.out.println("Esa palabra no se encuentra en el diccionario.");
            }

            System.out.print("¿Deseas buscar otra palabra? (si/no): ");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public static void main(String[] args) {

        Map<String, List<String>> mDicionario = new HashMap<>();
        rellenarMapa(mDicionario);
        buscarDefinicion(mDicionario);

    }
}