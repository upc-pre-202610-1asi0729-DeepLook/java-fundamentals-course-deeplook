class EstudianteConMetodo {
    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + edad + " años");
    }
}

public class StudentMethodExample {
    public static void main(String[] args) {

        EstudianteConMetodo estudiante = new EstudianteConMetodo();

        estudiante.nombre = "Ana";
        estudiante.edad = 15;

        estudiante.presentarse();
    }
}