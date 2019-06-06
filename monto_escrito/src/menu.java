import java.util.Scanner;
import montoEscrito.montoEscrito; 
public class menu {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        do {
            System.out.println("Escribe un número entero: ");
            String n = s.nextLine();
            System.out.println(montoEscrito.cantidadLetra(n));
        } while (true);
    }
}