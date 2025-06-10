public class Reptiles extends Animal{
    private boolean acuatico;

    public Reptiles(String nombre, Sexo sexo, int estado, int crias, boolean acuatico) {
        super(nombre, sexo, estado, crias);
        this.acuatico = acuatico;
    }
}
