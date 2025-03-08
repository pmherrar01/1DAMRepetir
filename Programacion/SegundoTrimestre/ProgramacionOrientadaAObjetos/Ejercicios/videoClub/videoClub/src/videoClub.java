//Descripción del Programa:
//Crea un proyecto que simule un videoclub. En dicho videoclub existen películas de las
//que se conoce un id, el título, el nombre del director/a, la calificación (edad mínima
//recomendada para visualizar la película), si está disponible para alquilar o no, y la
//categoría (COMEDIA, TERROR, ACCION, CIENCIA FICCION o AVENTURA)
//Todos los atributos son obligatorios excepto la calificación; si no se especifica, por
//defecto, serán 16 años. Crea dos constructores que cumplan este requisito.
//Añade a la clase Pelicula el siguiente métodos:
//● boolean aptaParaTodoPublico(): devuelve true si la película es apta para todos los
//públicos. Se considera que lo es si la edad mínima recomendada es inferior a 7.
//● boolean alquilar(): alquila la película (pasa a estar no disponible). Si al llamar al
//método dicha película no está disponible, devuelve falso; si se ha podido alquilar,
//devuelve true.
//● boolean devolver(): devuelve la película (pasa a estar disponible). Si la película
//estaba en el estado no disponible, cambia de estado y devuelve true; en caso
//contrario, devuelve false ya que no se ha podido realizar la operación.
//Especificaciones del Programa Principal:
//1. El videoclub debe gestionar un máximo de 10 películas.
//2. Las siguientes operaciones deben repetirse hasta que el usuario seleccione
//Salir:
//● Nueva película: si hay espacio disponible en el videoclub, inserta una
//nueva película con los datos indicados por el usuario.
//● Mostrar películas: muestra el título, calificación, si está disponible para
//alquilar y la categoría de la película.
//● Mostrar películas por categoría: muestra todas las películas que
//pertenecen a la categoría indicada por el usuario.
//● Alquilar película: el usuario indica el título de la película que quiere
//alquilar. Si existe y está disponible, pasará a estar no disponible y mostrará
//el mensaje “Enhorabuena, has alquilado la película”; si no está disponible,
//mostrará el mensaje “Lo sentimos, la película no está disponible en este
//momento”. Si no existe la película se mostrará el mensaje “La película no
//existe en nuestras instalaciones”.
//● Devolver película: el usuario indica el título de la película que quiere
//alquilar. Si está en estado no disponible, se cambia el estado y se muestra
//mensaje de confirmación; si está disponible se muestra mensaje de error.
//Si no existe la película se mostrará el mensaje “Error en la devolución. La
//película no existe en nuestras instalaciones”.
//3. Implementa las funciones necesarias para evitar la repetición de código.

import java.util.InputMismatchException;
import java.util.Scanner;

public class videoClub {

    private static final int MAX = 10;
    private static Pelicula[] vPeliculas = new Pelicula[MAX];
    private static Scanner ENTRADA = new Scanner(System.in);
    private static int contPeliculas = 0;

    public static int pedirNum(String mensaje) {
        int num = 0;
        boolean error = false;

        try {
            System.out.print(mensaje);
            num = ENTRADA.nextInt();
            if (num >= 0) {
                error = true;
            } else {
                System.out.println("Error debes introducir un numoer psotivo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error debes introducir un numero positivo");
            ENTRADA.next();
        } finally {
            ENTRADA.nextLine();
        }

        return num;
    }


    public static String pedirString(String mensaje) {
        System.out.print(mensaje);
        return ENTRADA.nextLine();
    }

    public static void menu() {
        int num;
        do {
            System.out.println("------MENU------");
            System.out.println("1- NUEVA PELICULA");
            System.out.println("2- MOSTRAR PELICULAS");
            System.out.println("3- MOSTRAR PELICULAS POR CATEGORIA");
            System.out.println("4- ALQUILAR PELICULA");
            System.out.println("5- DEVOLVER PELICULA");
            System.out.println("6- SALIR");
            num = ENTRADA.nextInt();

            switch (num) {
                case 1:
                    System.out.println("NUEVA PELICULA:");
                    rellenarPelicula();
                    break;
                case 2:
                    System.out.println("MOSTRAR PELICULA");
                    mostrarPeliculas();
                    break;
                case 3:
                    System.out.println("MOSTRAR POR CATEGORIA");
                    break;
                case 4:
                    System.out.println("ALQUILAR");
                    break;
                case 5:
                    System.out.println("DEVOLVER");
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (num != 6);
    }

    public static Pelicula rellenarDatosPeliculas() {
        Pelicula pelicula;
        int idPelicula, calificacion;
        String nombrePelicula, nombreDirector, categoria;
        boolean disponible;

        disponible = true;

        idPelicula = pedirNum("Introduce el id del la pelicula");
        nombrePelicula = pedirString("Introduce el nombre de la pelicula");
        nombreDirector = pedirString("Ingrese el nombre del director");
        categoria = pedirString("Ingrese categoría (COMEDIA, TERROR, ACCION, CIENCIA FICCION, AVENTURA): ");
        calificacion = pedirNum("Ingrese calificación (o -1 para predeterminado): ");

        if (calificacion == -1) {
            pelicula = new Pelicula(idPelicula, nombrePelicula, nombreDirector, categoria, disponible);
        } else {
            pelicula = new Pelicula(idPelicula, calificacion, nombrePelicula, nombreDirector, categoria, disponible);
        }

        return pelicula;
    }


    public static void rellenarPelicula() {
        if (contPeliculas >= 10) {
            System.out.println("No hay mas expacio para almacenar peliculas");
            return;
        } else {
            vPeliculas[contPeliculas] = rellenarDatosPeliculas();
            contPeliculas++;
            System.out.println("Pelicula añadida coreptamente");
        }

    }

    public static void mostrarPeliculas() {
        if (contPeliculas == 0) {
            System.out.println("No hay películas guardadas todavía.");
            return;
        }

        for (int i = 0; i < contPeliculas; i++) {
            vPeliculas[i].mostrarInfo();  //
        }
    }


    public static void main(String[] args) {
        menu();
    }
}