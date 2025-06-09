import java.time.LocalDate;

public class Temperatura {
    private LocalDate fecha;
    private int temperaturaMaxima, temperaturaMinima;

    public Temperatura(LocalDate fecha, int temperaturaMaxima, int temperaturaMinima) {
        this.fecha = fecha;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    @Override
    public String toString() {
        return fecha + "\t" + temperaturaMaxima + "\t" + temperaturaMinima;
    }
}
