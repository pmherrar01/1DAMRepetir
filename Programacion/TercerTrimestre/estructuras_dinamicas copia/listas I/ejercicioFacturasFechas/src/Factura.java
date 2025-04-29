import java.time.LocalDate;

class Factura {
    private String id;
    private double importeTotal;
    private double iva;
    private Cliente cliente;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;

    public Factura(String id, double importeTotal, double iva, Cliente cliente,
                   LocalDate fechaEmision, LocalDate fechaVencimiento) {
        this.id = id;
        this.importeTotal = importeTotal;
        this.iva = iva;
        this.cliente = cliente;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getId() {
        return id;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}