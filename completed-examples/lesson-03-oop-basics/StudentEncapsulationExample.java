class EstudianteEncapsulado {
    private String nombre;
    private int edad;

    EstudianteEncapsulado(String nombreRecibido, int edadRecibida) {
        nombre = nombreRecibido;
        edad = edadRecibida;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + edad + " años");
    }
}

public class StudentEncapsulationExample {
    public static void main(String[] args) {

        EstudianteEncapsulado estudiante = new EstudianteEncapsulado("Ana", 15);

        estudiante.presentarse();

        // estudiante.edad = -5;
        // Esta línea daría error porque edad es private.
        // Eso significa que la edad está protegida.
    }
}