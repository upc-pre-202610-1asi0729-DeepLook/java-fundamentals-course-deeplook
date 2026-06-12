import java.util.Scanner;

public class IfElseAgeExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("NO es mayor de edad.");
        }

    }
}
