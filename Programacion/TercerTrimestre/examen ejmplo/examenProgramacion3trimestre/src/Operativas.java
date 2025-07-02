import animales.*;

import java.util.*;

public class Operativas {

    final  Scanner ENTRADA = new Scanner(System.in);
    Map<String, List<Animal>> mAnimalesEspecie = new HashMap<>();
    Map<Integer, List<Animal>> mAnimalesEstado = new HashMap<>();
    Map<Integer, Animal> mAnimalesId = new HashMap<>();


    private String pedirString(String menaje){
        System.out.println(menaje);
        return ENTRADA.nextLine().toLowerCase().trim();

    }

    private int pedirInt(String mensaje){
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();

        ENTRADA.nextLine();

        return num;

    }

    private double pedirDouble(String mensaje){
        double num;
        System.out.println(mensaje);
        num = ENTRADA.nextDouble();

        ENTRADA.nextLine();

        return num;

    }

    private Animal pedirDatosAnimal(String especie){
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
        if (sexo.equalsIgnoreCase("H")){
            sexoAnimal = Sexo.H;
        }else {
            sexoAnimal = Sexo.M;
        }

        do {

            switch (especie){
                case "mamifero":
                    peso = pedirDouble("peso del animal: ");
                    altura = pedirDouble("Altura animal");
                    respuestaCarnivoro = pedirString("¿Es carnivoro?");
                    if(respuestaCarnivoro.equalsIgnoreCase("si")){
                        esCarnivoro = true;
                    }else {
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

                    if (respuestaAcuatico.equalsIgnoreCase("si")){
                        esAcuatico = true;
                    }else {
                        esAcuatico = false;
                    }

                    ani = new Reptiles(idAnimal, estado, nombreAnimal, sexoAnimal, esAcuatico);

                    break;
                default:
                    System.out.println("Esa especie no se puede guardar");
                    guardarEspecie = false;
                    break;

            }

        }while (!guardarEspecie);

        return ani;

    }

    public void añadirAnimal(){

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

    private Animal buscarAnimal(int idAnimal){
        Animal ani;

        ani = (Animal) mAnimalesId.get(idAnimal);

        return ani;

    }

    public void cambiarEstadoAnimal(){
        Animal ani = buscarAnimal(pedirInt("Introduce el numero del animal que deseas cambiar el estado: "));

        int estado = pedirInt("Nuevo estado: (bien '0', enfermo '1', en tratamiento '2')");


        if (ani.getEstado() == estado){
            System.out.println("Error este animal ya tine ese estado: ");
        }else {

            ani.setEstado(estado);
            System.out.println("Estado modificado con exito");

        }



    }

    public List<Animal> listaEnfermos(){
        List<Animal> lEnfermos = mAnimalesEstado.get(1);

        return lEnfermos;
    }

    public List<Animal> listaEspecie(){
        List<Animal> lEspecie = mAnimalesEspecie.get(pedirString("introduce la especie que deseas buscar"));

        return lEspecie;
    }

    public List<Animal> listaEstado(){
        List<Animal> lEstado = mAnimalesEstado.get(pedirInt("Introduce el estado que deseas buscar: "));

        return lEstado;
    }

    private List<Animal> lHembrasPorEspecie(List<Animal> lEspecie){
        List<Animal> lHembras = new ArrayList<>();

        for (Animal ani : lEspecie){
            if (ani.getSexoAnimal() == Sexo.H){
                lHembras.add(ani);
            }
        }

        return lHembras;

    }


    private List<Animal> lMachosPorEspecie(){
        List<Animal> lMachos = new ArrayList<>();

        for (Map.Entry<String, List<Animal>> entry : mAnimalesEspecie.keySet()){
            if (ani.getSexoAnimal() == Sexo.M){
                lMachos.add(ani);
            }
        }

        return lMachos;

    }

    public void contHembrasMAchosEspecie(){
        int contMachos;

        contMachos = lMachosPorEspecie().size();

        System.out.println("Especie: " + mAnimalesEspecie.get("mamifero"));



    }




}
