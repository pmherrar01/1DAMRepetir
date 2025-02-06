//Crea una clase que represente un rectángulo.
//
//La clase tendrá las propiedades ancho y alto.
//Permitirá calcular el área con un método.
//El método toString devolverá una cadena con el rectángulo relleno con el ancho y el alto.
//Ancho y alto pueden valer entre 5 y 10.

public class Main {
    public static void main(String[] args) {
        double ancho, altura;

        ancho = Rectangulo.pedirDatos("Introduce el ancho que tiene el recgtangulo");
        altura = Rectangulo.pedirDatos("Dime la altura que tiene el REctangulo");

        Rectangulo rectangulo = new Rectangulo(ancho, altura);

        System.out.println("El area del rectangullo es: " + rectangulo.calcularArea());
    }
}