import java.util.LinkedList;
import java.util.Scanner;

public class utilidades {
    validaciones v = new validaciones();
    public int menu(Scanner sc){
        System.out.println("Bienvenido al sistema de ventas");
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Registrar una venta");
        System.out.println("2. Mostrar las ventas");
        System.out.println("3. Buscar una venta");
        System.out.println("4. Modificar una venta");
        System.out.println("5. Cancelar una venta");
        System.out.println("6. Eliminar una venta");
        System.out.println("7. Generar un informe");
        System.out.println("8. Salir");
        int num =v.ValidarEntero(sc);

        return num;
    }

    public LinkedList<objVenta> LlenaLista(LinkedList<objVenta> l){
        boolean pedir = true;
        while(pedir){

        }

        return l;
    }

    public static int NumeroFactura(LinkedList<objVenta> l){
        int ultimaFactura =  l.size();
        return ultimaFactura++;
    }

    public String PedirNombre(Scanner sc, int opt){
        switch (opt) {
            case 1:
                System.out.println("Ingrese el nombre del cliente:");
                break;
        
            default:
                System.out.println("Ingrese el nombre del vendedor:");
                break;
        }
        return sc.next();
    }

    public static Double TotalVenta(Scanner sc, validaciones v){
        System.out.println("Ingrese el total de la venta:");
        return v.ValidarDecimal(sc);
    }

    public String DatosEnteros(Scanner sc, int opt){
        switch (opt) {
            case 1:
                System.out.println("Ingrese la cantidad de productos de la venta:");
                break;
        
            default:
                System.out.println("Ingrese el estado de la venta 0).Cancelada 1).Registrada 2).Eliminada:");
                break;
        }
        return sc.next();
    }
    
}
