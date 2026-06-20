class EstudianteObjeto {
    String nombre;
    int edad;
}

public class StudentObjectExample {
    public static void main(String[] args) {

        EstudianteObjeto estudiante = new EstudianteObjeto();

        estudiante.nombre = "Ana";
        estudiante.edad = 15;

        System.out.println("Nombre del estudiante:");
        System.out.println(estudiante.nombre);

        System.out.println("Edad del estudiante:");
        System.out.println(estudiante.edad);
    }
}