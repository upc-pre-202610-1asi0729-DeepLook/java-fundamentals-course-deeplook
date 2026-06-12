public class ReturnMethodExample {
    public static void main(String[] args) {
        int resultado = sumar(8, 5);
        System.out.println("La suma es: " + resultado);
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
