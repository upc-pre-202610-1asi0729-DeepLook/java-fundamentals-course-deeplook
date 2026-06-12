public class Main {
    public static void main(String[] args) {
        int anioActual = 2026;
        int anioNacimiento = 2011;
        
        // Expresión matemática usando el operador de resta
        int edadCalculada = anioActual - anioNacimiento;

        // Expresión de concatenación usando el operador de suma
        System.out.println("Si naciste en " + anioNacimiento + " y estamos en " + anioActual + ", entonces cumples:");
        System.out.println(edadCalculada + " años.");
    }
}
