import java.time.LocalDate;

public class Factura {
    private int idFactura, iva;
    private double importe;
    private Cliente cliente;
    private LocalDate fechaEmision, fechaVencimineto;

    public Factura(int idFactura, int iva, double importe, Cliente cliente, LocalDate fechaEmision, LocalDate fechaVencimineto) {
        this.idFactura = idFactura;
        this.iva = iva;
        this.importe = importe;
        this.cliente = cliente;
        this.fechaEmision = fechaEmision;
        this.fechaVencimineto = fechaVencimineto;
    }

    public Factura() {
        this.idFactura = 0;
        this.iva = 21;
        this.importe = 0;
        this.cliente = null;
        this.fechaEmision = LocalDate.now();
        this.fechaVencimineto = this.fechaEmision.plusDays(30);
    }

}
