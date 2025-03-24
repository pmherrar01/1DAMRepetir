import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Clase Cliente
class Cliente {
    private String id;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(String id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}