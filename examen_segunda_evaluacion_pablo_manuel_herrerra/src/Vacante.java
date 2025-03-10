public class Vacante {
    private int id;
    char fechaIni, fechaFin;
    private String institutoVacante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(char fechaIni) {
        this.fechaIni = fechaIni;
    }

    public char getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(char fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getInstitutoVacante() {
        return institutoVacante;
    }

    public void setInstitutoVacante(String institutoVacante) {
        this.institutoVacante = institutoVacante;
    }

    public Vacante(int id, char fechaIni, char fechaFin, String institutoVacante) {
        this.id = id;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.institutoVacante = institutoVacante;
    }
}
