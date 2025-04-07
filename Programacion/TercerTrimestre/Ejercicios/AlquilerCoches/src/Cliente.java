import Enumerados.Categoria;

public class Cliente {
    private String dni, nombre;
    private Categoria categoria1;

    public Cliente(String dni, String nombre, Categoria categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria1 = categoria;
    }

    public int getVelocidadMaxima(){
        if(categoria1 == Categoria.NOVEL){
            return 100;
        } else if (categoria1 == Categoria.INTERMEDIO) {
            return 160;
        }else {
            return Integer.MAX_VALUE;
        }
    }
}
