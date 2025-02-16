import java.util.Random;
import java.util.Scanner;

public class juegoBarcos {
    public static final int TAMANIO = 8;
    public static final char[][] tableroJugador = new char[TAMANIO][TAMANIO];
    public static final char[][] tableroCPU = new char[TAMANIO][TAMANIO];
    public static final char[][] tableroDisparos = new char[TAMANIO][TAMANIO];
    public static final Scanner entrada = new Scanner(System.in);
    public static final int[] barcos = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    public static void inicializarTableros() {
        int i, j;
        for (i = 0; i < TAMANIO; i++) {
            for (j = 0; j < TAMANIO; j++) {
                tableroJugador[i][j] = '~';
                tableroCPU[i][j] = '~';
                tableroDisparos[i][j] = '~';
            }
        }
    }

    public static void colocarBarcos(char[][] tablero) {
        int fila, columna;
        boolean horizontal, colocado;
        for (int longitud : barcos) {
            colocado = false;
            while (!colocado) {
                fila = (int) (Math.random() * TAMANIO);
                columna = (int) (Math.random() * TAMANIO);
                horizontal = Math.random() < 0.5;
                if (puedeColocarBarco(tablero, fila, columna, longitud, horizontal)) {
                    colocarBarco(tablero, fila, columna, longitud, horizontal);
                    colocado = true;
                }
            }
        }
    }

    public static boolean puedeColocarBarco(char[][] tablero, int fila, int col, int longitud, boolean horizontal) {
        int i, j;
        boolean puedeColocar;

        puedeColocar = true; // Inicializar correctamente

        if (horizontal) {
            if (col + longitud > TAMANIO) {
                puedeColocar = false;
            }

            for (i = -1; i <= longitud; i++) {
                for (j = -1; j <= 1; j++) {
                    if (fila + j >= 0 && fila + j < TAMANIO && col + i >= 0 && col + i < TAMANIO) {
                        if (tablero[fila + j][col + i] != '~') {
                            puedeColocar = false; // Si hay una casilla ocupada, el barco no se puede colocar
                        }
                    }
                }
            }
        } else { // Si el barco es vertical
            if (fila + longitud > TAMANIO) {
                puedeColocar = false;
            }

            for (i = -1; i <= longitud; i++) {
                for (j = -1; j <= 1; j++) {
                    if (fila + i >= 0 && fila + i < TAMANIO && col + j >= 0 && col + j < TAMANIO) {
                        if (tablero[fila + i][col + j] != '~') {
                            puedeColocar = false;
                        }
                    }
                }
            }
        }

        return puedeColocar; // Retorna la variable en lugar de usar return false directamente
    }


    public static void colocarBarco(char[][] tablero, int fila, int col, int tamano, boolean horizontal) {
        int i;
        char simbolo = (char) ('0' + tamano);
        for (i = 0; i < tamano; i++) {
            if (horizontal) tablero[fila][col + i] = simbolo;
            else tablero[fila + i][col] = simbolo;
        }
    }

    public static void jugar() {
        boolean juegoTerminado = false;
        while (!juegoTerminado) {
            boolean turnoJugador = true;
            while (turnoJugador) {
                mostrarTablero(tableroDisparos, "TABLERO DISPAROS"); // Solo muestra disparos del jugador
                System.out.println("Ingresa coordenadas (fila y columna): ");
                int fila = entrada.nextInt();
                int col = entrada.nextInt();
                turnoJugador = realizarDisparo(tableroCPU, tableroDisparos, fila, col);
                if (todosHundidos(tableroCPU)) {
                    System.out.println("¡Ganaste!");
                    return;
                }
            }

            boolean turnoCPU = true;
            while (turnoCPU) {
                turnoCPU = turnoOrdenador();
                if (todosHundidos(tableroJugador)) { // Verificar después de cada disparo de la CPU
                    System.out.println("¡Perdiste!");
                    juegoTerminado = true;
                    return; // Sale inmediatamente del método
                }
            }
        }
    }


    public static void mostrarTablero(char[][] tablero, String mensaje) {
        int i,j;
        System.out.println(mensaje);
        System.out.println("  0 1 2 3 4 5 6 7");
        for (i = 0; i < TAMANIO; i++) {
            System.out.print(i + " ");
            for (j = 0; j < TAMANIO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean realizarDisparo(char[][] tableroOponente, char[][] tableroDisparos, int fila, int col) {
        boolean repetirTurno;

        repetirTurno = false; // Variable booleana para el retorno

        if (fila < 0 || fila >= TAMANIO || col < 0 || col >= TAMANIO) {
            System.out.println("Coordenadas fuera de rango. Inténtalo de nuevo.");
            repetirTurno = true;
        } else if (tableroDisparos[fila][col] != '~') {
            System.out.println("Ya disparaste en esta posición. Inténtalo de nuevo.");
            repetirTurno = true;
        } else if (tableroOponente[fila][col] != '~') { // Acertó un barco
            tableroOponente[fila][col] = 'X';
            tableroDisparos[fila][col] = 'X';

            if (esBarcoHundido(tableroOponente, fila, col)) {
                System.out.println("¡BARCO HUNDIDO!");
            } else {
                System.out.println("¡Tocado! Vuelve a disparar.");
            }

            repetirTurno = true; // Permite repetir el turno si aún hay partes del barco
        } else {
            System.out.println("Agua. Turno de la CPU.");
            tableroDisparos[fila][col] = 'A';
            repetirTurno = false; // Pasa el turno a la CPU
        }

        return repetirTurno;
    }


    public static boolean turnoOrdenador() {
        int fila, col;
        boolean repetirTurno;

        repetirTurno = false; // Variable booleana para el retorno

        do {
            fila = (int) (Math.random() * TAMANIO);
            col = (int) (Math.random() * TAMANIO);
        } while (tableroJugador[fila][col] == 'X' || tableroJugador[fila][col] == 'A');

        System.out.println("El ordenador dispara en " + fila + "," + col);

        if (tableroJugador[fila][col] != '~') { // La CPU acierta
            System.out.println("¡La CPU acertó y vuelve a disparar!");
            tableroJugador[fila][col] = 'X';

            if (todosHundidos(tableroJugador)) { // Si hundió todos los barcos, termina el juego
                System.out.println("¡Perdiste!");
                repetirTurno = false;
            } else {
                repetirTurno = true; // La CPU repite turno si quedan barcos
            }
        } else {
            System.out.println("La CPU falló. Turno del jugador.");
            tableroJugador[fila][col] = 'A';
            repetirTurno = false; // La CPU falla y el turno pasa al jugador
        }

        return repetirTurno;
    }



    public static boolean todosHundidos(char[][] tablero) {
        boolean estanHundidos;
        int i, j;

        estanHundidos = true; // Variable booleana para el retorno

        for (i = 0; i < TAMANIO; i++) {
            for (j = 0; j < TAMANIO; j++) {
                if (tablero[i][j] >= '1' && tablero[i][j] <= '4') {
                    estanHundidos = false;
                    break;
                }
            }
            if (!estanHundidos) break;
        }

        return estanHundidos;
    }


    static boolean esBarcoHundido(char[][] tablero, int fila, int col) {
        char barcoTocado;
        int[] x, y;
        int nuevaFila, nuevaColumna, i;
        boolean estaHundido;

        estaHundido = true; // Variable booleana para el retorno

        barcoTocado = 'X'; // Marca de impacto

        // Revisar en las cuatro direcciones si quedan partes del barco
        x = new int[]{0, 0, -1, 1}; // Desplazamiento en filas (arriba/abajo)
        y = new int[]{-1, 1, 0, 0}; // Desplazamiento en columnas (izquierda/derecha)

        for (i = 0; i < 4; i++) {
            nuevaFila = fila + x[i];
            nuevaColumna = col + y[i];

            if (nuevaFila >= 0 && nuevaFila < TAMANIO && nuevaColumna >= 0 && nuevaColumna < TAMANIO) {
                // Si hay una parte del barco aún sin impactar, no está hundido
                if (tablero[nuevaFila][nuevaColumna] >= '1' && tablero[nuevaFila][nuevaColumna] <= '4') {
                    estaHundido = false;
                    break;
                }
            }
        }

        return estaHundido;
    }



    public static void main(String[] args) {
        inicializarTableros();
        colocarBarcos(tableroJugador);
        colocarBarcos(tableroCPU);
        mostrarTablero(tableroJugador, "TABLERO JUGADOR");
        mostrarTablero(tableroCPU, "TABLERO CPU");
        jugar();
    }
}
