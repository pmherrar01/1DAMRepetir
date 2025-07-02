package animales;

public class Aves extends Animal {

    protected String colorPlumaje;
    protected double longitudPico;

    public Aves(int idAnimal, int estado, String nombAnimal, Sexo sexoAnimal, String colorPlumaje, double longitudPico) {
        super(idAnimal, estado, nombAnimal, sexoAnimal);
        this.colorPlumaje = colorPlumaje;
        this.longitudPico = longitudPico;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "longitudPico=" + longitudPico +
                ", idAnimal=" + idAnimal +
                ", estado=" + estado +
                ", crias=" + crias +
                ", nombAnimal='" + nombAnimal + '\'' +
                ", sexoAnimal=" + sexoAnimal +
                '}';
    }
}
