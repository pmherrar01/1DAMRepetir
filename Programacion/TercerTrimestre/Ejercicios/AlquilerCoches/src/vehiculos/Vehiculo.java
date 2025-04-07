package vehiculos;

public abstract class Vehiculo {
    protected String matricula;
    protected double potencia, velocidadMaxima;

    public Vehiculo(String matricula, double potencia, double velocidadMaxima) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract int calcularVelocidadMaxima();
}
