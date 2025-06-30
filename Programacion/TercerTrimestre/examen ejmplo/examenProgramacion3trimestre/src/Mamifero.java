public class Mamifero extends Animal{
    private double peso, altura;
    private boolean carnivoro;


    public Mamifero(int idAnimal, String nombreAnimal, Sexo sexo, int estado, double peso, double altura, boolean carnivoro) {
        super(idAnimal, nombreAnimal, sexo, estado);
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
                '}';
    }
}
