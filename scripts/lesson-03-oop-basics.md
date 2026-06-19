# Lección 3: Introducción a la Programación Orientada a Objetos

## Descripción

En esta lección aprenderás los conceptos básicos de la Programación Orientada a Objetos, también conocida como POO. Usaremos Java para crear una clase sencilla llamada estudiante, entender qué son los objetos, los atributos, los métodos, los constructores y la encapsulación con getters y setters.

La idea principal es pasar de tener variables sueltas a organizar mejor la información dentro de clases y objetos.

## Objetivo de la lección

Al finalizar esta lección, el estudiante podrá:

- Comprender qué es una clase en Java.
- Crear objetos a partir de una clase.
- Identificar atributos como datos de un objeto.
- Crear métodos simples como acciones de un objeto.
- Usar constructores para inicializar objetos con datos.
- Aplicar encapsulación usando `private`.
- Leer y modificar datos privados usando getters y setters.
- Entender qué significa instanciar un objeto.

## Secuencia del video

### 1. De variables separadas a una clase

Antes de usar Programación Orientada a Objetos, podemos guardar datos usando variables separadas. Por ejemplo, podemos guardar el nombre y la edad de un estudiante.

Esto funciona, pero cuando el programa crece, puede volverse desordenado. Por eso usamos clases.

Una clase es como un molde. En este caso, la clase estudiante nos permite decir que un estudiante tendrá datos como nombre y edad.

Ejemplo:

- Crear una clase para representar un estudiante.
- Identificar los atributos `nombre` y `edad`.
- Entender que la clase todavía no es un objeto real, solo es el molde.

Archivo relacionado:

- [StudentClassExample.java](../completed-examples/lesson-03-oop-basics/StudentClassExample.java)

---

### 2. Crear un objeto

Después de crear una clase, podemos crear objetos a partir de ella.

Un objeto es algo creado usando una clase. Si la clase es el molde, el objeto es el elemento ya creado.

Ejemplo:

- Crear un objeto estudiante.
- Asignar valores a sus atributos.
- Mostrar sus datos en consola.

Archivo relacionado:

- [StudentObjectExample.java](../completed-examples/lesson-03-oop-basics/StudentObjectExample.java)

---

### 3. Agregar métodos simples

Una clase no solo puede guardar datos. También puede tener acciones.

En Java, esas acciones se llaman métodos. Por ejemplo, un estudiante puede presentarse mostrando su nombre y edad.

Ejemplo:

- Crear un método `presentarse`.
- Usar los atributos dentro del método.
- Llamar al método desde el programa principal.

Archivo relacionado:

- [StudentMethodExample.java](../completed-examples/lesson-03-oop-basics/StudentMethodExample.java)

---

### 4. Usar constructores

Un constructor sirve para crear un objeto con datos iniciales.

Antes, primero creábamos el objeto y luego llenábamos sus datos. Con un constructor podemos enviar los datos desde el inicio.

Ejemplo:

- Crear un constructor.
- Recibir un nombre y una edad.
- Guardar esos datos dentro del objeto.

Archivo relacionado:

- [StudentConstructorExample.java](../completed-examples/lesson-03-oop-basics/StudentConstructorExample.java)

---

### 5. Crear métodos con retorno dentro de una clase

También podemos colocar cálculos dentro de una clase. Por ejemplo, un estudiante puede tener su año de nacimiento y calcular su edad aproximada.

Ejemplo:

- Guardar el año de nacimiento.
- Crear un método `calcularEdad`.
- Usar `return` para devolver el resultado.

Archivo relacionado:

- [StudentAgeCalculatorExample.java](../completed-examples/lesson-03-oop-basics/StudentAgeCalculatorExample.java)

---

### 6. Encapsulación con `private`

La encapsulación permite proteger los datos de una clase.

Para lograrlo usamos la palabra `private`. Si un atributo es privado, no se puede modificar directamente desde fuera de la clase.

Esto ayuda a evitar errores, como colocar una edad negativa.

Ejemplo:

- Usar atributos privados.
- Evitar modificar los datos directamente.
- Entender por qué proteger la información mejora el programa.

Archivo relacionado:

- [StudentEncapsulationExample.java](../completed-examples/lesson-03-oop-basics/StudentEncapsulationExample.java)

---

### 7. Getters y setters

Si los atributos son privados, necesitamos una forma segura de leerlos y modificarlos.

Para eso usamos getters y setters.

Un getter permite leer un dato privado.  
Un setter permite modificar un dato privado de forma controlada.

Ejemplo:

- Usar `getNombre` para leer el nombre.
- Usar `getEdad` para leer la edad.
- Usar `setEdad` para cambiar la edad validando que sea mayor que cero.

Archivo relacionado:

- [StudentGetterSetterExample.java](../completed-examples/lesson-03-oop-basics/StudentGetterSetterExample.java)

---

## Conclusiones clave

- Una clase es como un molde.
- Un objeto es algo creado a partir de una clase.
- Los atributos son los datos del objeto.
- Los métodos son las acciones del objeto.
- Un constructor permite crear objetos con datos iniciales.
- Instanciar significa crear un objeto.
- La encapsulación protege los datos usando `private`.
- Los getters permiten leer datos privados.
- Los setters permiten modificar datos privados de forma controlada.
- La POO ayuda a organizar mejor el código.

## Práctica sugerida

Completa los archivos ubicados en:

- [Carpeta de práctica inicial](../starter-files/lesson-03-oop-basics/)

Luego compara tu solución con los ejemplos terminados en:

- [Carpeta de ejemplos completos](../completed-examples/lesson-03-oop-basics/)

## Herramienta online sugerida

Puedes copiar los ejemplos y ejecutarlos en:

- [OnlineGDB](https://www.onlinegdb.com/)
- [JDoodle](https://www.jdoodle.com/online-java-compiler)

No necesitas instalar nada en tu computadora.