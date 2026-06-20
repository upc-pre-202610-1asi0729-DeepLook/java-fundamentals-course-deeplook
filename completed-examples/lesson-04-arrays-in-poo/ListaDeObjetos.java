import java.util.ArrayList;

class Persona {
    private String nombre;
    private int altura;

    public Persona(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() { return this.nombre; }
    public int getAltura()    { return this.altura; }
}

class AtraccionParque {
    private String nombre;
    private int alturaMinima;
    private ArrayList<Persona> enLaAtraccion;

    public AtraccionParque(String nombre, int alturaMinima) {
        this.nombre = nombre;
        this.alturaMinima = alturaMinima;
        this.enLaAtraccion = new ArrayList<>();
    }

    public void intentarSubir(Persona persona) {
        if (persona.getAltura() < this.alturaMinima) {
            System.out.println(persona.getNombre() + " NO puede subir (muy bajo).");
        } else {
            this.enLaAtraccion.add(persona);
            System.out.println(persona.getNombre() + " subió a la atracción ✅");
        }
    }

    public void mostrarRiders() {
        System.out.println("\nEn la atracción '" + this.nombre + "':");
        if (this.enLaAtraccion.isEmpty()) {
            System.out.println("  Nadie.");
            return;
        }
        for (Persona p : this.enLaAtraccion) {
            System.out.println("  - " + p.getNombre() + " (" + p.getAltura() + " cm)");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Persona ana   = new Persona("Ana",   165);
        Persona carlo = new Persona("Carlo", 130);
        Persona diego = new Persona("Diego", 180);

        AtraccionParque montanaRusa = new AtraccionParque("Montaña Rusa", 140);

        montanaRusa.intentarSubir(ana);
        montanaRusa.intentarSubir(carlo);
        montanaRusa.intentarSubir(diego);

        montanaRusa.mostrarRiders();
    }
}
