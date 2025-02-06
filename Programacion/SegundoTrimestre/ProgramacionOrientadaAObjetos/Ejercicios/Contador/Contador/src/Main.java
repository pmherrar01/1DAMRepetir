//Desarrolla tu propia clase contador. Que tendrá las siguientes propiedades:
//
//Nombre: Será el nombre del contador.
//Tu contador debe soportar las siguientes operaciones:
//
//Incrementar. (En 1)
//Decrementar. (En 1)
//toString : Debe mostrar nombre y el valor del contador.
//Además, considera que se deben cumplir las siguientes restricciones:
//El valor mínimo es 0.
//El valor máximo es 100.
//Una vez lo hallas creado, crea un programa y crea varias instancias del contador. Prueba a incrementar unas y otras y mostrar los valores que tienen.
public class Main {
    public static void main(String[] args) {

        Contador[] vC = new Contador[50];
        for (int i=0; i< 50;i++)
        {
            vC[i] = new Contador(0);
        }
    }
}