import java.util.Scanner;

public class IfElseAgeExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Aún eres menor de edad.");
        }

        lector.close();
    }
}
