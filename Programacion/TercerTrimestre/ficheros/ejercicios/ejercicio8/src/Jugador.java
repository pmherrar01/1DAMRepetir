public class Jugador {
    private int idJugador, edad, numCamiseta, numGoles;
    private String nombre;
    private Posicion posicion;
    private double salario;

    public Jugador(int id, String nombre, int edad, int numeroCamiseta, int numeroGoles, double salario, Posicion posicion) {
        this.idJugador = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numCamiseta = numeroCamiseta;
        this.numGoles = numeroGoles;
        this.salario = salario;
        this.posicion = posicion;
    }


    public Jugador(int id, String nombre, int edad, int numeroCamiseta, int numeroGoles) {
        this.idJugador = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numCamiseta = numeroCamiseta;
        this.numGoles = numeroGoles;
        this.salario = 1000;
        this.posicion = Posicion.DELANTERO;
    }

    public Jugador(int id, String nombre, int edad, int numeroCamiseta) {
        this.idJugador = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numCamiseta = numeroCamiseta;
        this.numGoles = 0;
        this.salario = 1000;
        this.posicion = Posicion.DELANTERO;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumGoles() {
        return numGoles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", nombre='" + nombre + '\'' +
                ", numGoles=" + numGoles +
                ", numCamiseta=" + numCamiseta +
                '}';
    }
}
