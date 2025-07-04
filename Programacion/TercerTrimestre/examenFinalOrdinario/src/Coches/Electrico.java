package Coches;

public class Electrico extends  Coche{
    protected int autonomia, tiempoDeCarga;

    public Electrico(String marca, String modelo, int ptencia, DistintivoAmbiental distintivoAmbiental, double precio, int autonomia, int tiempoDeCarga) {
        super(marca, modelo, ptencia, distintivoAmbiental, precio);
        this.autonomia = autonomia;
        this.tiempoDeCarga = tiempoDeCarga;
    }
}
