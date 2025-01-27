//Escriba un programa que almacene en una matriz de 5*4 números aleatorios entre 1 y 50.
//Después haga lo siguiente:
//a) Muestre la matriz.
//b) Pida al usuario un número de fila y muestre los datos de esa fila. (Controle que el usuario
//no introduzca filas erróneas)

//c) Pida al usuario un número de columna y muestre los datos de esa columna. (Controle que
//el usuario no introduzca columnas erróneas)
import java.util.Scanner;

public class Main {

    public static int FIL = 5;
    public static int COL = 4;

    public static int[][] rellenarMatriz(int[][] matriz){
        int numAleatorio, i, j;

        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz[i].length; j++) {
                numAleatorio = (int) (Math.random() * 50 + 1);
                matriz[i][j]= numAleatorio;
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz){
        int i, j;

        System.out.println("Los numeros de la matriz son:");
        for(i = 0; i < matriz.length; i++){
            System.out.println("");
            for (j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] +  "]");
            }
        }
    }

    public static int pedirNum(String mensaje){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println(mensaje);
        num = entrada.nextInt();

        return  num;
    }

    public static void mostrarFila(int[][] matriz){
        int num, j;
        boolean valido;

        while (true) { // Bucle para repetir la solicitud hasta que sea válida
            try {
                num = pedirNum("\nIntroduce un nuemode fila (1-5)") -1;
                if (num <= FIL && num > -1) {
                    valido = true;
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("El número debe estar entre 1 y " + FIL + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
            }
        }

        if(valido){
            System.out.println("Fila --> " + (num+1));
            for(j = 0; j < matriz[num].length; j++){
                System.out.print("[" + matriz[num][j] + "]");
            }
        }

    }

    public static void mostrarColumnas(int[][] matriz){
        int num, i, j;
        boolean valido;

        while (true) { // Bucle para repetir la solicitud hasta que sea válida
            try {
                num = pedirNum("\nIntroduce un numero de Columna (1-4)") -1;
                if (num <= FIL && num > -1) {
                    valido = true;
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("El número debe estar entre 1 y " + COL + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
            }
        }

        if(valido) {
            System.out.println("Columna --> " + (num + 1));
            for (i = 0; i < matriz[num].length; j++) {
                for (j = 0; j < matriz[i].length; j++) {
                    System.out.print("[" + matriz[num][j] + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[FIL][COL];

        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarFila(matriz);
        mostrarColumnas(matriz);
    }
}
