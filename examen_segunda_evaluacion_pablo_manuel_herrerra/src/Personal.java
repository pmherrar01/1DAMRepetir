import java.util.Scanner;

public class Personal {
    private static final int MAX_PROFESORES = 10;
    private static final int MAX_VACANTES = 4;
    private static final Profesor[] vProfesores = new Profesor[MAX_PROFESORES];
    private static final Vacante[] vVacantes = new Vacante[MAX_VACANTES];
    private static final Scanner ENTRADA = new Scanner(System.in);
    private static int CONTPROFESORES = 0;
    private static int CONTVACANTES = 0;

    public static String pedirString(String mensaje) {
        String nombre;

        System.out.println(mensaje);
        nombre = ENTRADA.nextLine();

        return nombre;
    }

    public static int pedirNum(String mensaje) {
        int num;

        System.out.println(mensaje);
        num = ENTRADA.nextInt();

        return num;
    }

    public static char pedirCaracter(String mensaje) {
        char caracter;

        System.out.println(mensaje);
        caracter = (char) ENTRADA.nextByte();

        return caracter;
    }

    public static Profesor rellenarDatosProfesor() {
        String dni, nombre;
        Profesor profesor;
        Especialidad especialidad;

        dni = pedirString("Introduce el DNI del profesor");
        nombre = pedirString("Introduce el nombre del profesor");

        profesor = new Profesor(dni, nombre);

        return profesor;

    }

    public static Vacante rellenarDatosVacante() {
        Vacante vacante;
        int id;
        char fechaIni, fechaFin;
        String institutoVacante;

        id = CONTVACANTES;
        fechaIni = pedirCaracter("Introduce la fecha de inicio de la sustitucion");
        fechaFin = pedirCaracter("Introduce la fecha de fin de la sustitucion");
        institutoVacante = pedirString("Introduce el instituto del que se queda el puesto vacante");

        vacante = new Vacante(id, fechaIni, fechaFin, institutoVacante);

        return vacante;

    }

    public static void registrarProfesor() {
        Profesor profesor;

        profesor = rellenarDatosProfesor();

        vProfesores[CONTPROFESORES] = profesor;
        CONTPROFESORES++;

    }

    public static void registrarVacante() {
        Vacante vacante;

        vVacantes[CONTVACANTES] = rellenarDatosVacante();
    }

    public static void listadoProfesores() {
        int i;

        for (i = 0; i < vProfesores.length; i++) {
            vProfesores[i].mostrarInformacion();
        }
    }
}
