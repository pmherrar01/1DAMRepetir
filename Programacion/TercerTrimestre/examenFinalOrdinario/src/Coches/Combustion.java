package Coches;

public class Combustion extends  Coche{
    protected TipoMotor tipoMotor;
    protected int colindrada;

    public Combustion(String marca, String modelo, int ptencia, DistintivoAmbiental distintivoAmbiental, double precio, TipoMotor tipoMotor, int colindrada) {
        super(marca, modelo, ptencia, distintivoAmbiental, precio);
        this.tipoMotor = tipoMotor;
        this.colindrada = colindrada;
    }
}
