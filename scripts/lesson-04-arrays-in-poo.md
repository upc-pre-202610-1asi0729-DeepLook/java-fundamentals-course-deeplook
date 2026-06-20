# GUION: ArrayList — Tu colección de objetos en Java

**Duración estimada:** 12 minutos
**Público:** 12–17 años
**Tono:** Dinámico, con analogías cotidianas, pausas para código

---

## INTRO (0:00 – 0:45)

*[Mostrar en pantalla: una lista de Spotify con canciones]*

Oye, ¿alguna vez has creado una playlist en Spotify? Agregas canciones, las quitas, las escuchas en orden… ¿Y si te dijera que eso es **exactamente** lo que hace un `ArrayList` en Java?

Hoy vamos a ver qué es un `ArrayList<Object>`, por qué es una de las herramientas más poderosas en la Programación Orientada a Objetos, y cómo usarla. Spoiler: al final del video vas a poder crear tu propia playlist en código. 

---

## SECCIÓN 1 — ¿Qué es un ArrayList? (0:45 – 2:30)

*[Mostrar analogía visual: una mochila con compartimentos]*

Imagina que tienes una **mochila mágica**. Normalmente, una variable solo guarda **una cosa**: un número, un texto, un objeto. Pero un `ArrayList` es como esa mochila mágica que puede guardar **muchas cosas del mismo tipo**, y además puede **crecer o encogerse** según lo necesites.

A diferencia de los arrays normales (que tienen tamaño fijo, como una caja de huevos de 12), un `ArrayList` es **dinámico**. ¿Necesitas agregar más? Lo agrega. ¿Quieres eliminar uno? Listo.

*[Escribir código en vivo: crear un ArrayList<String>, agregar canciones, recorrerlo con for-each]*

El `<String>` entre los corchetes angulares es el **tipo de datos** que va a guardar la lista. Eso es lo que hace especial a `ArrayList<Algo>`: le dices exactamente qué tipo de objeto va a contener.

* Archivo relacinado:
  
---

## SECCIÓN 2 — Lista como atributo de un objeto (2:30 – 4:30)

*[Analogía: una clase Playlist como objeto real]*

Ahora viene lo interesante. En POO, los objetos pueden **tener listas dentro de ellos**. Es decir, un objeto puede *contener* una colección de otros datos.

Piénsalo así: una `Playlist` es un objeto. Pero dentro de esa playlist hay *muchas canciones*. Entonces, el objeto `Playlist` **tiene** un `ArrayList<String>` como atributo.

*[Escribir código en vivo: clase Playlist con constructor, agregarCancion, eliminarCancion, mostrarCanciones]*

El objeto `Playlist` *encapsula* su lista. Nadie desde afuera accede directamente al `ArrayList`: lo hacen a través de los métodos. Eso es **encapsulamiento** — uno de los principios clave de POO. 

* Archivo relacinado:
---

## SECCIÓN 3 — Lista de objetos dentro de un objeto (4:30 – 7:00)

*[Analogía: un parque de diversiones y sus visitantes]*

¿Y si en vez de guardar Strings, quisieras guardar **objetos de tus propias clases**? Aquí es donde `ArrayList<Object>` brilla de verdad.

Imagina un parque de diversiones. Hay una atracción llamada "Montaña Rusa" y cada vez que alguien sube, el sistema **registra quién subió**. La atracción guarda una lista de objetos de tipo `Persona`.

*[Escribir código en vivo: clase Persona con nombre y altura]*

*[Escribir código en vivo: clase AtraccionParque con ArrayList<Persona>, método intentarSubir que valida altura mínima, método mostrarRiders]*

*[Probar el programa: crear varias personas, algunas con altura suficiente y otras no, mostrar quiénes subieron]*

Carlo no entró porque no cumplía la altura mínima. La lista solo guarda a quienes sí pudieron subir. 

* Archivo relacinado:
