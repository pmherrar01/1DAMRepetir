public class Producto {
    private int códigoDeProducto, stock;
    private String nombre, categoria;
    private double precio;

    public Producto(int códigoDeProducto, int stock, String nombre, double precio, String categoria) {
        this.códigoDeProducto = códigoDeProducto;
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
}
