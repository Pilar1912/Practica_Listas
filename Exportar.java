import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivo(LinkedList<objVenta> p, int opt) {
        if (p.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Ventas.txt")) {
                for (objVenta obj : p) {
                    e.write("Número Factura: " + obj.getNumeroFactura() + "\n");
                    e.write("Nombre Cliente: " + obj.getNombreCliente() + "\n");
                    e.write("Nombre Vendedor: " + obj.getNombreVendedor() + "\n");
                    e.write("Total Venta: " + obj.getTotalVenta() + "\n");
                    e.write("Cantidad Productos: " + obj.getCantidadProductos() + "\n");
                    e.write("Estado Venta: " + obj.getEstadoVenta() + "\n");

                    e.write("------------------------------------------------------ \n");

                }
                switch (opt) {
                    case 1:
                        System.out.println("Registro ingresado correctamente ");
                        break;
                    case 2:
                        System.out.println("Registro modificado correctamente ");
                        break;
                    default:
                        System.out.println("Registro exportado correctamente ");
                        break;
                }
            

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}