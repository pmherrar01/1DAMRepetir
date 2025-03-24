import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

class SistemaFacturacion {
    private ArrayList<Factura> facturas;

    public SistemaFacturacion() {
        this.facturas = new ArrayList<>();
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    // 1. Total facturado en un mes determinado
    public double getTotalFacturadoMes(int year, int month) {
        double total = 0;
        for (Factura f : facturas) {
            if (f.getFechaEmision().getYear() == year &&
                    f.getFechaEmision().getMonthValue() == month) {
                total += f.getImporteTotal();
            }
        }
        return total;
    }

    // 2. Total facturado en una quincena específica
    public double getTotalFacturadoQuincena(int year, int month, boolean primeraQuincena) {
        double total = 0;
        int diaInicio = primeraQuincena ? 1 : 16;
        int diaFin = primeraQuincena ? 15 : 31;

        for (Factura f : facturas) {
            LocalDate fecha = f.getFechaEmision();
            if (fecha.getYear() == year &&
                    fecha.getMonthValue() == month &&
                    fecha.getDayOfMonth() >= diaInicio &&
                    fecha.getDayOfMonth() <= diaFin) {
                total += f.getImporteTotal();
            }
        }
        return total;
    }

    // 3. Buscar factura por ID
    public Factura buscarFactura(String id) {
        for (Factura f : facturas) {
            if (f.getId().equals(id)) {
                return f;
            }
        }
        return null;
    }

    // 4. Listado de facturas vencidas
    public List<Factura> getFacturasVencidas() {
        ArrayList<Factura> vencidas = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        for (Factura f : facturas) {
            if (f.getFechaVencimiento().isBefore(hoy)) {
                vencidas.add(f);
            }
        }
        return vencidas;
    }

    // 5. Modificar fecha de vencimiento
    public void modificarFechaVencimiento(String idFactura, int dias) {
        Factura factura = buscarFactura(idFactura);
        if (factura != null) {
            LocalDate nuevaFecha = factura.getFechaVencimiento().plusDays(dias);
            factura.setFechaVencimiento(nuevaFecha);
        }
    }

    // 6. Total facturado por cliente
    public double getTotalPorCliente(String idCliente) {
        double total = 0;
        for (Factura f : facturas) {
            if (f.getCliente().getId().equals(idCliente)) {
                total += f.getImporteTotal();
            }
        }
        return total;
    }
}