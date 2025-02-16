import java.util.Random;
import java.util.Scanner;

public class juegoBarcos {
    static final int TAMANO = 8;
    static char[][] tableroJugador = new char[TAMANO][TAMANO];
    static char[][] tableroCPU = new char[TAMANO][TAMANO];
    static char[][] tableroDisparos = new char[TAMANO][TAMANO];
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static void inicializarTableros() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tableroJugador[i][j] = '~';
                tableroCPU[i][j] = '~';
                tableroDisparos[i][j] = '~';
            }
        }
    }

    static void colocarBarcos(char[][] tablero) {
        int[] barcos = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        for (int tamano : barcos) {
            boolean colocado = false;
            while (!colocado) {
                int fila = random.nextInt(TAMANO);
                int col = random.nextInt(TAMANO);
                boolean horizontal = random.nextBoolean();
                if (puedeColocarBarco(tablero, fila, col, tamano, horizontal)) {
                    colocarBarco(tablero, fila, col, tamano, horizontal);
                    colocado = true;
                }
            }
        }
    }

    static boolean puedeColocarBarco(char[][] tablero, int fila, int col, int tamano, boolean horizontal) {
        if (horizontal) {
            if (col + tamano > TAMANO) return false;
            for (int i = -1; i <= tamano; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (fila + j >= 0 && fila + j < TAMANO && col + i >= 0 && col + i < TAMANO) {
                        if (tablero[fila + j][col + i] != '~') return false;
                    }
                }
            }
        } else {
            if (fila + tamano > TAMANO) return false;
            for (int i = -1; i <= tamano; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (fila + i >= 0 && fila + i < TAMANO && col + j >= 0 && col + j < TAMANO) {
                        if (tablero[fila + i][col + j] != '~') return false;
                    }
                }
            }
        }
        return true;
    }

    static void colocarBarco(char[][] tablero, int fila, int col, int tamano, boolean horizontal) {
        char simbolo = (char) ('0' + tamano);
        for (int i = 0; i < tamano; i++) {
            if (horizontal) tablero[fila][col + i] = simbolo;
            else tablero[fila + i][col] = simbolo;
        }
    }

    static void jugar() {
        boolean juegoTerminado = false;
        while (!juegoTerminado) {
            boolean turnoJugador = true;
            while (turnoJugador) {
                mostrarTablero(tableroDisparos, "TABLERO DISPAROS"); // Solo muestra disparos del jugador
                System.out.println("Ingresa coordenadas (fila y columna): ");
                int fila = scanner.nextInt();
                int col = scanner.nextInt();
                turnoJugador = realizarDisparo(tableroCPU, tableroDisparos, fila, col);
                if(todosHundidos(tableroCPU)){
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


    static void mostrarTablero(char[][] tablero, String mensaje) {
        System.out.println(mensaje);
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean realizarDisparo(char[][] tableroOponente, char[][] tableroDisparos, int fila, int col) {
        if (fila < 0 || fila >= TAMANO || col < 0 || col >= TAMANO) {
            System.out.println("Coordenadas fuera de rango. Inténtalo de nuevo.");
            return true;
        }
        if (tableroDisparos[fila][col] != '~') {
            System.out.println("Ya disparaste en esta posición. Inténtalo de nuevo.");
            return true;
        }
        if (tableroOponente[fila][col] != '~') { // Acertó un barco
            System.out.println("¡Tocado! Vuelve a disparar.");
            tableroOponente[fila][col] = 'X';
            tableroDisparos[fila][col] = 'X';
            if (todosHundidos(tableroOponente)) {
                System.out.println("¡Barco hundido!");
                return false; // Fin del juego
            }
            return true; // Permite repetir el turno
        }
        System.out.println("Agua. Turno de la CPU.");
        tableroDisparos[fila][col] = 'A';
        return false; // Pasa el turno a la CPU
    }

    static boolean turnoOrdenador() {
        int fila, col;
        do {
            fila = random.nextInt(TAMANO);
            col = random.nextInt(TAMANO);
        } while (tableroJugador[fila][col] == 'X' || tableroJugador[fila][col] == 'A');

        System.out.println("El ordenador dispara en " + fila + "," + col);

        if (tableroJugador[fila][col] != '~') { // La CPU acierta
            System.out.println("¡La CPU acertó y vuelve a disparar!");
            tableroJugador[fila][col] = 'X';
            if (todosHundidos(tableroJugador)) { // Si hundió todos los barcos, termina el juego
                System.out.println("¡Perdiste!");
                return false;
            }
            return true; // CPU repite turno
        }

        System.out.println("La CPU falló. Turno del jugador.");
        tableroJugador[fila][col] = 'A';
        return false; // La CPU falla y el turno pasa al jugador
    }




    static boolean todosHundidos(char[][] tablero) {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] >= '1' && tablero[i][j] <= '4') return false;
            }
        }
        return true;
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
