//Partiendo del trabajo que has realizado hasta aquí, el programa principal debe ofrecer un menú con las siguientes opciones:
//
//1.Insertar palabra: inserta una palabra nueva en el diccionario (no puede repetirse),
// junto con su definición o definiciones. El usuario podrá seguir insertando definiciones hasta que indique la palabra “FIN”.
//
//2.Consultar palabra: muestra la definición o definiciones asociadas a una palabra.
//
//3.Consultar definición: muestra la palabra asociada a la definición indicada, si existe.
//
//4.Jugar: el programa escoge al azar 5 palabras del diccionario e irá pidiendo que el usuario teclee la definición de cada una de las palabras y
// comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y cuántas erróneas.

import javax.print.DocFlavor;
import java.util.*;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static int pedirNum(String mensaje){
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();
        ENTRADA.nextLine();
        return num;
    }

    public static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine().trim().toLowerCase();
    }

    public static Palabra pedirDatosPalabra(){
        Palabra palabra;

        palabra =  new Palabra(pedirString("Nombre:"));

        palabra.insertarDefinicion();


        return palabra;

    }

    public static boolean comprobarDuplicacion(Map<String, List<String>> mDicionario, String nombrePalabra){
        return mDicionario.containsKey(nombrePalabra);
    }

    public static void mostrarDefiniciones(Map<String, List<String>> mDicionario ){
        String palabraABuscar;

        palabraABuscar = pedirString("Introduce la palabra que quieres buscar su definicion o definiciones: ");

        if (mDicionario.containsKey(palabraABuscar)){
            System.out.println("Definiciones de: " + palabraABuscar + mDicionario.get(palabraABuscar));
        }else {
            System.out.println("Esa palabra no existe en el dicionario: ");
        }

    }

    public static void mostrarPalabra(Map<String, List<String>> mDicionario ){
        String definicionABuscar;
        boolean encontrada = false;

        definicionABuscar = pedirString("Definicion:" );

        for(Map.Entry<String, List<String>> entry : mDicionario.entrySet()){
            if(entry.getValue().contains(definicionABuscar)){
                System.out.println("La palabra es: " + entry.getKey());
                encontrada = true;
            }
        }

        if(!encontrada){
            System.out.println("Esa definicion no se encuentra en este dicionario");
        }
    }

    public static boolean comprobarLongitud(Map<String, List<String>> mDicionario){
        if(mDicionario.size() < 5){
            return false;
        }else {
            return true;
        }
    }

    public static Set agruparMapa(Map<String, List<String>> mDicionario){

        return  mDicionario.keySet();

    }

    public static List convertirALista(Set<String> aGrupo){

       return new ArrayList<>(aGrupo);

    }

    public static List listaAleatoria(List<String> lOrdenada){

        Collections.shuffle(lOrdenada);
        return lOrdenada.subList(0,5);
    }

    public static boolean comprobarDefinicion(Map<String, List<String>> mDicionario, String definicion, String palabra){
        List<String> lDefiniciones = mDicionario.get(palabra);

        return lDefiniciones.contains(definicion);

    }

    public static void juego(Map<String, List<String>> mDicionario ){
        List<String> lPalabrasAleatorias;
        int acertos = 0, fallos = 0;
        String definicionAdivinar;

        if(!comprobarLongitud(mDicionario)){
            System.out.println("No se puede juegar todavia por que el dicionario esta muy vacio");
        }else {
            lPalabrasAleatorias = listaAleatoria(convertirALista(agruparMapa(mDicionario)));
            for (String palabra : lPalabrasAleatorias){
                definicionAdivinar =  pedirString("Introduce la definicion de: "  + palabra);
                if(comprobarDefinicion(mDicionario, definicionAdivinar, palabra)){
                    System.out.println("Acertaste!!");
                    acertos ++;
                } else {
                    System.out.println("Fallaste");
                    fallos++;
                }
            }

            System.out.println("Has obtenido un total de " + acertos + " aciertos y un total de " + fallos + " fallos");
        }



    }

    public static void menu(Map<String, List<String>> mDicionario ){
        int opcion;
        Palabra palabra;

        do {

            System.out.println("-----MENU-----");
            System.out.println("1- Insertar palabra.");
            System.out.println("2- Mostrar definicion.");
            System.out.println("3- Mostrar palabra");
            System.out.println("4- Juego.");
            System.out.println("5- Salir.");
            opcion = pedirNum("Elige una opcion: ");

            switch (opcion){
                case 1:
                    palabra = pedirDatosPalabra();
                    if (!comprobarDuplicacion(mDicionario, palabra.getNombrePalabra())){
                        mDicionario.put(palabra.getNombrePalabra(), palabra.getlDefiniciones());
                    }else {
                        System.out.println("esa palabra ya se añadido al dicionario");
                    }
                    break;
                case 2:
                    mostrarDefiniciones(mDicionario);
                    break;
                case 3:
                    mostrarPalabra(mDicionario);
                    break;
                case 4:
                    juego(mDicionario);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opcion != 5);

    }

    public static void main(String[] args) {
        Map<String, List<String>> mDicionario = new HashMap<>();
        menu(mDicionario);
    }
}