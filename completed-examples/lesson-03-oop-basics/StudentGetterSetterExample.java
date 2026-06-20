class EstudianteSeguro {
    private String nombre;
    private int edad;

    EstudianteSeguro(String nombreRecibido, int edadRecibida) {
        nombre = nombreRecibido;
        setEdad(edadRecibida);
    }

    String getNombre() {
        return nombre;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("La edad debe ser mayor que cero.");
        }
    }
}

public class StudentGetterSetterExample {
    public static void main(String[] args) {

        EstudianteSeguro estudiante = new EstudianteSeguro("Ana", 15);

        System.out.println("Nombre:");
        System.out.println(estudiante.getNombre());

        System.out.println("Edad inicial:");
        System.out.println(estudiante.getEdad());

        estudiante.setEdad(16);

        System.out.println("Edad actualizada:");
        System.out.println(estudiante.getEdad());

        estudiante.setEdad(-5);
    }
}