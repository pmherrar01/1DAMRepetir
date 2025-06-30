import java.util.List;
import java.util.Scanner;

public class Main {

    static final Scanner ENTRADA = new Scanner(System.in);

    private static int pedirNum(String mensaje) {
        int num;

        System.out.println(mensaje);
        num = ENTRADA.nextInt();

        ENTRADA.nextLine();

        return num;

    }

    private static void menu(Operativas op) {
        int num;


        do {
            System.out.println("1- Añadir animal");
            System.out.println("2- Cambiar estado animal");
            System.out.println("3- Obtener lista animales enfermos");
            System.out.println("4- Mostrar animales por Especie");
            System.out.println("5- Mostrar animales por estado");
            System.out.println("6- _Mostrar animales de diferente sexo por estado");
            System.out.println("7- Volcar al fichero");
            System.out.println("8- Salir");
            num = pedirNum("Elige una opcion: ");

            switch (num) {
                case 1:
                    op.crearAnimal();
                    break;
                case 2:
                    op.cambiarEstadoAnimal();
                    break;
                case 3:
                    List<Animal> lEnfermos = op.listaAnimalesEnfermos();
                    System.out.println("lEnfermos = " + lEnfermos);
                    break;
                case 4:
                    op.mostrarPorEspecie();
                    break;
                case 5:
                    op.mostrarPorEstado();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

            }
        } while (num != 8);
    }

    public static void main(String[] args) {
        Operativas op = new Operativas();
        menu(op);

    }
}