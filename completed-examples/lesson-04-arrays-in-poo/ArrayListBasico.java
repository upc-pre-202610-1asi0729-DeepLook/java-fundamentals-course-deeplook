import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> canciones = new ArrayList<>();

        canciones.add("Bohemian Rhapsody");
        canciones.add("Blinding Lights");
        canciones.add("Lose Yourself");

        System.out.println("Mi playlist tiene " + canciones.size() + " canciones:");

        for (String cancion : canciones) {
            System.out.println("  🎵 " + cancion);
        }

        canciones.remove("Blinding Lights");
        System.out.println("\nDespués de eliminar una:");
        for (String cancion : canciones) {
            System.out.println("  🎵 " + cancion);
        }
    }
}
