package animales;

import java.util.Scanner;

public class Animal {

    final static Scanner ENTRADA = new Scanner(System.in);

    protected int idAnimal, estado, crias;
    protected String nombAnimal;
    protected Sexo sexoAnimal;

    public Animal(int idAnimal, int estado, String nombAnimal, Sexo sexoAnimal) {
        this.idAnimal = idAnimal;
        this.estado = estado;
        this.nombAnimal = nombAnimal;
        this.sexoAnimal = sexoAnimal;
        if (sexoAnimal == Sexo.H){
            int crias;
            System.out.println("Introduce el numero de crias: ");
            crias = ENTRADA.nextInt();
            ENTRADA.nextLine();
            this.crias = crias;
        }
    }

    public int getEstado() {
        return estado;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Sexo getSexoAnimal() {
        return sexoAnimal;
    }

    public String getNombAnimal() {
        return nombAnimal;
    }

    @Override
    public String toString() {
        return "animales.Animal{" +
                "sexoAnimal=" + sexoAnimal +
                ", nombAnimal='" + nombAnimal + '\'' +
                ", crias=" + crias +
                ", estado=" + estado +
                ", idAnimal=" + idAnimal +
                '}';
    }
}
