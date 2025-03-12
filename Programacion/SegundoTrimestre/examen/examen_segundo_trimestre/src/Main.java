import objets.Especialidad;
import objets.Funcionario;
import objets.Interino;
import objets.NivelIdiomas;

public class Main {

    public static void main(String[] args) {

        // INSTANCIAR LA CLASE DE GESTIÓN DE PERSONAL
        Personal Personal = new Personal();

        // REGISTRAR PROFESORES
        System.out.println("\nRegistro de 10 profesores:");
        Personal.registrarProfesor(new Interino("11810011-K", "Juan Pérez", Especialidad.INFORMATICA, 42, true));
        Personal.registrarProfesor(new Interino("22450296-L", "María García", Especialidad.SISTEMAS, 11,false));
        Personal.registrarProfesor(new Interino("30330333-M", "Carlos Rodríguez", Especialidad.FOL, 6,false));
        Personal.registrarProfesor(new Interino("44004404-N", "Laura Fernández", Especialidad.INFORMATICA, 64,true));
        Personal.registrarProfesor(new Interino("55225050-O", "Alejandro Martínez", Especialidad.SISTEMAS, 53,true));
        Personal.registrarProfesor(new Funcionario("11981711-A",  "Javier Ruiz", Especialidad.INFORMATICA, 2022, "IES Albarregas", NivelIdiomas.C1));
        Personal.registrarProfesor(new Funcionario("22296422-B", "Elena Sánchez", Especialidad.SISTEMAS, 2023,"IES Castelar", NivelIdiomas.B2));
        Personal.registrarProfesor(new Funcionario("24536633-C", "Andrés Castro", Especialidad.FOL, 2022,"IES Agoras", NivelIdiomas.B1));
        Personal.registrarProfesor(new Funcionario("44989944-D", "Beatriz Navarro", Especialidad.INFORMATICA, 2023,"IES Agoras", NivelIdiomas.B1));
        Personal.registrarProfesor(new Funcionario("55587320-E",  "David Jiménez", Especialidad.SISTEMAS, 2022,"IES Agoras", NivelIdiomas.B2));

        System.out.println("\nRegistro de profesor con doble especialidad:");
        Personal.registrarProfesor(new Interino("11810011-K", "Juan Pérez", Especialidad.SISTEMAS, 12, false));

        System.out.println("\nIntento de registro de profesores repetido:");
        Personal.registrarProfesor(new Interino("44004404-N", "Laura Fernández", Especialidad.INFORMATICA, 12,false));
        Personal.registrarProfesor(new Funcionario("24536633-C", "Andrés Castro", Especialidad.FOL, 2022,"IES Castelar", null));


        // REGISTRAR VACANTES
        System.out.println("\nRegistro de 4 vacantes:");
        Personal.registrarVacante(new Vacante("IES Albarregas", Especialidad.INFORMATICA, "01/09/2023"));
        Personal.registrarVacante(new Vacante("IES Ágoras", Especialidad.SISTEMAS, "04/12/2023", "22/03/2024"));
        Personal.registrarVacante(new Vacante("IES Castelar", Especialidad.FOL, "08/01/2024"));
        Personal.registrarVacante(new Vacante("IES Albarregas", Especialidad.INFORMATICA, "01/09/2023", "20/12/2023"));
        System.out.println("\nIntento de registro de vacante repetida:");
        Personal.registrarVacante(new Vacante("IES Castelar", Especialidad.FOL, "08/01/2024"));

        // LISTADO DE PROFESORES
        Personal.listadoProfesores();

        // LLAMAMIENTO DE INTERINOS
        //Personal.llamamientoInterinos();

        // ASIGNAR VACANTES
        Personal.asignarVacantes();

        // LLAMAMIENTO DE INTERINOS
        //Personal.llamamientoInterinos();

        // REPETIMOS LISTADO DE PROFESORES
        Personal.listadoProfesores();

        // lISTADO  DE MÉRITOS
        Personal.listadoMeritos();

    }
}
