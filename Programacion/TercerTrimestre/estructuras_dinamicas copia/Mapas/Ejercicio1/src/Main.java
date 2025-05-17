//Ejercicio 1 - Control de acceso
//Implementa el control de acceso al área restringida de un programa.
// Se debe pedir un nombre de usuario y una contraseña.
// Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”.
// El usuario tendrá un máximo de 3 oportunidades.
// Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”.
// Los nombres de usuario con sus correspondientes
// contraseñas deben estar almacenados en una estructura de la clase HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    final static Scanner ENTRADA = new Scanner(System.in);

    public static String pedirString(String mensaje){

        System.out.println(mensaje);
        return ENTRADA.nextLine();

    }

    public static void controlAcceso(Map<String, String> mUsuarios){
        int cont = 3;
        String nombre, contraseña;
        boolean acceso = false;

        System.out.println("Tienes: " + cont + " oportunidades");
        do {
            if(!mUsuarios.isEmpty()){

                nombre = pedirString("Nombre");
                contraseña = pedirString("Contraseña:");
                if (mUsuarios.containsValue(nombre) && mUsuarios.containsKey(contraseña) ){
                    System.out.println("Aceso aceptado");
                    acceso =true;
                }else {
                    cont --;
                    System.out.println("Acceso denegado te quedan: " + cont + " oportunidades");
                }
            }

        }while (cont !=0 && !acceso);


    }



    public static void main(String[] args) {
    Map<String, String> mUsuarios = new HashMap<>();

    mUsuarios.put("aei0u", "Pablo");
    mUsuarios.put("u0iea", "Manuel");
    mUsuarios.put("12345", "Juan");
    controlAcceso(mUsuarios);
    }
}