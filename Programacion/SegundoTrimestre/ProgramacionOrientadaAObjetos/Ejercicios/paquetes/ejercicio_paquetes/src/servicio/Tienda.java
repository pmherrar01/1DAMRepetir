package servicio;

import modelo.Cliente;
import modelo.Producto;

import java.util.Scanner;

public class Tienda {

    public static final int CANTIDAD = 10;
    public static final Cliente[] VCLIENTES = new Cliente[CANTIDAD];
    public static final Producto[] VPRODUCTOS = new Producto[CANTIDAD];


    public void  gestionarTienda(Cliente cliente, Producto producto) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        int i, j;

        respuesta = "";
        i = 0;
        j = 0;

        do {
            if (i == 10) {
                System.out.println("Error no hay mas espacios para almacenar mas clientes");
            } else {
                VCLIENTES[i] = cliente;
                System.out.println("¿Deseas crear otro cliente (SI / NO)?");
                respuesta = entrada.nextLine();
                i++;
            }
        } while (!respuesta.equalsIgnoreCase("SI") || i <= 9);
        do {
            if (j == 10) {
                System.out.println("Error no hay mas espacios para almacenar mas clientes");
            } else {
                VPRODUCTOS[j] = producto;
                System.out.println("¿Deseas crear otro producto (SI / NO)?");
                respuesta = entrada.nextLine();
                j++;
            }
        }while (!respuesta.equalsIgnoreCase("SI") || j <= 9) ;
    }
}
