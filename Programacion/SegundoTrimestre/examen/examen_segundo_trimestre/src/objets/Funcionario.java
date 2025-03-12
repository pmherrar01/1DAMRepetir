package objets;

public class Funcionario extends Profesor {
    private int anioOposicion;
    private NivelIdiomas nivelIdiomas;

    public Funcionario(String dni, String nombre, Especialidad especialidad, int anioOposicion, String instituto, NivelIdiomas nivelIdiomas) {
        super(dni, nombre, especialidad, instituto);
        this.anioOposicion = anioOposicion;
        this.nivelIdiomas = nivelIdiomas;
    }


    public int getAnioOposicion() {
        return anioOposicion;
    }

    public NivelIdiomas getNivelIdiomas() {
        return nivelIdiomas;
    }

    @Override
    public String getInfo() {
        return "objets.Funcionario - " + super.getInfo() + ", Año oposición: " + anioOposicion + ", Nivel Idiomas: " + nivelIdiomas;
    }
}
