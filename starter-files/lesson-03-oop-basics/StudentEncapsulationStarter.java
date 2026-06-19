class EstudianteSeguroStarter {
    private String nombre;
    private int edad;

    EstudianteSeguroStarter(String nombreRecibido, int edadRecibida) {
        nombre = nombreRecibido;
        setEdad(edadRecibida);
    }

    String getNombre() {
        // TODO: Devuelve el nombre
        return "";
    }

    int getEdad() {
        // TODO: Devuelve la edad
        return 0;
    }

    void setEdad(int nuevaEdad) {
        // TODO: Si nuevaEdad es mayor que 0, guarda el valor en edad

        // TODO: Si no, muestra el mensaje "La edad debe ser mayor que cero."

    }
}

public class StudentEncapsulationStarter {
    public static void main(String[] args) {

        EstudianteSeguroStarter estudiante = new EstudianteSeguroStarter("Ana", 15);

        // TODO: Muestra el nombre usando getNombre()


        // TODO: Muestra la edad usando getEdad()


        // TODO: Cambia la edad a 16 usando setEdad()


        // TODO: Intenta cambiar la edad a -5 usando setEdad()

    }
}