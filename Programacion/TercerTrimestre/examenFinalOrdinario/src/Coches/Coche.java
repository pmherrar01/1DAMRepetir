package Coches;

public class Coche {
    protected String marca, modelo;
    protected int ptencia;
    protected DistintivoAmbiental distintivoAmbiental;
    protected double precio;
    protected String matricula;


    public Coche(String marca, String modelo, int ptencia, DistintivoAmbiental distintivoAmbiental, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ptencia = ptencia;
        this.distintivoAmbiental = distintivoAmbiental;
        this.precio = precio;
    }
}
