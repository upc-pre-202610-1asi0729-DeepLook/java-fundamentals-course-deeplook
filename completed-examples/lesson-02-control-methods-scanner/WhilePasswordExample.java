import java.util.Scanner;

public class WhilePasswordExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String contrasenia = "123";//Contrasenia correcta
        String contraseniaIngresada = "";

        while (!contraseniaIngresada.equals(contrasenia)) {
            System.out.print("Ingresa la contraseña: ");
            contraseniaIngresada = lector.nextLine();
        }

        System.out.println("Contraseña infresada correcta.");

    }
}
