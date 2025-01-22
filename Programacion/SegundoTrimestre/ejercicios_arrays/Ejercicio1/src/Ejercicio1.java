//. Escriba un programa que llene un array con números del 1 al 10 y los muestre por
//pantalla.

public class Ejercicio1 {
    public static final int num = 11;

    public static int[] rellenarVector(int[] vNumeros) {
        int i;

        for (i = 1; i < vNumeros.length; i++) {
            vNumeros[i] = i;
        }

        return vNumeros;
    }

    public static void mostrarVector(int[] vNumeros) {
        int i;

        for (i = 1; i < vNumeros.length; i++) {
            System.out.print("[" + vNumeros[i] + "]");
        }
    }

    public static void main(String[] args) {
        int[] vNumeros = new int[Ejercicio1.num];
        rellenarVector(vNumeros);
        mostrarVector(vNumeros);

    }
}