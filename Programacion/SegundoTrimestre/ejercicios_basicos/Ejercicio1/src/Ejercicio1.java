import java.util.Scanner;

public class Ejercicio1 {

    public static float pedirNum(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        float num;

        System.out.println(mensaje);
        return num = entrada.nextFloat();
    }

    public static float aplicarDescuento(float num) {
        float descuento = 0;

        if (num < 100 && num > 0) {
            System.out.print("El descuento que se va a aplicar es de 10% ");
            descuento = num - (num * 0.10f);
        } else if (num > 100 && num < 200) {
            System.out.print("El descuento que se va a aplicar es de 15% ");
            descuento = num - (num * 0.15f);
        } else if (num > 200) {
            System.out.print("El descuento que se va a aplicar es de 50% ");
            descuento = num - (num * 0.50f);
        }

        return descuento;
    }

    public static void main(String[] args) {
        float num;
        boolean menorCero = false;

        do{
            num = pedirNum("Introduce un numero (puede contener decimales) para aplicarle el descuento:");
            if (num <= 0){
                menorCero = true;
                System.out.print("Error no se puede aplicar el descuento a ese precio ");
            }else {
                System.out.println("El producto de precio:  " + num + " se queda con un valor de " + aplicarDescuento(num) + "€ aplicandole el descuento");
            }
        }while (menorCero);
    }
}