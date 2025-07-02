package animales;

public class Reptiles extends Animal {

    protected boolean acuatico;

    public Reptiles(int idAnimal, int estado, String nombAnimal, Sexo sexoAnimal, boolean acuatico) {
        super(idAnimal, estado, nombAnimal, sexoAnimal);
        this.acuatico = acuatico;
    }

    @Override
    public String toString() {
        return "Reptiles{" +
                "acuatico=" + acuatico +
                ", idAnimal=" + idAnimal +
                ", estado=" + estado +
                ", crias=" + crias +
                ", nombAnimal='" + nombAnimal + '\'' +
                ", sexoAnimal=" + sexoAnimal +
                '}';
    }
}
