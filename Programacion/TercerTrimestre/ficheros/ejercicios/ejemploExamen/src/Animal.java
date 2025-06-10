public class Animal {
    private int idAnimal;
    private String nombre;
    private  Sexo sexo;
    private int estado;
    private int crias;

    private static int contador = 0;

    public Animal( String nombre, Sexo sexo, int estado, int crias) {
        idAnimal = contador;

        contador++;

        this.idAnimal = contador;
        this.nombre = nombre;
        this.sexo = sexo;
        this.estado = estado;
        if (this.sexo ==  Sexo.H){
            this.crias = 0;
        }else{
            this.crias = crias;
        }
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
}
