public class Reptiles extends Animal{

    private boolean acuatico;

    public Reptiles( String nombreAnimal, Sexo sexo, int estado, boolean acuatico) {
        super( nombreAnimal, sexo, estado);
        this.acuatico = acuatico;
    }
}
