package modelo;

public class Producto {

    private int id_producto;
    private String nombre;
    private double precio;

    //getters
    public int getId_producto() {
        return id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //setters

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //contructores

    public Producto(int id_producto, String nombre, double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
    }


    public Producto() {
        this.id_producto = 0;
        this.nombre = "";
        this.precio = 0;
    }
}
