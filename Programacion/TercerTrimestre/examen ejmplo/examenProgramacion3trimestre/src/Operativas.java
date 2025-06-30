import java.util.*;

public class Operativas {

    final static Scanner ENTRADA = new Scanner(System.in);
    private Map<Animal, String> mAnimales = new HashMap<>();

    private static int pedirInt(String mensaje){
        int num;
        System.out.println(mensaje);
        num = ENTRADA.nextInt();

        ENTRADA.nextLine();

        return num;
    }

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

                System.out.println("Estado: (bien '0', enfermo '1', en tratamiento '2')");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine();

                System.out.println("peso:");
                peso = ENTRADA.nextDouble();
                ENTRADA.nextLine(); //

                System.out.println("Altura");
                altura = ENTRADA.nextDouble();
                ENTRADA.nextLine();

                System.out.println("Es carnivoro? (si o no)");
                carnivoro = ENTRADA.nextLine().toLowerCase();
                esCarnivoro = carnivoro.equals("si");

                animal = new Mamifero(pedirInt("id: "), nombreAnimal, sexoAnimal, estado, peso, altura, esCarnivoro);
                mAnimales.put(animal, especie);
                System.out.println("Animal añadido con exito");
                break;

            case "reptil":
                System.out.println("Nombre animal: ");
                nombreAnimal = ENTRADA.nextLine();

                System.out.println("Sexo (M o H)");
                sexo = ENTRADA.nextLine();
                sexoAnimal = sexo.equalsIgnoreCase("H") ? Sexo.H : Sexo.M;

                System.out.println("Estado: (bien '0', enfermo '1', en tratamiento '2')");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("es acuatico? (si o no)");
                acuatico = ENTRADA.nextLine().toLowerCase();
                esAcuatico = acuatico.equals("si");

                animal = new Reptiles(pedirInt("id: "), nombreAnimal, sexoAnimal, estado, esAcuatico);
                mAnimales.put(animal, especie);
                System.out.println("Animal añadido con exito");
                break;

            default:
                System.out.println("Nombre animal: ");
                nombreAnimal = ENTRADA.nextLine();

                System.out.println("Sexo (M o H)");
                sexo = ENTRADA.nextLine();
                sexoAnimal = sexo.equalsIgnoreCase("H") ? Sexo.H : Sexo.M;

                System.out.println("Estado: (bien '0', enfermo '1', en tratamiento '2')");
                estado = ENTRADA.nextInt();
                ENTRADA.nextLine(); // <--- importante

                System.out.println("color de las plumas: ");
                colorPlumas = ENTRADA.nextLine();

                System.out.println("Longitud del pico: ");
                longitudPico = ENTRADA.nextDouble();
                ENTRADA.nextLine(); // <--- importante

                animal = new Aves(pedirInt("id: "), nombreAnimal, sexoAnimal, estado, colorPlumas, longitudPico);
                mAnimales.put(animal, especie);

                System.out.println("Animal añadido con exito");
                break;
        }
    }

    private boolean buscarAnimal(int id){
        for (Animal ani : mAnimales.keySet()){
            if(ani.getIdAnimal()  == id){
                return true;
            }

        }

        return false;
    }

    public void cambiarEstadoAnimal(){
        int idABuscar;

        idABuscar = pedirInt("Introduce el id del animal que deseas buscar");

        if (!buscarAnimal(idABuscar)){
            System.out.println("Ese animal no esta registrado");
        }else {
            for (Map.Entry<Animal, String> entry : mAnimales.entrySet()){
                Animal animal = entry.getKey();

                if (animal.getIdAnimal() == idABuscar){
                    animal.setEstado(pedirInt("introduce el nuevo estado del animal:  (bien '0', enfermo '1', en tratamiento '2')"));
                    System.out.println("Estado cambiado con exito");
                }

            }
        }
    }

    public List<Animal> listaAnimalesEnfermos(){
        List<Animal> lAnimalesEnfermos = new ArrayList<>();

        for (Map.Entry<Animal,String> entry : mAnimales.entrySet()){
            Animal animal = entry.getKey();

            if (animal.getEstado() == 1){
                lAnimalesEnfermos.add(animal);
            }

        }

        return lAnimalesEnfermos;

    }

    private Map<String, List<Animal>> agruparPorEspecie(){
        Map<String, List<Animal>> mEspecie = new HashMap<>();


        for (Map.Entry<Animal, String> entry : mAnimales.entrySet()){
            Animal animal = entry.getKey();
            String especie = entry.getValue();

            if (!mEspecie.containsKey(especie)){
                mEspecie.put(especie, new ArrayList<>());
            }

            mEspecie.get(especie).add(animal);

        }

        return mEspecie;
    }

    public void mostrarPorEspecie(){

        String especieABuscar;

        System.out.println("especie a buscar = ");
        especieABuscar = ENTRADA.nextLine();

        for (Map.Entry<String, List<Animal>> entry : agruparPorEspecie().entrySet()){

            if (entry.getKey().equalsIgnoreCase(especieABuscar)){
                for (Animal ani : entry.getValue()){
                    System.out.println("ID: " + ani);
                }
            }
        }

    }

    private Map<Integer, List<Animal>> agruparPorEstado(){
        Map<Integer, List<Animal>> mEstado = new HashMap<>();


        for (Animal ani : mAnimales.keySet()){
            int estado = ani.getEstado();

            if (!mEstado.containsKey(estado)){
                mEstado.put(estado, new ArrayList<>());
            }

            mEstado.get(estado).add(ani);
        }

        return mEstado;
    }

    public void mostrarPorEstado(){

        for (Map.Entry<Integer, List<Animal>> entry : agruparPorEstado().entrySet()){
            if(entry.getKey() == pedirInt("Introduce el estado por el que quires filtrar")){

                for (Animal ani : entry.getValue()){
                    System.out.println("id: " + ani);
                }

            }
        }
    }


}
