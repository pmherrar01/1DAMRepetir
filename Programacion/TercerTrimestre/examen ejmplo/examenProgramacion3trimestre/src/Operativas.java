import animales.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Operativas {

    final Scanner ENTRADA = new Scanner(System.in);
    Map<String, List<Animal>> mAnimalesEspecie = new HashMap<>();
    Map<Integer, List<Animal>> mAnimalesEstado = new HashMap<>();
    Map<Integer, Animal> mAnimalesId = new HashMap<>();


    private String pedirString(String menaje) {
        System.out.println(menaje);
        return ENTRADA.nextLine().toLowerCase().trim();

    }

    private int pedirInt(String mensaje) {
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();

        ENTRADA.nextLine();

        return num;

    }

    private double pedirDouble(String mensaje) {
        double num;
        System.out.println(mensaje);
        num = ENTRADA.nextDouble();

        ENTRADA.nextLine();

        return num;

    }

    private Animal pedirDatosAnimal(String especie) {
        Animal ani = null;

        int idAnimal, estado;
        String nombreAnimal, sexo, respuestaCarnivoro, colorPlumaje, respuestaAcuatico;
        Sexo sexoAnimal;
        double peso, altura, longitudPico;
        boolean esCarnivoro, esAcuatico, guardarEspecie = true;

        idAnimal = pedirInt("ID: ");
        estado = pedirInt("Estado:  (si el animal está bien de salud con el valor 0, si\\n\" +\n" +
                "                \"está enfermo en estado guardaremos un 1 y si está en tratamiento estado almacenará\\n\" +\n" +
                "                \"un 2)");
        nombreAnimal = pedirString("Nombre animal: ");
        sexo = pedirString("animales.Sexo:  (H 'hembra' o M 'macho')");
        if (sexo.equalsIgnoreCase("H")) {
            sexoAnimal = Sexo.H;
        } else {
            sexoAnimal = Sexo.M;
        }

        do {

            switch (especie) {
                case "mamifero":
                    peso = pedirDouble("peso del animal: ");
                    altura = pedirDouble("Altura animal");
                    respuestaCarnivoro = pedirString("¿Es carnivoro?");
                    if (respuestaCarnivoro.equalsIgnoreCase("si")) {
                        esCarnivoro = true;
                    } else {
                        esCarnivoro = false;
                    }

                    ani = new Mamifero(idAnimal, estado, nombreAnimal, sexoAnimal, peso, altura, esCarnivoro);

                    break;
                case "ave":

                    colorPlumaje = pedirString("Color plumaje");

                    longitudPico = pedirDouble("Longitud del pico: ");

                    ani = new Aves(idAnimal, estado, nombreAnimal, sexoAnimal, colorPlumaje, longitudPico);

                    break;
                case "reptil":

                    respuestaAcuatico = pedirString("¿Es acuatico?");

                    if (respuestaAcuatico.equalsIgnoreCase("si")) {
                        esAcuatico = true;
                    } else {
                        esAcuatico = false;
                    }

                    ani = new Reptiles(idAnimal, estado, nombreAnimal, sexoAnimal, esAcuatico);

                    break;
                default:
                    System.out.println("Esa especie no se puede guardar");
                    guardarEspecie = false;
                    break;

            }

        } while (!guardarEspecie);

        return ani;

    }

    public void añadirAnimal() {

        String especie;

        especie = pedirString("Indica la especie del animal:  (mamifero, reptil o ave)");

        Animal ani = pedirDatosAnimal(especie);
        int estado = ani.getEstado();

        mAnimalesEspecie.putIfAbsent(especie, new ArrayList<>());
        mAnimalesEspecie.get(especie).add(ani);

        mAnimalesEstado.putIfAbsent(estado, new ArrayList<>());
        mAnimalesEstado.get(estado).add(ani);

        mAnimalesId.putIfAbsent(ani.getIdAnimal(), ani);

        System.out.println("Animal añadido con exito");


    }

    private Animal buscarAnimal(int idAnimal) {
        Animal ani;

        ani = (Animal) mAnimalesId.get(idAnimal);

        return ani;

    }

    public void cambiarEstadoAnimal() {
        Animal ani = buscarAnimal(pedirInt("Introduce el numero del animal que deseas cambiar el estado: "));

        int estado = pedirInt("Nuevo estado: (bien '0', enfermo '1', en tratamiento '2')");


        if (ani.getEstado() == estado) {
            System.out.println("Error este animal ya tine ese estado: ");
        } else {

            ani.setEstado(estado);
            System.out.println("Estado modificado con exito");

        }


    }

    public List<Animal> listaEnfermos() {
        List<Animal> lEnfermos = mAnimalesEstado.get(1);

        return lEnfermos;
    }

    public List<Animal> listaEspecie() {
        List<Animal> lEspecie = mAnimalesEspecie.get(pedirString("introduce la especie que deseas buscar"));

        return lEspecie;
    }

    public List<Animal> listaEstado() {
        List<Animal> lEstado = mAnimalesEstado.get(pedirInt("Introduce el estado que deseas buscar: "));

        return lEstado;
    }

    private List<Animal> lHembrasPorEspecie(List<Animal> lEspecie) {
        List<Animal> lHembras = new ArrayList<>();

        for (Animal ani : lEspecie) {
            if (ani.getSexoAnimal() == Sexo.H) {
                lHembras.add(ani);
            }
        }

        return lHembras;

    }


    private List<Animal> lMachosPorEspecie(List<Animal> lEspecie) {
        List<Animal> lMachos = new ArrayList<>();

        for (Animal ani : lEspecie) {
            if (ani.getSexoAnimal() == Sexo.M) {
                lMachos.add(ani);
            }
        }

        return lMachos;

    }

    public void contHembrasMAchosEspecie() {
        System.out.println("Número de especies en el map: " + mAnimalesEspecie.size());

        for (Map.Entry<String, List<Animal>> entry : mAnimalesEspecie.entrySet()) {
            String especie = entry.getKey();
            List<Animal> animales = entry.getValue();

            System.out.println("Procesando especie: " + especie + " con " + animales.size() + " animales.");

            List<Animal> hembras = lHembrasPorEspecie(animales);
            List<Animal> machos = lMachosPorEspecie(animales);

            System.out.println("-------------------------");
            System.out.println("Especie: " + especie);
            System.out.println("Num hembras: " + hembras.size());
            System.out.println("Num machos: " + machos.size());
        }
    }


    public void volcarFichero() {
        Path rutaFichero = Paths.get("/Users/pablo/Desktop/1DAMRepetir/Programacion/TercerTrimestre/examen ejmplo/examenProgramacion3trimestre/ficheros/animales.txt");
        List<Animal> todosLosAnimales = new ArrayList<>();
        List<String> lContenido = new ArrayList<>();

        // Asegurarse de que el directorio existe
        try {
            Path rutaDirectorio = rutaFichero.getParent();
            if (!Files.exists(rutaDirectorio)) {
                Files.createDirectories(rutaDirectorio);
                System.out.println("Directorio creado: " + rutaDirectorio);
            }
        } catch (IOException e) {
            System.out.println("Error al crear directorio: " + e.getMessage());
            e.printStackTrace();
            return; // Parar si no puede crear directorio
        }

        // Recopilar todos los animales
        for (List<Animal> animales : mAnimalesEspecie.values()) {
            todosLosAnimales.addAll(animales);
        }

        // Preparar contenido
        for (Animal ani : todosLosAnimales) {
            String linea = "Id: " + ani.getIdAnimal() +
                    " Nombre: " + ani.getNombAnimal() +
                    " Sexo: " + ani.getSexoAnimal() +
                    " Estado: " + ani.getEstado();
            lContenido.add(linea);
        }

        // Escribir fichero (sobreescribiendo si ya existe)
        try {
            Files.write(rutaFichero, lContenido, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Fichero volcado perfectamente");
        } catch (IOException e) {
            System.out.println("Error al crear o escribir el fichero: " + e.getMessage());
            e.printStackTrace();
        }
    }



}
