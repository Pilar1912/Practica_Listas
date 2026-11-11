import java.util.LinkedList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        utilidades u = new utilidades();
        importarJSON ij = new importarJSON();
        LinkedList<objVenta> l = new LinkedList<>();
        LinkedList<objVenta> lj = new LinkedList<>();
         lj= ij.Importar("VentasJson");
        boolean seguir = true;
        while (seguir) {
            switch (u.menu(sc)) {
                case 1:
                    lj = u.LLenaLista(lj, sc);
                    break;
                case 2:
                    System.out.println("pagina en mantenimiento");

                    break;

                case 3:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 4:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 5:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 6:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 7:
                    seguir = false;
                    break;

                case 8:
                    System.out.println("Hasta luego");
                    seguir = false;
                    break;
                    
                default:
                    System.out.println("esta opcion no esta disponible por favor valide ");
                    break;
            }
        }
    }
}