import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operaria {

    static Scanner ENTRADA = new Scanner(System.in);

    private static Map<Integer, Animal> mAnimales = new HashMap<>();

    private static double pedirDouble(String mensaje){
        double num;
        System.out.println(mensaje);
        num = ENTRADA.nextDouble();
        ENTRADA.nextLine();
        return num;

    }
    private static int pedirInt(String mensaje){
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();
        ENTRADA.nextLine();
        return num;

    }

    private static String pedirString(String mensaje){
        System.out.println(mensaje);
        return ENTRADA.nextLine();
    }

    public void añadirNuevoAnimal(String tipo,String nombre, Sexo sexo, int Estado, int Crias){
        Animal nuevoAnimal;
        switch (tipo){
            case "mamifero":
                double peso = pedirDouble("peso del animal: ");
                double altura = pedirDouble("ALtura del animal: ");
                boolean csrnivoro;
                String respuesta;
                System.out.println("Es carnivoro?");
                respuesta = ENTRADA.nextLine();
                if (respuesta.equalsIgnoreCase("si")){
                    csrnivoro = true;
                }else {
                    csrnivoro = false;
                }

                nuevoAnimal = new Mamifero(nombre, sexo,Estado, Crias, peso,altura,csrnivoro);

                mAnimales.put(nuevoAnimal.getIdAnimal(), nuevoAnimal);
                break;
            case "ave":

                String colorPlumaje = pedirString("Color del plumeje : ");
                double longitudPico = pedirDouble("Longitud del pico: ");

                nuevoAnimal = new Aves(nombre, sexo, Estado, Crias, colorPlumaje, longitudPico);

                mAnimales.put(nuevoAnimal.getIdAnimal(), nuevoAnimal);

                break;

            case "reptil":
                boolean acuatico;
                String respuestaRep;
                respuestaRep = pedirString("Es acuatico?");
                if (respuestaRep.equalsIgnoreCase("si")){
                    acuatico = true;

                }else {
                    acuatico = false;
                }

                nuevoAnimal = new Reptiles(nombre, sexo, Estado, Crias, acuatico);

                mAnimales.put(nuevoAnimal.getIdAnimal(), nuevoAnimal);

                break;
            default:
                System.out.println("Animal no identificado");
                break;
        }



    }

    public void mostrarMapa(){
        for (Map.Entry<Integer, Animal> entry : mAnimales.entrySet()){
            System.out.println(entry.getKey() + " <d" + entry.getValue());
        }
    }

    public void cambiarEstadoAnimal(){
        int id, estado;

        id = pedirInt("IKngrreese el id del animal que deseas busacar");

        if (mAnimales.containsKey(id)){
            Animal ani;

            ani = mAnimales.get(id);

            estado = pedirInt("Introduce el estado del animal: ");
            ani.setEstado(estado);
            System.out.println("Estado cambiado");
        }

    }

}
