public class Main {
    public static void main(String[] args) {

        Usuario usu = null; //para no apuntar a ningun sitio

        if(usu == null){ // forma de uso de "null"
            usu = new Usuario(); //una variable que almacena un objeto de tipo objeto.
        }


        usu.setEdad(5);//asigana al atributo edad que esta privado aceder a el y escribir 5 en este caso


    }
}