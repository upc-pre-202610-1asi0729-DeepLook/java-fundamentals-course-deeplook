# Guión — Lección 5: Fundamentos de POO y programas sencillos (12-15 minutos)

**Responsable:** [Tu nombre]

**Herramienta:** OnlineGDB

**Duración estimada:** 12-15 minutos

## [0:00 – 0:45] Introducción

>"Hoy vamos a construir un programa completo en Java: un Registro de Pokémon."
>"Vamos a usar todo lo que aprendiste en las lecciones anteriores: variables, bucles, condicionales, métodos, y ahora lo nuevo — clases y objetos."
>"El programa va a permitir registrar hasta 5 Pokémon, generar sus estadísticas de forma aleatoria, y consultarlos desde un menú."
>"Vamos a trabajar todo en un solo archivo en OnlineGDB, así que abre tu navegador y sígueme paso a paso."

_(Mostrar diapositiva de presentación: portada del proyecto "Registro de Pokémon")_

## [0:45 – 2:30] Atributos de la clase Pokemon

_(Mostrar diapositiva: slide de la clase Pokemon con sus atributos)_

>"Empezamos creando la clase Pokemon. Esta clase va a tener 5 atributos privados."
>"Primero importamos Scanner para leer datos del usuario, y Random para generar números aleatorios."

_(Cambiar a OnlineGDB — escribir en pantalla lentamente mientras se narra)_

```java
import java.util.Scanner;
import java.util.Random;

class Pokemon {
    //atributos
    private String especie;
    private String nombre;
    private String tipo;
    private int nivel;
    private int[] estadisticas; //{hp, ataque, defensa}
```

>"Fíjate en el atributo estadisticas: es un array de 3 posiciones. La posición 0 guarda el HP, la 1 el ataque, y la 2 la defensa."

_(Resaltar en pantalla con una flecha: estadisticas[0]=HP, estadisticas[1]=Ataque, estadisticas[2]=Defensa)_

>"Todos los atributos son private — eso es encapsulación, un principio de POO que vimos en la lección anterior. Nadie fuera de la clase puede modificarlos directamente."

## [2:30 – 5:00] El Constructor

_(Mostrar diapositiva: slide del constructor de la clase Pokemon)_

>"Ahora el constructor. Recuerda: el constructor tiene el mismo nombre que la clase y no tiene tipo de retorno."
>"Nuestro constructor va a recibir tres datos: la especie, el tipo, y el nombre que el usuario quiera ponerle."

_(Cambiar a OnlineGDB — escribir en pantalla)_

```java
    public Pokemon(String _especie, String _tipo, String _nombre) {
        this.especie = _especie;
        this.tipo = _tipo;
```

>"Aquí viene algo interesante: si el usuario no quiere poner un nombre, usamos la especie como nombre por defecto. Para eso usamos un if-else."

```java
        if (_nombre == null || _nombre.equals("")) {
            this.nombre = _especie;
        } else {
            this.nombre = _nombre;
        }
```

>"Ahora la parte más entretenida: generamos el nivel y las estadísticas de forma ALEATORIA usando la clase Random."

```java
        Random random = new Random();
        this.nivel = random.nextInt(5) + 3;
        this.estadisticas = new int[3];
        this.estadisticas[0] = random.nextInt(31) + 20;
        this.estadisticas[1] = random.nextInt(16) + 10;
        this.estadisticas[2] = random.nextInt(16) + 10;
    }
```

>"random.nextInt(5) genera un número entre 0 y 4, sumamos 3 para que el nivel quede entre 3 y 7. La misma lógica aplica para las estadísticas, solo cambian los rangos."
>"Así, cada Pokémon que crees va a tener un nivel y estadísticas distintas, sin que el jugador tenga que ingresarlas manualmente."

## [5:00 – 6:30] Getters

_(Mostrar diapositiva: slide de los getters de la clase Pokemon)_

>"Ahora los getters. Recuerda que como nuestros atributos son privados, necesitamos estos métodos para poder LEER su valor desde afuera de la clase."
>"La convención es siempre la misma: empiezan con get, seguido del nombre del atributo con la primera letra en mayúscula."

_(Cambiar a OnlineGDB — escribir en pantalla)_

```java
    public String getEspecie() { return especie; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNivel() { return nivel; }
    public int getHp() { return estadisticas[0]; }
    public int getAtaque() { return estadisticas[1]; }
    public int getDefensa() { return estadisticas[2]; }
```

>"Fíjate que para hp, ataque y defensa no creamos un getter por separado del array — directamente devolvemos la posición correspondiente. Eso evita exponer el array completo."

## [6:30 – 7:30] Setters

_(Mostrar diapositiva: slide de los setters de la clase Pokemon)_

>"Los setters cumplen la función contraria: nos permiten MODIFICAR el valor de un atributo de forma controlada."

_(Cambiar a OnlineGDB — escribir en pantalla)_

```java
    public void setEspecie(String _especie) { this.especie = _especie; }
    public void setNombre(String _nombre) { this.nombre = _nombre; }
    public void setTipo(String _tipo) { this.tipo = _tipo; }
    public void setNivel(int _nivel) { this.nivel = _nivel; }
    public void setHp(int _hp) { this.estadisticas[0] = _hp; }
    public void setAtaque(int _ataque) { this.estadisticas[1] = _ataque; }
    public void setDefensa(int _defensa) { this.estadisticas[2] = _defensa; }
```

>"Con getters y setters completamos la encapsulación: los atributos están protegidos, pero damos acceso controlado a través de estos métodos."

## [7:30 – 8:30] Método mostrar()

_(Mostrar diapositiva: slide de los métodos de la clase Pokemon)_

>"Por último en la clase Pokemon, creamos un método que imprima toda la información del Pokémon en consola."

_(Cambiar a OnlineGDB — escribir en pantalla)_

```java
    public void mostrar() {
        System.out.println("Especie: " + especie);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
        System.out.println("HP: " + estadisticas[0]);
        System.out.println("Ataque: " + estadisticas[1]);
        System.out.println("Defensa: " + estadisticas[2]);
        System.out.println();
    }
}
```

>"Con esto, la clase Pokemon queda completa: atributos, constructor, getters, setters y un método para mostrar la información."

_(Mostrar en pantalla un resumen visual de la clase completa antes de pasar al Main)_

## [8:30 – 10:30] Clase Main: Registro de Pokémon

>"Ahora vamos a la clase Main, donde el usuario va a poder registrar e interactuar con sus Pokémon."
>"Primero declaramos el Scanner y le pedimos al usuario cuántos Pokémon quiere registrar, con un límite máximo de 5."

_(Escribir en pantalla)_

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int cantidad;
```

>"Usamos un bucle do-while para validar que la cantidad esté entre 1 y 5. Este bucle se repite mientras el dato ingresado NO sea válido."

```java
        do {
            System.out.println("Cuantos pokemones desea registrar?");
            System.out.println("(Maximo 5 pokemones)");
            cantidad = scanner.nextInt();
            scanner.nextLine();
        } while (cantidad < 1 || cantidad > 5);
```

>"Ahora declaramos un array de tipo Pokemon llamado equipoPokemon, del tamaño exacto que el usuario eligió."

```java
        Pokemon[] equipoPokemon = new Pokemon[cantidad];
```

>"Este array va a guardar cada objeto Pokemon que creemos — es la manipulación de arrays integrada con objetos."
>"Con un for, registramos cada Pokémon: pedimos especie, tipo, y preguntamos si desea ponerle un nombre."

```java
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Pokemon " + (i+1));
            System.out.println("Especie: ");
            String especie = scanner.nextLine();
            System.out.println("Tipo: ");
            String tipo = scanner.nextLine();
            System.out.println("Desea poner nombre? (si/no): ");
            String respuesta = scanner.nextLine();
            nombre = "";
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Nombre: ");
                nombre = scanner.nextLine();
            }
```

>"Finalmente, creamos el objeto Pokemon con los datos ingresados y lo guardamos en la posición i del array."

```java
            equipoPokemon[i] = new Pokemon(especie, tipo, nombre);
            System.out.println("Pokemon " + especie + " registrado exitosamente");
            System.out.println();
        }
        System.out.println("POKEMONES REGISTRADOS EXITOSAMENTE");
```

_(Resaltar en pantalla: cada vuelta del for crea un objeto distinto, con su propio nombre, tipo y estadísticas aleatorias)_

## [10:30 – 13:30] Menú interactivo

>"Ya con los Pokémon registrados, vamos a crear un menú que se mantenga abierto todo el tiempo usando while(true)."

_(Escribir en pantalla)_

```java
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Ver todos los detalles de mis pokemones");
            System.out.println("2. Ver detalle de un solo pokemon");
            System.out.println("3. Cambiar Nombre");
            int opcion = scanner.nextInt();
```

>"Si elige la opción 1, recorremos todo el array con un for y llamamos al método mostrar() de cada Pokémon."

```java
            if (opcion == 1) {
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Pokemon " + (i+1));
                    equipoPokemon[i].mostrar();
                    System.out.println();
                }
            }
```

>"Si elige la opción 2, le pedimos qué posición quiere ver, y validamos que esa posición exista dentro del rango registrado."

```java
            else if (opcion == 2) {
                System.out.println("Escoja una posicion de sus pokemones");
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if (seleccion > 0 && seleccion <= cantidad) {
                    equipoPokemon[seleccion-1].mostrar();
                }
            }
```

>"Como el array empieza en posición 0, restamos 1 a la selección del usuario para acceder al Pokémon correcto."
>"Y si elige la opción 3, usamos el setter setNombre() para modificar el nombre del Pokémon que el usuario eligió."

```java
            else if (opcion == 3) {
                System.out.println("Que pokemon de tu lista deseas cambiar");
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if (seleccion > 0 && seleccion <= cantidad) {
                    System.out.println("Nombre: ");
                    nombre = scanner.nextLine();
                    equipoPokemon[seleccion-1].setNombre(nombre);
                }
            }
        }
    }
}
```

>"Aquí ves en acción todo lo que aprendiste: el setter no solo cambia un valor — cambia el valor DENTRO de un objeto que vive en un array."

## [13:30 – 15:00] Demo en vivo y cierre

>"Vamos a ejecutar el programa completo. Voy a registrar 2 Pokémon y probar las 3 opciones del menú."

_(Ejecutar el programa en OnlineGDB — registrar 2 Pokémon, uno con nombre y otro sin nombre, y probar las 3 opciones del menú en vivo)_

>"¿Lo ves? Cada Pokémon que registramos es un objeto independiente, con sus propios atributos guardados en el array equipoPokemon."
>"El menú sigue funcionando en bucle gracias al while(true), y cada opción usa justamente los getters, setters y el método mostrar() que construimos."
>"Acabas de construir un programa real usando absolutamente todo lo aprendido en el curso: variables, condicionales, bucles, métodos, arrays, clases, objetos, constructores, getters y setters."
>"Antes de cerrar, te dejo un reto: en la lección anterior aprendiste sobre arrays dinámicos. ¿Puedes agregarle a la clase Pokemon una lista de habilidades, como 'Combustion', 'Lanzallamas' o 'Brasas', usando un ArrayList en vez de un array de tamaño fijo?"
>"Pruébalo en OnlineGDB y compártelo con tus amigos."
>"Gracias por llegar hasta aquí."

_(Pantalla final — mostrar el código completo + enlace al repositorio de GitHub)_