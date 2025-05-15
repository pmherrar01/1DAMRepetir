public class Profesor {
    private static int contador = 1;
    private int id;
    private String nombre;
    private Categoria categoria;

    public Profesor(String nombre, Categoria categoria) {
        this.id = contador++;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Profesor {id=" + id + ", nombre='" + nombre + "', categoria=" + categoria + "}";
    }

}
