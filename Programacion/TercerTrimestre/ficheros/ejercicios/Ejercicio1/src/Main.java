//Crea una aplicación en java que reciba por teclado un directorio y una extensión de archivo y muestre en pantalla sólo los ficheros con esa extensión.
//
//Ejemplo:
//Introduce directorio:    C:\Pruebas
//Filtrar por extensión:   txt
//Salida de C:\Pruebas
//info.txt
//fichero.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirExtension() {
        System.out.println("Introduce la extension que queres filtar");
        return ENTRADA.nextLine();
    }

    public static void main(String[] args) {
        String extension;
        Path p;

        p = Paths.get("C:\\Users\\pmherrerar01\\Desktop\\1DAMRepetir\\Programacion\\TercerTrimestre\\ficheros\\ejercicios\\Ejercicio1\\Ficheros");


        try {
            extension = pedirExtension();
            if (Files.isDirectory(p)) {
                // List<Path> lista = Files.walk(p).toList(); es otra manera de hacer el ejercicio
                for (Path po : Files.walk(p).toList()) { //(Path po : lista) la otra forma de hacerlo
                    //walk sirve para poder recorrer todos los elementos de un directorio en este caso (p)
                    if (Files.isRegularFile(po)) {
                        if (po.getFileName().toString().endsWith(extension)) {
                            System.out.println(po.getFileName());
                        }
                    }
                }

            }
        } catch (IOException e) {

        }

    }
}