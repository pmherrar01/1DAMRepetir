public class Usuario {

    private String nombre;
    private int edad;
    private String dni;
    private TarjetaCredito[]tj;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //contructor
    public Usuario(int edad) {
        this.edad = edad;
    }
}
