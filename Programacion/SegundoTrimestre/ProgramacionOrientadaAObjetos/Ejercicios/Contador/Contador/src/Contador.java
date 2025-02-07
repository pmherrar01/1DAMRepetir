public class Contador {

    //ATRIBUTOS
    private int valor;
    private String nombre;

    //METODOS
    //CONSTRUCTORES

    public Contador(int valor) {
        this.valor = valor;
    }


    //GETTER // SETTER


    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public void Incrementar(){
        if ( valor <100)
            valor++;
    }

    public void Decrementar(){
        if ( valor > 0)
            valor--;
    }


    public void MostrarValor() {
        System.out.println("!!!! El valor de "  + nombre + " es " + valor);
    }
}