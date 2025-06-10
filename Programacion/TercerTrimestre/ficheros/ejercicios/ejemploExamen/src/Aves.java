public class Aves extends  Animal{
    private String colorPlumaje;
    private  Double lpngitudPico;

    public Aves(String nombre, Sexo sexo, int estado, int crias, String colorPlumaje, Double lpngitudPico) {
        super(nombre, sexo, estado, crias);
        this.colorPlumaje = colorPlumaje;
        this.lpngitudPico = lpngitudPico;
    }
}
