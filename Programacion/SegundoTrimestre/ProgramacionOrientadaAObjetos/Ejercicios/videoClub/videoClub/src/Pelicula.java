public class Pelicula {
    private int idPelicula, calificacion;
    private String nombrePelicula, nombreDirector, categoria;
    private boolean disponible;

    public int getIdPelicula() {
        return idPelicula;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Pelicula(int idPelicula, int calificacion, String nombrePelicula, String nombreDirector, String categoria, boolean disponible) {
        this.idPelicula = idPelicula;
        this.calificacion = calificacion;
        this.nombrePelicula = nombrePelicula;
        this.nombreDirector = nombreDirector;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Pelicula(int idPelicula, String nombrePelicula, String nombreDirector, String categoria, boolean disponible) {
        this(idPelicula, 16, nombrePelicula, nombreDirector, categoria, disponible);
    }

    public boolean aptaParaTodoPublico(){
        return this.calificacion < 7;
    }

    public boolean alquilar(){
        if(this.disponible){
            this.disponible = false;
            return true;
        }

        return false;
    }

    public boolean devolver(){
        if(!this.disponible){
            this.disponible = true;
            return true;
        }
        return false;
    }
}
