# Guión — Lección 6: Consejos y próximos pasos (10 minutos)

**Responsable:** Fabian Sandoval

**Herramienta:** OnlineGDB

**Duración estimada:** 10 minutos

## [0:00 – 0:30] Introducción

>"Hola, bienvenidos a la última lección del curso. En esta lección no vamos a aprender un concepto nuevo — vamos a repasar lo que ya sabes, mostrarte los errores más comunes que comete todo principiante en Java, y darte algunos consejos para que sigas mejorando."

## [0:30 – 2:30] Repaso rápido

_(Mostrar diapositiva con resumen del curso)_

>"En este curso aprendiste seis cosas importantes:"
>* "Uno — qué es Java y por qué usarlo, además de variables y tipos de datos."
>* "Dos — operadores, expresiones y estructuras de control como if-else y bucles."
>* "Tres — métodos, parámetros, y cómo leer datos del usuario con Scanner."
>* "Cuatro — arrays dinámicos y su integración con objetos."
>* "Cinco — programación orientada a objetos: clases, constructores, getters, setters, y construiste un Registro de Pokémon completo."
>* "Y seis — esto que estás viendo ahora: errores comunes y consejos para seguir adelante."

## [2:30 – 6:00] Errores comunes

_(Abrir OnlineGDB en pantalla)_

>"Antes de irte, quiero mostrarte los errores más comunes que comete todo el mundo cuando empieza con Java."

_(Escribir en pantalla)_

>"Error número uno — olvidar el punto y coma."

```java
int nivel = 5
System.out.println(nivel);
```

>"¿Ves? Java marca error porque le falta el punto y coma al final de la línea. En Java, cada instrucción termina en punto y coma. Así es como debe quedar:"

```java
int nivel = 5;
System.out.println(nivel);
```

>"Error número dos — usar mal las mayúsculas y minúsculas en el nombre de la clase y el archivo."

```java
public class pokemon {
}
```

>"Java es sensible a mayúsculas. Si tu clase se llama Pokemon, con P mayúscula, el archivo también debe llamarse Pokemon.java, exactamente igual. Así es como debe quedar:"

```java
public class Pokemon {
}
```

>"Error número tres — comparar Strings con el símbolo de igual igual en vez de usar equals."

```java
String respuesta = "si";
if (respuesta == "si") {
    System.out.println("Correcto");
}
```

>"Esto puede no funcionar como esperas. Para comparar texto en Java, siempre usa el método equals, o equalsIgnoreCase si no te importan las mayúsculas. Así es como debe quedar:"

```java
String respuesta = "si";
if (respuesta.equalsIgnoreCase("si")) {
    System.out.println("Correcto");
}
```

>"Error número cuatro — acceder a una posición de un array que no existe."

```java
int[] estadisticas = new int[3];
System.out.println(estadisticas[3]);
```

>"Este array tiene 3 posiciones: 0, 1 y 2. La posición 3 no existe, y Java te va a marcar un error de índice fuera de rango. Siempre recuerda que un array de tamaño n va de la posición 0 a la n menos 1."

```java
int[] estadisticas = new int[3];
System.out.println(estadisticas[2]);
```

>"Error número cinco — olvidar declarar el objeto dentro del main, o crear el constructor mal."

```java
public class Main {
    Pokemon miPokemon = new Pokemon();

    public static void main(String[] args) {
    }
}
```

>"Este error es muy común: el main es estático, y una variable de instancia como esta no puede usarse desde un contexto estático si está declarada así, fuera del main. Lo correcto es crear el objeto dentro del propio main."

```java
public class Main {
    public static void main(String[] args) {
        Pokemon miPokemon = new Pokemon("Charmander", "Fuego", "");
    }
}
```

## [6:00 – 8:00] Consejos para seguir mejorando

_(Mostrar diapositiva)_

>"Ahora sí, los consejos."
>"Primero — practica todos los días aunque sea con un programa pequeño. No necesitas hacer algo grande, solo abre OnlineGDB y prueba algo nuevo."
>"Segundo — cuando tengas un error, lee el mensaje completo antes de buscar ayuda. Java casi siempre te dice la línea exacta y el tipo de error — ahí está la pista."
>"Tercero — explora la documentación oficial de Oracle Java. Ahí puedes buscar cualquier clase, como String o Random, y ver todos los métodos disponibles con ejemplos."
>"Cuarto — cuando un programa crezca mucho, divide tu código en varias clases en lugar de meter todo en una sola. Eso es justo lo que hace la programación orientada a objetos: separar responsabilidades."

## [8:00 – 9:00] Demostración final en OnlineGDB

_(Abrir OnlineGDB en pantalla)_

>"Para cerrar, te muestro un pequeño ejemplo que junta varios de los errores que vimos, ya corregidos, en un mini programa."

_(Escribir en pantalla)_

```java
import java.util.Scanner;

class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de tu mascota: ");
        String nombre = scanner.nextLine();
        System.out.println("Edad de tu mascota: ");
        int edad = scanner.nextInt();

        Mascota miMascota = new Mascota(nombre, edad);
        miMascota.mostrar();
    }
}
```

>"¿Ves? Punto y coma en su lugar, nombres de clase y archivo coincidiendo, sin comparar Strings con doble igual, sin salir del rango del array, y el objeto creado dentro del main. Con esto evitas el 90% de los errores que comete un principiante."

## [9:00 – 10:00] Cierre

>"Gracias por completar el curso de fundamentos de Java. Aprendiste variables, estructuras de control, métodos, arrays, y programación orientada a objetos — y lo aplicaste todo construyendo un Registro de Pokémon completo."
>"Si quieres seguir practicando, el enlace al repositorio de GitHub con todo el código del curso está en la descripción de este video, junto con el formulario para compartir tu propio proyecto."
>"¡Mucho éxito y sigue programando!"

_(Pantalla final — mostrar el repositorio de GitHub y el formulario para compartir creación)_