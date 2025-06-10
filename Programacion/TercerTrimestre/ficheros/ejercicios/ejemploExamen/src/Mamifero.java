public class Mamifero extends Animal{
    private double peso;
    private double altura;
    private boolean carnivoro;

    public Mamifero(String nombre, Sexo sexo, int estado, int crias, double peso, double altura, boolean carnivoro) {
        super(nombre, sexo, estado, crias);
        this.peso = peso;
        this.altura = altura;
        this.carnivoro = carnivoro;
    }

    @Override
    public int getIdAnimal() {
        return super.getIdAnimal();
    }
}
