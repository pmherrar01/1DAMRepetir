public class Aves extends Animal{

    private String color;
    private double longitudPico;

    public Aves(int idAnimal, String nombreAnimal, Sexo sexo, int estado,  String color, double longitudPico) {
        super(idAnimal, nombreAnimal, sexo, estado);
        this.color = color;
        this.longitudPico = longitudPico;
    }


    @Override
    public String toString() {
        return "Aves{" +
                "color='" + color + '\'' +
                ", longitudPico=" + longitudPico +
                '}';
    }
}
