import java.util.Scanner;

public class juegoBarcos {  // Nombre de la clase en mayúscula según convención Java
    public static final int FIL = 8;
    public static final int COL = 8;
    public static final int[][] TABLEROCPU = new int[FIL][COL];
    public static final int[][] TABLEROJUGADOR = new int[FIL][COL];
    public static final int[] BARCOS = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    public static int elegirCoordenadas() {
        return (int) (Math.random() * 7) + 1;
    }

    public static int elegirBarco(){
        return (int) (Math.random() * BARCOS.length);
    }

    public static void colocarBarco(int barco, int[][] tableroCPU, int[][] tableroJugador){

    }

    public static void rellenarTablero(int[][] tablero) {
        int i,j;
        for (i = 0; i < tablero.length; i++) {
            for (j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public static void mostrarTablero(int[][] tablero, String mensaje) {
        int i,j;

        System.out.println(mensaje);
        for(i = 0; i < tablero.length;i++){
            for (j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int filaCPU(){
        int fila;

        fila = (int) (Math.random() * FIL);

        return fila;
    }

    public static int columnaCPU(){
        int columna;

        columna = (int) (Math.random() * COL);

        return columna;
    }

    public static int filaJugador(){
        Scanner entrada = new Scanner(System.in);
        int fila;

        do{
            System.out.println("Ingresa un numero de fila): ");
            fila = entrada.nextInt();
            if(fila < 0 || fila > 7){
                System.out.println("Error, esa fila esta fuera del limite");
            }
        }while (fila <= 7 && fila >= 0);

        return fila;

    }

    public static int columnaJugador(){
        Scanner entrada = new Scanner(System.in);
        int columna;

        do{
            System.out.println("Ingresa un numero de columna): ");
            columna = entrada.nextInt();
            if(columna < 0 || columna > 7){
                System.out.println("Error, esa  columna esta fuera del limite");
            }
        }while (columna <= 7 && columna >= 0);

        return columna;

    }

    public static boolean hayBarco(int[][][] tablero, int fila, int columna){
        boolean hayBarco;

        hayBarco = false;

        if(tablero[1][fila][columna] == 0){
            System.out.println("AGUA");
        }else {
            System.out.println("TOCADO");
            hayBarco = true;
            tablero[1][fila][columna] = 1;
        }

        return hayBarco;
    }

    public static void main(String[] args) {
        rellenarTablero(TABLEROCPU);
        rellenarTablero(TABLEROJUGADOR);
        mostrarTablero(TABLEROCPU, "TABLERO CPU");
        mostrarTablero(TABLEROJUGADOR, "TABLERO JUGADOR");
    }
}
