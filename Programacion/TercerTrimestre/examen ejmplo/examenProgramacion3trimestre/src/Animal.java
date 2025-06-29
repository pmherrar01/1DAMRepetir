import java.util.Scanner;

public class Animal {
    private int idAnimal = 0;
    private String nombreAnimal;
    private Sexo sexo;
    private int estado;
    private int crias;



    public Animal(String nombreAnimal, Sexo sexo, int estado) {
        Scanner entrada = new Scanner(System.in);
        idAnimal = 0;
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.sexo = sexo;
        this.estado = estado;
        if (this.sexo == Sexo.H){
            System.out.println("introduce el numero de crias");
            int crias = entrada.nextInt();
            this.crias = crias;
        }

        idAnimal ++;
    }
}
