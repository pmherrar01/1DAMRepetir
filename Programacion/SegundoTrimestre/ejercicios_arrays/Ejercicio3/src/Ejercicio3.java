//Escriba un programa que almacene en un array los 20 primeros números pares.
//Mostrar el contenido del array.

public class Ejercicio3 {
    public static final int num = 20;

    public static int[] rellenarVector(int[] vNumerosPares){
        int i, numPar;

        numPar = 2;

        for (i = 0; i < vNumerosPares.length; i++) {
                vNumerosPares[i] = numPar ;
                numPar += 2;

        }

        return vNumerosPares;
    }

    public static void mostrarVector(int[] vPares){
        int i;

        for (i = 0; i < vPares.length; i++) {
            System.out.print("[" + vPares[i] + "]");
        }
    }

    public static void main(String[] args) {
        int[] vNumerosPares = new int[num];

        rellenarVector(vNumerosPares);
        mostrarVector(vNumerosPares);
    }
}