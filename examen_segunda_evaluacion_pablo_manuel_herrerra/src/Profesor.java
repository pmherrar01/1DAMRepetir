public class Profesor {
    private String dni, nombre, institutoDestinado;

    //getters
    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }



    public String getInstitutoDestinado() {
        return institutoDestinado;
    }

    //setters
    public void setDNI(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setInstitutoDestinado(String institutoDestinado) {
        this.institutoDestinado = institutoDestinado;
    }

    //contructores
    public Profesor(String dni, String nombre, int experiencia, String institutoDestinado ) {
        this.dni = dni;
        this.nombre = nombre;
        this.institutoDestinado = institutoDestinado;
    }



    public Profesor() {
        this.dni = "";
        this.nombre = "";
    }


    public void mostrarInformacion(){
        Funcionario funcionario = null;
        Interino interino = null;

        if(this.dni.equalsIgnoreCase(funcionario.getDNI())){
                System.out.println(this.dni + "\n" + this.nombre + "\n" + funcionario.toString());
        }

        if(this.dni.equalsIgnoreCase(interino.getDNI())){
            if(!this.institutoDestinado.equalsIgnoreCase(" ")){
                System.out.println(this.dni + "\n" + this.nombre + "\n" + "\n" + interino.toString() + "SIN DESTINO");
            }else{
                System.out.println(this.dni + "\n" + this.nombre + "\n" + "\n" + interino.toString() + this.institutoDestinado);
            }

        }

    }
}
