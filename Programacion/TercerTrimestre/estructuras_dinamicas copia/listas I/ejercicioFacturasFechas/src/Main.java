    //El objetivo de esta práctica es reforzar los conceptos de programación orientada a
    //objetos, aplicando la manipulación de fechas en Java.
    //Contexto
    //Una empresa maneja facturas que contienen la siguiente información:
    //● Un identificador único.
    //● Un importe total.
    //● Un IVA aplicado.
    //● Un cliente asociado.
    //● Una fecha de emisión.
    //● Una fecha de vencimiento.
    //Cada cliente tiene la siguiente información:
    //● Un identificador único.
    //● Un nombre.
    //● Un correo electrónico.
    //● Un número de teléfono.
    //La empresa desea implementar un sistema que permita:
    //1. Obtener el total facturado en un mes determinado.
    //2. Obtener el total facturado en una quincena específica.
    //3. Buscar una factura por su identificador único.
    //4. Listado de facturas ya vencidas.
    //5. Modificar la fecha de vencimiento de una factura agregando un número determinado
    //de días.
    //6. Obtener el importe total de todas las facturas de un cliente específico.


public class Main {
    public static void main(String[] args) {
        SistemaFacturacion sistema = new SistemaFacturacion();

        // Crear algunos clientes
        Cliente c1 = new Cliente("C1", "Juan Perez", "juan@email.com", "123456789");
        Cliente c2 = new Cliente("C2", "Maria Lopez", "maria@email.com", "987654321");

        // Crear algunas facturas
        Factura f1 = new Factura("F1", 1000.0, 0.21, c1,
                LocalDateTime.now(), LocalDate.now().plusDays(30));
        Factura f2 = new Factura("F2", 500.0, 0.21, c2,
                LocalDateTime.now().minusDays(60), LocalDate.now().minusDays(30));

        // Agregar facturas al sistema
        sistema.agregarFactura(f1);
        sistema.agregarFactura(f2);

        // Ejemplo de uso de las funcionalidades
        System.out.println("Total facturado este mes: " +
                sistema.totalFacturadoMes(2025, 3));
        System.out.println("Total primera quincena: " +
                sistema.totalFacturadoQuincena(2025, 3, true));

        Factura buscada = sistema.buscarFactura("F1");
        if (buscada != null) {
            System.out.println("Factura encontrada: " + buscada.getImporteTotal());
        }

        System.out.println("Facturas vencidas: " + sistema.facturasVencidas().size());
        sistema.modificarVencimiento("F1", 15);
        System.out.println("Total cliente C1: " + sistema.totalPorCliente("C1"));
    }
}