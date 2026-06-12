import java.util.Scanner;

public class WhilePasswordExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String contraseniaCorrecta = "java123";
        String contraseniaIngresada = "";

        while (!contraseniaIngresada.equals(contraseniaCorrecta)) {
            System.out.print("Ingresa la contraseña: ");
            contraseniaIngresada = lector.nextLine();
        }

        System.out.println("Contraseña correcta. Acceso permitido.");

        lector.close();
    }
}
