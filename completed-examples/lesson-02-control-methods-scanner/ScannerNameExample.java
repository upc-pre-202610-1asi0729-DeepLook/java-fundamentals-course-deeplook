import java.util.Scanner;

public class ScannerNameExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = lector.nextLine();

        System.out.println("Hola, " + nombre + ". Bienvenido al curso de Java.");

    }
}
