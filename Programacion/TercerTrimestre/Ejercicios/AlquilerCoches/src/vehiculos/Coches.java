package vehiculos;

public class Coches extends Vehiculo {
    private double peso;

    public Coches(String matricula, double potencia, double velocidadMaxima, double peso) {
        super(matricula, potencia, velocidadMaxima);
        this.peso = peso;
    }

    @Override
    public int calcularVelocidadMaxima() {
        if (potencia <= 100) {
            return 150;
        } else if (potencia <= 180) {
            return 190;
        } else return 220;
    }
}
