//2. Escriba un programa que pida un número de mes por teclado y
// //nos diga cuantos días tiene ese mes.
import java.util.Scanner;
public class Ejercicio2 {

    public static int pedirNum(String mensaje){
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean error = false;
        do{
            System.out.println(mensaje);
            num = entrada.nextInt();
            if(num < 1 || num > 12 ){
                System.out.println("Error ese numero no es admitido");
            }else {
                error = true;
            }
        }while (!error);
        return num;
    }

    public static int calcularDias(int num){
        int dias = 0;

        switch (num){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
        }
        return dias;

    }

    public static void main(String[] args) {
    int num, dias;

    num = pedirNum("Introduce un numero que corresponda con un mes y te digo cuentos numeros tiene");
    dias = calcularDias(num);

    System.out.println("El mes " + num + " tiene un total de " + dias + " dias");
    }

}