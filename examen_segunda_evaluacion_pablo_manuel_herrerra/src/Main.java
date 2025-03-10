public class Main {

    public static void main(String[] args) {

        // INSTANCIAR LA CLASE DE GESTIÓN DE PERSONAL
        Personal Personal = new Personal();

        // REGISTRAR PROFESORES
        System.out.println("\nRegistro de 10 profesores:");
        Personal.registrarProfesor(new Interino("11810011-K", "Juan Pérez", 42, true));
        Personal.registrarProfesor(new Interino("22450296-L", "María García", 11,false));
        Personal.registrarProfesor(new Interino("30330333-M", "Carlos Rodríguez", 6,false));
        Personal.registrarProfesor(new Interino("44004404-N", "Laura Fernández", 64,true));
        Personal.registrarProfesor(new Interino("55225050-O", "Alejandro Martínez",  53,true));
        Personal.registrarProfesor(new Funcionario("11981711-A",  "Javier Ruiz",  2022, "IES Albarregas", NivelIdiomas.C1));
        Personal.registrarProfesor(new Funcionario("22296422-B", "Elena Sánchez",  2023,"IES Castelar", NivelIdiomas.B2));
        Personal.registrarProfesor(new Funcionario("24536633-C", "Andrés Castro",  2022,"IES Agoras", NivelIdiomas.B1));
        Personal.registrarProfesor(new Funcionario("44989944-D", "Beatriz Navarro",  2023,"IES Agoras", NivelIdiomas.B1));
        Personal.registrarProfesor(new Funcionario("55587320-E",  "David Jiménez",  2022,"IES Agoras", NivelIdiomas.B2));

        System.out.println("\nRegistro de profesor con doble especialidad:");
        Personal.registrarProfesor(new Interino("11810011-K", "Juan Pérez",  12, false));

        System.out.println("\nIntento de registro de profesores repetido:");
        Personal.registrarProfesor(new Interino("44004404-N", "Laura Fernández", 12,false));
        Personal.registrarProfesor(new Funcionario("24536633-C", "Andrés Castro", 2022,"IES Castelar", null));


        // REGISTRAR VACANTES
        System.out.println("\nRegistro de 4 vacantes:");
        Personal.registrarVacante(new Vacante("IES Albarregas", "01/09/2023"));
        Personal.registrarVacante(new Vacante("IES Ágoras",  "04/12/2023", "22/03/2024"));
        Personal.registrarVacante(new Vacante("IES Castelar", "08/01/2024"));
        Personal.registrarVacante(new Vacante("IES Albarregas", "01/09/2023", "20/12/2023"));
        System.out.println("\nIntento de registro de vacante repetida:");
        Personal.registrarVacante(new Vacante("IES Castelar", "08/01/2024"));

        // LISTADO DE PROFESORES
        Personal.listadoProfesores();

        // LLAMAMIENTO DE INTERINOS
        Personal.llamamientoInterinos();

        // ASIGNAR VACANTES
        Personal.asignarVacantes();

        // LLAMAMIENTO DE INTERINOS
        Personal.llamamientoInterinos();

        // REPETIMOS LISTADO DE PROFESORES
        Personal.listadoProfesores();

        // lISTADO  DE MÉRITOS
        Personal.listadoMeritos();

    }
}
