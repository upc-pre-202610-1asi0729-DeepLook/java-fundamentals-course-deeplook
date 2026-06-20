import java.util.ArrayList;

class Playlist {
    private ArrayList<String> canciones;

    public Playlist() {
        this.canciones = new ArrayList<>();
    }

    public void agregar(String cancion) {
        this.canciones.add(cancion);
    }

    public void eliminar(String cancion) {
        this.canciones.remove(cancion);
    }

    public void mostrar() {
        if (this.canciones.isEmpty()) {
            System.out.println("La playlist está vacía.");
            return;
        }
        for (String cancion : this.canciones) {
            System.out.println("  🎵 " + cancion);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist miPlaylist = new Playlist();
        miPlaylist.agregar("Starboy");
        miPlaylist.agregar("Bleed It Out");
        miPlaylist.agregar("Electric Feel");

        System.out.println("Playlist actual:");
        miPlaylist.mostrar();

        miPlaylist.eliminar("Bleed It Out");
        System.out.println("\nDespués de eliminar:");
        miPlaylist.mostrar();
    }
}
