package modelo;

public class Cliente {

    private int id_cliente;
    private String nombre;
    private String correo;

    //getters
    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    //setters

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //contructores

    public Cliente(int id_cliente, String nombre, String correo) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Cliente() {
        this.id_cliente = 0;
        this.nombre = "";
        this.correo = "";
    }
}
