import java.util.Scanner;

public class WhilePasswordStarter {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String contraseniaCorrecta = "java123";
        String contraseniaIngresada = "";

        // TODO: Completa el while para repetir mientras la contraseña sea incorrecta
        while (/* condición */) {
            System.out.print("Ingresa la contraseña: ");
            contraseniaIngresada = lector.nextLine();
        }

        System.out.println("Contraseña correcta. Acceso permitido.");

        lector.close();
    }
}
