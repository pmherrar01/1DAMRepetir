//La aplicación debe ofrecer una nueva opción al usuario:
// introducir una descripción, de forma que el programa muestre a qué palabra corresponde dicha definición,
// si es que corresponde a alguna de las palabras almacenadas.

import java.util.*;

public class Main {

    final static String[] ADEFINICIONES = {"Fruto del manzano, de piel fina, pulpa jugosa y semillas en su interior.", "Deporte en el que dos equipos compiten por marcar goles en la portería contraria.", "Arte y técnica de hacer películas cinematográficas.", "Elevación natural y considerable de terreno.", "Arte de combinar los sonidos de la voz o de los instrumentos de manera que produzcan deleite", "Máquina electrónica capaz de almacenar información", "Desplazamiento de una persona de un lugar a otro.", "Conjunto de muchas hojas de papel u otro material semejante.", "Obra científica, literaria o de cualquier otraíndole.", "Planeta del sistema solar que ocupa la tercera órbita en torno al sol.", "Superficie terrestre habitada por los seres humanos.", "Mueble compuesto de una tabla horizontal sostenida por uno o varios pies o patas.", "Cada una de las comidas principales del día.", "Aparato que permite la comunicación a distancia mediante señales eléctricas.", "Aparato telefónico.", "Órgano de las plantas fanerógamas que contiene los órganos reproductores.", "Planta herbácea o leñosa que se cultiva en jardines, parques y macetas, y tiene flores generalmente muy vistosas."};
    final static String[] APALABRAS = {"manzana", "fútbol", "cine", "montaña", "música", "computadora", "viaje", "libro", "tierra", "mesa", "teléfono", "flor"};
    final static Scanner ENTRADA = new Scanner(System.in);

    public static void rellenarMapa(Map<String, List<String>> mDiccionario) {
        int cont = 0;

        for (int i = 0; i < APALABRAS.length; i++) {
            if (i < 7) {
                mDiccionario.put(APALABRAS[i].toLowerCase(), new ArrayList<>());
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont++;
            } else {
                mDiccionario.put(APALABRAS[i].toLowerCase(), new ArrayList<>());
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont++;
                mDiccionario.get(APALABRAS[i]).add(ADEFINICIONES[cont]);
                cont++;
            }
        }
    }

    public static void buscarDefinicion(Map<String, List<String>> mDiccionario) {

        String palabraABuscar;
        String respuesta;

        do {
            System.out.print("Palabra: ");
            palabraABuscar = ENTRADA.nextLine().trim().toLowerCase();

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
            respuesta = ENTRADA.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public static void buscarPalabra(Map<String, List<String>> mDiccionario) {
        String definicion, respuesta, palabraABuscar;
        boolean encontrada = false;

        do {
            System.out.println("Definicion: ");
            definicion = ENTRADA.nextLine().trim().toLowerCase();

                for (int i = 0; i < APALABRAS.length; i++) {

                    palabraABuscar = APALABRAS[i];
                    List<String> definiciones = mDiccionario.get(palabraABuscar);

                    for (String def : definiciones) {
                        if (def.equalsIgnoreCase(definicion)) {
                            System.out.println("La pabra es: " + palabraABuscar);
                            encontrada = true;
                        }
                    }

                }

            if (!encontrada){
                System.out.println("Esa definicion no esta incluida en el dicionario.");
            }

            System.out.print("¿Deseas buscar otra palabra? (si/no): ");
            respuesta = ENTRADA.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

    }

    public static void main(String[] args) {

        Map<String, List<String>> mDicionario = new HashMap<>();
        rellenarMapa(mDicionario);
        buscarDefinicion(mDicionario);
        buscarPalabra(mDicionario);

    }
}