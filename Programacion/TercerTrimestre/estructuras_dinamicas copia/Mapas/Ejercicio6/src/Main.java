//Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según el juego de la brisca.
// El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3).
// La secuencia de cartas generadas debe almacenarse en una estructura de la clase ArrayList que contiene objetos de la clase Carta, para posteriormente mostrarlas.
// El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.

import jdk.jshell.execution.Util;

import java.util.*;

public class Main {

    public static Carta generarCarta(){
        Random rand = new Random();
        Carta carta;
        Figura figuraAleatoria = Figura.values()[rand.nextInt(Figura.values().length)];
        Palo paloAleatorio = Palo.values()[rand.nextInt(Palo.values().length)];

        return carta = new Carta(figuraAleatoria, paloAleatorio);

    }

    public static List rellenarLista(List<Carta> lCartasJuego, Map<Figura, Integer> mCartas){
        int i;
        Carta carta;

        for (i = 0; i < 5; i++) {
            carta = generarCarta();
            carta.setValorCarta(mCartas);
            lCartasJuego.add(carta);
        }

        return  lCartasJuego;
    }

    public static void mostrarLista(List<Carta> lCartasJuego){
        for (Carta carta: lCartasJuego){
            System.out.println(carta);
        }
    }

    public static int contarPuntos(List<Carta> lCartasJuego){
        int puntos = 0;
        for (Carta carta : lCartasJuego){
            puntos += carta.getValorCarta();
        }

        return puntos;

    }



    public static void main(String[] args) {
        Map<Figura, Integer> mCartas = new HashMap<>();
        List<Carta> lCartasJuego = new ArrayList<>();
        int puntos;


        mCartas.put(Figura.CABALLO, 3);
        mCartas.put(Figura.AS,11);
        mCartas.put(Figura.TRES, 10);
        mCartas.put(Figura.SOTA, 2);
        mCartas.put(Figura.REY, 4);

        lCartasJuego = rellenarLista(lCartasJuego, mCartas);
        mostrarLista(lCartasJuego);

        puntos = contarPuntos(lCartasJuego);

        System.out.println("Puntuaccion final: " + puntos);
    }
}