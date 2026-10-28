import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    utilidades u = new utilidades();
    boolean seguir = true;
    while(seguir){
        switch (u.menu(sc)) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
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
