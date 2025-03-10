public class Interino extends Profesor {
    private int mesesExperienciaa;
    private boolean duracion;



    //getters
    public int getMesesExperienciaa() {
        return mesesExperienciaa;
    }

    public boolean isDuracion() {
        return duracion;
    }
    //setters
    public void setMesesExperienciaa(int mesesExperienciaa) {
        this.mesesExperienciaa = mesesExperienciaa;
    }

    public void setDuracion(boolean duracion) {
        this.duracion = duracion;
    }

    //contructor

    public Interino() {
        this.mesesExperienciaa = 0;
        this.duracion = true;
    }

    public Interino(String dni, String nombre, int mesesExperienciaa, boolean duracion) {
        super(dni, nombre);
        this.mesesExperienciaa = mesesExperienciaa;
        this.duracion = duracion;
    }



    @Override
    public String toString() {
        return "mesesExperienciaa=" + mesesExperienciaa;
    }
}
