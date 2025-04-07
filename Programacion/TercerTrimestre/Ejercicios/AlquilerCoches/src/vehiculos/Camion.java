package vehiculos;

public class Camion extends Vehiculo {
    private String tipoRemolque;

    public Camion(String matricula, double potencia, double velocidadMaxima, String tipoRemolque) {
        super(matricula, potencia, velocidadMaxima);
        this.tipoRemolque = tipoRemolque;
    }

    @Override

    public int calcularVelocidadMaxima() {
        if (tipoRemolque.equalsIgnoreCase("pesado")) {
            return 70;
        } else if (potencia <= 200) {
            return 80;
        } else return 90;
    }
}
