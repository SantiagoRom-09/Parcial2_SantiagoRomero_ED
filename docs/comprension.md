# Comprensión del diseño — Enunciado A
**Nombre:** Santiago Romero
**Fecha:** 19/10/2026

Responde con tus palabras, basándote en `docs/UML-final.md`. Respuestas
concisas (2–4 líneas por pregunta). Este documento evidencia que entendiste el
contrato de diseño **antes** de programar.

---

### 1. Herencia y polimorfismo
¿Por qué `Sensor` es una clase abstracta y no una clase concreta? Menciona
qué método obliga a cada subclase a implementar y qué gana el sistema con eso.

> Tu respuesta: El método que obliga a la clase padre Sensor a ser una clase abstracta es el polimorfismo
dado en sus clases hijas tales como SensorHumedad, las cuales necesitan cambios
que solo se vean directamente influenciados en un objeto y no modifique el
código de Sensor con instancias directas a los objetos.

### 2. Composición vs. agregación
Explica con tus palabras la diferencia entre `NodoIoT ◆— Sensor` (composición)
y `CentroMonitoreo ◇— NodoIoT` (agregación). Da un ejemplo de qué pasaría con
los sensores si se elimina el nodo, y qué pasaría con los nodos si se elimina
el centro.

> Tu respuesta: En `NodoIoT ◆— Sensor` (composición), ninguna puede vivir sin la otra, se dan sentido
mutuo, en cambio en `CentroMonitoreo ◇— NodoIoT` (agregación) los 2 funcionan en conjunto,
pero pueden vivir una sin la otra, sin perder su propósito principal con posibilidad de seguir siendo utilizados.

### 3. Asociación
En `TecnicoMantenimiento — NodoIoT`, ¿quién es dueño de quién? ¿Por qué se
modela como N:M y no como composición?

> Tu respuesta: Se podría decir que ninguno es dueño del otro ya que pueden existir
> independientemente Se le dice N:M porque un técnico puede encargarse del mantenimiento 
> de varios nodos IoT y un mismo nodo puede ser atendido por varios técnicos. No es una 
> composición porque la existencia de un nodo IoT no depende de un técnico específico.


---

### 4. Dependencia
¿Por qué `Lectura` **depende** de `ValidadorLectura` en lugar de **tenerlo**
como atributo? ¿Qué diferencia práctica hay entre pasar un `ValidadorLectura`
como parámetro versus guardarlo en un campo?

> Tu respuesta: Lectura depende de ValidadorLectura para lograr crear una 
> dependencia puntual entre estas 2, haciendo que si ValidadorLecturas no 
> habilita el paso a la función de lecturas se retorne un False y sea práctico
> dependirndo de la situación, a parte, el parametro ValidadorLecturas solo se
> usa cuando se es necesario en la instancia Lectura. 

### 5. Listas
En este proyecto se usan dos estructuras de datos distintas:
- `int[] ultimasLecturas` en `Sensor`
- `ArrayList<Sensor>` en `NodoIoT`

Explica por qué en cada caso se eligió esa estructura y no la otra. ¿Qué
ventaja tiene el `int[]` con buffer circular frente a un `ArrayList` para el
historial de lecturas?

> Tu respuesta: int[] crea una lista de una clase fia la cual va a ser entero, en
> cambio un arreglo Arraylist toma objetos tales como sensores los cuales puede eliminar
> y usarlos de manera practica; el diferenciador principal es que int[] es un proceso mucho
> menos pesado y de fácil acceso en el código con posibilidad de reusar posiciones y
> Arraylist de mayor influencia y más generalizado pero es un proceso más pesado.