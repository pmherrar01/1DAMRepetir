package vehiculos;

import Enumerados.Plazas;

public class Motos extends Vehiculo {
    private int cilindrada;
    private Plazas plaza;

    public Motos(String matricula, double potencia, double velocidadMaxima, int cilindrada, Plazas plazas) {
        super(matricula, potencia, velocidadMaxima);
        this.cilindrada = cilindrada;
        this.plaza = plazas;
    }

    @Override
    public int calcularVelocidadMaxima() {
        if (cilindrada <= 125) {
            return 100;
        } else if (cilindrada <= 250) {
            return 160;
        } else return 200;
    }
}
