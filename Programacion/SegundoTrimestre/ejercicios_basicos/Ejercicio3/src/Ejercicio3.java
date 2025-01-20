//Escriba un programa que pida al usuario una cantidad de segundos
// y muestre el número de días completos, horas (descontando días
// completos) y minutos (descontando horas y días completos).

import java.util.Scanner;

public class Ejercicio3 {

    public static int pedirSegundos(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        int segundos;
        boolean error = true;

        do {
            System.out.println(mensaje);
            segundos = entrada.nextInt();
            if (segundos < 0) {
                error = false;
                System.out.println("Error tienen que se un numero positivo de segundos");
            }
        } while (error);

        return segundos;

    }

    public static void calcularSegundos(int segundos){

    }

    public static void main(String[] args) {
        int segundos;

        segundos = pedirSegundos("Introduce una cantidad de segundos");
    }
}