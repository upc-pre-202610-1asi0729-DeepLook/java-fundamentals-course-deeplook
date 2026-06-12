import java.util.Scanner;

public class VoidMethodExample {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();

        saludar(nombre);

        saludar("Ana");
        saludar("Luis");
        saludar("Mar�a");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre );
    }
}
