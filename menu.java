import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    utilidades u = new utilidades();
    boolean seguir = true;
    while(seguir){
        switch (u.menu(sc)) {
            case 1:
                System.out.println("Página en mantenimiento.");
                break;
            case 2:
                System.out.println("Página en mantenimiento.");
                break;
            case 3:
                System.out.println("Página en mantenimiento.");
                break;
            case 4:
                System.out.println("Página en mantenimiento.");
                break;
            case 5:
                System.out.println("Página en mantenimiento.");
                break;
            case 6:
                System.out.println("Página en mantenimiento.");
                break;
            case 7:
                System.out.println("Página en mantenimiento.");
                break;
            case 8:
                System.out.println("Hasta luego");
                seguir = false;
                break;
            
        
            default:
                System.out.println("Está opción no está disponible.");
                break;
        }
    }
}
}
