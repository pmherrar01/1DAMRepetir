public class Mamifero extends Animal{
    private double peso, altura;
    private boolean carnivoro;


    public Mamifero( String nombreAnimal, Sexo sexo, int estado, double peso, double altura, boolean carnivoro) {
        super( nombreAnimal, sexo, estado);
        this.peso = peso;
        this.altura = altura;
        this.carnivoro = carnivoro;
    }
}
