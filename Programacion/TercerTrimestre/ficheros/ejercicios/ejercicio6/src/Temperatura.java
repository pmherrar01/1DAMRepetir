import java.time.LocalDate;


public class Temperatura {
    private LocalDate fecha;
    private double temperaturaMaxima, temperaturaMinima;

    public Temperatura(LocalDate fecha, double temperaturaMaxima, double temperaturaMinima) {
        this.fecha = fecha;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    @Override
    public String toString() {
        return fecha + "\t" + temperaturaMaxima + "\t" + temperaturaMinima;
    }

}
