public class Aves extends Animal{

    private String color;
    private double longitudPico;

    public Aves( String nombreAnimal, Sexo sexo, int estado,  String color, double longitudPico) {
        super( nombreAnimal, sexo, estado);
        this.color = color;
        this.longitudPico = longitudPico;
    }
}
