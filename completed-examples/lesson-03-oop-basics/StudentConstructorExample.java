class EstudianteConConstructor {
    String nombre;
    int edad;

    EstudianteConConstructor(String nombreRecibido, int edadRecibida) {
        nombre = nombreRecibido;
        edad = edadRecibida;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Tengo " + edad + " años");
    }
}

public class StudentConstructorExample {
    public static void main(String[] args) {

        EstudianteConConstructor estudiante = new EstudianteConConstructor("Ana", 15);

        estudiante.presentarse();
    }
}