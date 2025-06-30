import java.util.Scanner;

public class Animal {
    private int idAnimal = 0;
    private String nombreAnimal;
    private Sexo sexo;
    private int estado;
    private int crias;



    public Animal(int idAnimal, String nombreAnimal, Sexo sexo, int estado) {
        Scanner entrada = new Scanner(System.in);
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.sexo = sexo;
        this.estado = estado;
        if (this.sexo == Sexo.H){
            System.out.println("introduce el numero de crias");
            int crias = entrada.nextInt();
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


    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", nombreAnimal='" + nombreAnimal + '\'' +
                ", sexo=" + sexo +
                ", estado=" + estado +
                ", crias=" + crias +
                '}';
    }
}
