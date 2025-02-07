package calculadora;

import java.util.Scanner;

public class Calculadora {
    private int resultado;
    //getter
    public int getResultado() {
        return resultado;
    }
    //setter
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    //contructores
    public Calculadora() {
        this.resultado = 0;
    }

    public Calculadora(int resultado) {
        this.resultado = resultado;
    }

    public int suma(int num){
       return this.resultado += num;
    }

    public int resta(int num){
        return this.resultado -= num;
    }

    public int multiplicacion(int num){
        return this.resultado * num;
    }

    public int division(int num){
        return this.resultado / num;
    }

    public int factorial(int num){
        int factorial, i;

        factorial = 1;

        for (i = num; num < 1; i--) {
            factorial = factorial * i;
        }
        this.resultado = factorial;
        return this.resultado;
    }

}
