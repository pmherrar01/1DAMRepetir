import objets.Funcionario;
import objets.Interino;
import objets.Profesor;

public class Personal {
    private Profesor[] profesores = new Profesor[10];
    private Vacante[] vacantes = new Vacante[4];
    private int profesoresCount = 0;
    private int vacantesCount = 0;

    public void registrarProfesor(Profesor profesor) {
        if (profesoresCount < profesores.length) {
            profesores[profesoresCount++] = profesor;
            System.out.println("objets.Profesor registrado: " + profesor.getInfo());
        } else {
            System.out.println("Error: No se pueden registrar más profesores.");
        }

        if(profesores[profesoresCount].getDni().equalsIgnoreCase(profesor.getDni())  && profesores[profesoresCount].getEspecialidad() != profesor.getEspecialidad()){

        }
    }

    public void registrarVacante(Vacante vacante) {
        if (vacantesCount < vacantes.length) {
            vacantes[vacantesCount++] = vacante;
            System.out.println("Vacante registrada en " + vacante.getInstituto());
        } else {
            System.out.println("Error: No se pueden registrar más vacantes.");
        }
    }

    public void listadoProfesores() {
        System.out.println("\nListado de Profesores:");
        for (int i = 0; i < profesoresCount; i++) {
            System.out.println(profesores[i].getInfo());
        }
    }

    public void listadoMeritos() {
        System.out.println("\nListado de Méritos:");
        for (int i = 0; i < profesoresCount; i++) {
            if (profesores[i] instanceof Funcionario) {
                Funcionario f = (Funcionario) profesores[i];
                double merito = (2025 - f.getAnioOposicion()) * 0.1;
                System.out.println("DNI: " + f.getDni() + ", Nombre: " + f.getNombre() + ", Mérito: " + merito);
            }
        }
    }

    public void asignarVacantes() {
        for (int i = 0; i < vacantesCount; i++) {
            Vacante v = vacantes[i];
            Interino mejorCandidato = null;

            for (int j = 0; j < profesoresCount; j++) {
                if (profesores[j] instanceof Interino) {
                    Interino interino = (Interino) profesores[j];
                    if (mejorCandidato == null || interino.getMesesExperiencia() > mejorCandidato.getMesesExperiencia()) {
                        mejorCandidato = interino;
                    }
                }
            }

            if (mejorCandidato != null) {
                mejorCandidato.setInstituto(v.getInstituto());
                System.out.println("Vacante en " + v.getInstituto() + " asignada a " + mejorCandidato.getNombre());
            } else {
                System.out.println("No hay interinos disponibles para la vacante en " + v.getInstituto());
            }
        }
    }
}
