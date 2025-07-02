package animales;

public class Mamifero extends Animal {

    protected double peso, altura;
    protected boolean carnivoro;

    public Mamifero(int idAnimal, int estado, String nombAnimal, Sexo sexoAnimal, double peso, double altura, boolean carnivoro) {
        super(idAnimal, estado, nombAnimal, sexoAnimal);
        this.peso = peso;
        this.altura = altura;
        this.carnivoro = carnivoro;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", carnivoro=" + carnivoro +
                ", idAnimal=" + idAnimal +
                ", estado=" + estado +
                ", crias=" + crias +
                ", nombAnimal='" + nombAnimal + '\'' +
                ", sexoAnimal=" + sexoAnimal +
                '}';
    }
}
