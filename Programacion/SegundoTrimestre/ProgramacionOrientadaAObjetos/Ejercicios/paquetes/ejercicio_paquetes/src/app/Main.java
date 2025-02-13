//Instrucciones:
//● Organiza el código en paquetes adecuados.
//● Implementa las clases y estructuras necesarias para cumplir con los requisitos.
//● Usa arrays estáticos para almacenar la información.
//● No es necesario utilizar herencia.
//● Asegúrate de que el código sea funcional y bien estructurado.
//Ejercicio:
//Se desea desarrollar un pequeño sistema para la gestión de una tienda. El sistema debe
//permitir registrar productos y clientes, así como mostrar la información almacenada. El
//sistema debe estar organizado en paquetes.
//1. Estructura del sistema:
//○ Define una clase para representar productos, que contenga un identificador,
//un nombre y un precio.
//○ Define una clase para representar clientes, con un identificador, un nombre y
//un correo electrónico.
//2. Almacenamiento de datos:
//○ Implementa una clase que gestione la tienda y permita almacenar hasta 10
//productos y 10 clientes utilizando arrays.
//○ Controla que no se puedan agregar más elementos de los permitidos.
//3. Funciones del sistema:
//○ Permite agregar productos y clientes a la tienda.
//○ Implementa una forma de mostrar los productos y clientes registrados.
//4. Prueba del sistema:
//○ Crea una clase principal que instancie la tienda, agregue algunos productos y
//clientes, y luego muestre la información almacenada.
//Un ejemplo de organización en paquetes:
//● Un paquete llamado modelo que contendrá las clases Producto y Cliente.
//● Un paquete llamado servicio que contendrá la clase Tienda para gestionar la
//lógica del negocio.
//● Un paquete llamado app que contendrá la clase Main, encargada de ejecutar el
//programa.

package app;

import modelo.Cliente;
import modelo.Producto;
import servicio.Tienda;

import java.util.Scanner;

public class Main {

    public static Cliente rellenarDatosCliente(){
        Scanner entrada = new Scanner(System.in);
        Cliente cliente;
        int id_cliente;
        String nombre, correo;

        System.out.println("Introduce el id del cliente:");
        id_cliente = entrada.nextInt();
        System.out.println("Introduce el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Introduce el correo el cliente");
        correo = entrada.nextLine();

        cliente  = new Cliente(id_cliente, nombre, correo);

        return cliente;
    }
    public static Producto rellenarDatosProducto(){
        Scanner entrada = new Scanner(System.in);
        Producto producto;
        int id_producto;
        String nombre;
        Double precio;

        System.out.println("Introduce el id del producto:");
        id_producto = entrada.nextInt();
        System.out.println("Introduce el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Introduce precio del producto");
        precio = entrada.nextDouble();

        producto = new Producto(id_producto,nombre,precio);

        return producto;
    }

    public static void main(String[] args) {
        Tienda tienda;

        tienda = new Tienda();

        tienda.gestionarTienda(rellenarDatosCliente(),rellenarDatosProducto());
    }
}