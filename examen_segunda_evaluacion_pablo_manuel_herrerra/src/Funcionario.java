public class Funcionario extends Profesor {
    private int añoAprobo;

    public int getAñoAprobo() {
        return añoAprobo;
    }

    public void setAñoAprobo(int añoAprobo) {
        this.añoAprobo = añoAprobo;
    }

    public Funcionario(String dni, String nombre, int añoAprobo) {
        super(dni, nombre, );
        this.añoAprobo = añoAprobo;
    }

    public Funcionario() {
        this.añoAprobo = 0;
    }

    @Override
    public String toString() {
        return "ESP : " + añoAprobo;
    }
}
