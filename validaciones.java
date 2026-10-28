import java.util.Scanner;

public class validaciones {

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingresar un número entero.");
            sc.next();
            }
            return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingresar un número entero.");
            sc.next();
            }
            return sc.nextDouble();
    }
    
}
