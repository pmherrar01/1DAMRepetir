import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operativas {

    final static Scanner ENTRADA = new Scanner(System.in);
    private Map<Animal, String> mAnimales = new HashMap<>();

    public void crearAnimal() {
        String nombreAnimal, sexo, carnivoro, acuatico, colorPlumas;
        Sexo sexoAnimal;
        boolean esCarnivoro, esAcuatico;
        double peso, altura, longitudPico;
        int estado;

        Animal animal;

        System.out.println("que especie es el animal?");
        String especie = ENTRADA.nextLine().toLowerCase();

        switch (especie) {
            case "mamifero":
                System.out.println("Nombre animal: ");
                nombreAnimal = ENTRADA.nextLine();

                System.out.println("Sexo (M o H)");
                sexo = ENTRADA.nextLine();
                sexoAnimal = sexo.equalsIgnoreCase("H") ? Sexo.H : Sexo.M;

                System.out.println("Estado:");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("peso:");
                peso = ENTRADA.nextDouble();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("Altura");
                altura = ENTRADA.nextDouble();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("Es carnivoro? (si o no)");
                carnivoro = ENTRADA.nextLine().toLowerCase();
                esCarnivoro = carnivoro.equals("si");

                animal = new Mamifero(nombreAnimal, sexoAnimal, estado, peso, altura, esCarnivoro);
                mAnimales.put(animal, especie);
                break;

            case "reptil":
                System.out.println("Nombre animal: ");
                nombreAnimal = ENTRADA.nextLine();

                System.out.println("Sexo (M o H)");
                sexo = ENTRADA.nextLine();
                sexoAnimal = sexo.equalsIgnoreCase("H") ? Sexo.H : Sexo.M;

                System.out.println("Estado:");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("es acuatico? (si o no)");
                acuatico = ENTRADA.nextLine().toLowerCase();
                esAcuatico = acuatico.equals("si");

                animal = new Reptiles(nombreAnimal, sexoAnimal, estado, esAcuatico);
                mAnimales.put(animal, especie);
                break;

            default:
                System.out.println("Nombre animal: ");
                nombreAnimal = ENTRADA.nextLine();

                System.out.println("Sexo (M o H)");
                sexo = ENTRADA.nextLine();
                sexoAnimal = sexo.equalsIgnoreCase("H") ? Sexo.H : Sexo.M;

                System.out.println("Estado:");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("color de las plumas: ");
                colorPlumas = ENTRADA.nextLine();

                System.out.println("Longitud del pico: ");
                longitudPico = ENTRADA.nextDouble();
                ENTRADA.nextLine(); // <--- importante

                animal = new Aves(nombreAnimal, sexoAnimal, estado, colorPlumas, longitudPico);
                mAnimales.put(animal, especie);
                break;
        }
    }
}
