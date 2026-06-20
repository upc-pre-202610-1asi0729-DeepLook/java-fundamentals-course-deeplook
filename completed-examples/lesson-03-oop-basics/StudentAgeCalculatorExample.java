class EstudianteConEdad {
    String nombre;
    int anioNacimiento;

    EstudianteConEdad(String nombreRecibido, int anioRecibido) {
        nombre = nombreRecibido;
        anioNacimiento = anioRecibido;
    }

    int calcularEdad() {
        int anioActual = 2026;
        int edad = anioActual - anioNacimiento;
        return edad;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Mi edad aproximada es:");
        System.out.println(calcularEdad());
    }
}

public class StudentAgeCalculatorExample {
    public static void main(String[] args) {

        EstudianteConEdad estudiante = new EstudianteConEdad("Ana", 2011);

        estudiante.presentarse();
    }
}