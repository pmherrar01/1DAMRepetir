import java.util.Scanner;

public class Rectangulo {
    private double ancho, altura;


    //contructor
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    //setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //getters
    public double getAltura() {
        return altura;
    }

    public double getAncho() {
        return ancho;
    }

    //metodo para pedir las medidas
    public static double pedirDatos(String mensaje){
        Scanner entrada = new Scanner(System.in);
        double medida;
        boolean error;

        error = true;

        do{
            System.out.println(mensaje);
            medida = entrada.nextDouble();
            if(medida < 5 || medida > 10){
                System.out.println("Error la medida tiene que estar entre 5 y 10");
            }
        }while(medida < 5 || medida > 10);

        return medida;

    }

    public double calcularArea(){

        return ancho * altura;
    }
}
