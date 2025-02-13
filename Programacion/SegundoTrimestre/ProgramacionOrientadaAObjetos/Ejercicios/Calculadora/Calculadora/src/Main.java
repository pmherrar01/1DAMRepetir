//1. Crea un proyecto llamado calculadora
//
//2. Crea el paquete calculadora
//
//3. Crea una clase calculadora que tenga:
//
//Atributos:
//
//resultado (int): será el acumulador actual de la calculadora.
//Constructores
//Tendrá un constructor sin parámetros que inicializará resultado a 0.
//Tendrá un constructor que inicializará resultado a un entero que recibirá como parámetro.
//Getters/Setters
//Tendrá un método para obtener el resultado actual.
//Métodos:
//sumar(int n): suma el número indicado al resultado.
//restar(int n): resta el número indicado al resultado.
//multiplicar(int n): multiplica resultado por el número indicado.
//dividir(int n): divide el resultado por el número indicado.
//factorial(): Calcula el factorial del resultado actual.
//inicializar(): pone resultado a 0.
//4. Crea ahora una clase Main
//Esta clase en el método main recibirá un comando por línea de la entrada estándar.
//Los comandos que puede recibir son:
//+ : sumar
//- : restar
//* : multiplicar

/// : dividir
//f : calcula el factorial del resultado actual.
//CE : Inicializa la calculadora a 0
//FIN : finaliza el programa.
//Después de cada operación debe recibir un número que se utilizará como operando.
//Después de ejecutar cada operación debe mostrar el resultado.

import calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    public static int pedirValor(String mensaje){
        int valorIni;
        Scanner entrada =  new Scanner(System.in);

        System.out.println(mensaje);
        return valorIni = entrada.nextInt();

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calculadora calculadora = new Calculadora(pedirValor("Dime el valor con el que queremos empezar a operar"));

        String operacion;

        do{
            System.out.println("-------MENU-------");
            System.out.println("'+'   Suma");
            System.out.println("'-'   Resta");
            System.out.println("'*'   Multiplicar");
            System.out.println("'/'   Dividir");
            System.out.println("'f'   Calcular Factorial");
            System.out.println("'CE'  Inicializa la calculadora a 0");
            System.out.println("'FIN' Salir");
            System.out.println("Dime que operacion quieres realizar");
            operacion = entrada.nextLine();

            switch (operacion){
                case "+":
                    calculadora.suma(pedirValor("Dime el valor con el cual vamos a sumar al resultado"));
                    System.out.println(calculadora.getResultado());
                    break;
                case "-":
                    calculadora.resta(pedirValor("Dime el valor con elm cual vamos a restar al resultado"));
                    System.out.println(calculadora.getResultado());
                    break;
                case "*":
                    calculadora.multiplicacion(pedirValor("Introduce el valor por el que vamos a multiplicar el resultado"));
                    System.out.println(calculadora.getResultado());
                    break;
                case "/":
                    calculadora.division(pedirValor("Introduce el valor por el que vamos a dividir el resultado"));
                    System.out.println(calculadora.getResultado());
                    break;
                case "f":
                    calculadora.factorial(pedirValor("Dime el valor que quieres calcular el factorial"));
                    System.out.println(calculadora.getResultado());
                    break;
                case "CE":
                    calculadora.setResultado(0);
                    break;
                default:
                    System.out.println("Saliendo...");

            }

        }while (!operacion.equalsIgnoreCase("FIN"));

    }
}