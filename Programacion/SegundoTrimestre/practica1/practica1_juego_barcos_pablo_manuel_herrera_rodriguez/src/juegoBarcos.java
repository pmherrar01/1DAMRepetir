public class juegoBarcos {  // Nombre de la clase en mayúscula según convención Java
    public static final int FIL = 8;
    public static final int COL = 8;
    public static final int[][][] TABLERO = new int[2][FIL][COL];
    public static final int[] BARCOS = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    public static int elegirCoordenadas() {
        return (int) (Math.random() * 7) + 1;
    }

    public static int elegirBarco(){
        return (int) (Math.random() * BARCOS.length);
    }

    public static void colocarBarco(int barco, int[][][] tablero){

    }

    public static void rellenarTablero(int[][][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                for (int k = 0; k < tablero[i][j].length; k++) {
                    tablero[i][j][k] = 0;
                }
            }
        }
    }

    public static void mostrarTablero(int[][][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (i == 0) {
                System.out.println("Tablero USUARIO:");
                for (int j = 0; j < tablero[i].length; j++) {
                    for (int k = 0; k < tablero[i][j].length; k++) {
                        System.out.print(tablero[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }else{
                System.out.println("Tablero CPU:");
                for (int j = 0; j < tablero[i].length; j++) {
                    for (int k = 0; k < tablero[i][j].length; k++) {
                        System.out.print(tablero[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        rellenarTablero(TABLERO);
        mostrarTablero(TABLERO);
    }
}
