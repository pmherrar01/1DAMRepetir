public class Cliente {

    private int id, numeroTelefono;
    private String nombreCliente, correoCliente;

    public Cliente(int id, int numeroTelefono, String nombreCliente, String correoCliente) {
        this.id = id;
        this.numeroTelefono = numeroTelefono;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
    }

    public Cliente() {
        this.id = 0;
        this.numeroTelefono = 0;
        this.nombreCliente = "";
        this.correoCliente = "";
    }
}
