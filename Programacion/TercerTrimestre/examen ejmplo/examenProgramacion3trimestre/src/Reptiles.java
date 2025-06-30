public class Reptiles extends Animal{

    private boolean acuatico;

    public Reptiles(int idAnimal, String nombreAnimal, Sexo sexo, int estado, boolean acuatico) {
        super(idAnimal, nombreAnimal, sexo, estado);
        this.acuatico = acuatico;
    }


    @Override
    public String toString() {
        return "Reptiles{" +
                "acuatico=" + acuatico +
                '}';
    }
}
