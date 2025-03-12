package objets;

public class Interino extends Profesor {
    private int mesesExperiencia;
    private boolean aceptaCualquierDuracion;

    public Interino(String dni, String nombre, Especialidad especialidad, int mesesExperiencia, boolean aceptaCualquierDuracion) {
        super(dni, nombre, especialidad, "SIN DESTINO");
        this.mesesExperiencia = mesesExperiencia;
        this.aceptaCualquierDuracion = aceptaCualquierDuracion;
    }


    public int getMesesExperiencia() {
        return mesesExperiencia;
    }

    public boolean aceptaCualquierDuracion() {
        return aceptaCualquierDuracion;
    }

    @Override
    public String getInfo() {
        return "objets.Interino - " + super.getInfo() + ", Experiencia: " + mesesExperiencia + " meses";
    }

}
