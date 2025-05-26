import java.util.Map;

public class Carta {
    private Figura figura;
    private Palo palo;
    private int valorCarta;

    public Carta(Figura figura, Palo palo) {
        this.figura = figura;
        this.palo = palo;
    }

    public void setValorCarta(Map<Figura, Integer> mCartas) {
        this.valorCarta = mCartas.getOrDefault(this.figura, 0);
    }

    public int getValorCarta() {
        return valorCarta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "figura=" + figura +
                ", palo=" + palo ;
    }
}
