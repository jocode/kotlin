# Kotlin

Kotlin es un lenguaje de programación de tipado estático que corre sobre la máquina virtual de Java y que también puede ser compilado a código fuente de JavaScript. Es desarrollado principalmente por JetBrains en sus oficinas de San Petersburgo.

El [sitio oficial de Android](https://developer.android.com/kotlin?hl=es) menciona lo siguiente: _"Desarrolla mejores apps para Android más rápido con Kotlin. Este es un lenguaje de programación moderno de tipo estático que aumentará tu productividad y satisfacción como desarrollador. "_.

Con [Kotlin](https://kotlinlang.org/), se puede programar para:
- JVM
- Android
- Navegador
- Native


Además kotlin presume de las siguientes características:
- **Conciso**: NO es verboso como otros lenguajes, reduciendo la cantidad de código
- **Seguro**: Evita los errores ocurridos en otros lenguajes como el null pointer exceptions
- **Interoperable**: Puede trabajar sin ningun problema con las bibliotecas de la JVM
- **Multiparadigma** Puede usarlo usando la programación orienteda a objetos o usando programación funcional.


Para empezar a programar en Kotlin, debemos instalar el compilador y agregar el PATH al sistema. O podemos usar un IDE (Integrated Development Environment) para ahorrarnos todos este trabajo.

Se usará [IntelliJ IDEA](https://www.jetbrains.com/idea/) como entorno de desarrollo para trabajar en kotlin.


## Primer proyecto en Kotlin

Luego que se tenga instalado el programa, vamos a crear el primer proyecto.

Para ello abrimos _IntelliJ IDEA_ y damos clic en _**Create New Project**_. Seleccionamos _Kotlin -> JVM | IDEA_ y le colocamos el nombre al proyecto y ya.

Luego que se cree el proyecto, vamos a la carpeta _**src**_ y damos clic derecho para crear un _New Kotlin File_. Luego de esto ya se puede crear código kotlin. En ese caso podemos usar un hola mundo.

```kotlin
fun main(args : Array<String>){
    println("Hola mundo Vagabundo")
}
```

Para ejecutarlo, ubicamos el cursor en el archivo y damos clic en ejecutar.


Generalmente dentro de la carpeta **src** colocamos los archivos que llevará nuestro proyecto

## Clase En Kotlin

Para crear una clase, debemos seleccionar el tipo **class** en IntelliJ IDEA. Por defecto nos colocará la palabra clave **class** en el archivo.

```kotlin
class ClassA {

}
```

## Variables

### String

En Kotlin las variables de nombran primero y luego va el tipo de dato, por ejemplo:

```kotlin
var cadena : String
```

_**Inicializando la variable**_

```kotlin
var cadena : String = ""
```

**IMPORTANTE :star:** Dentro de una clase, siempre se debe inicializar la variable. Nunca debe estar vacía.

> Los tipos de datos en Kotlin podemos tratarlos como un objeto.

### Numéricas

- **int** Tamaño de 32
  `var num : Int`
- **long** Tamao de 64
  `var num : Long`
- **double**
  `var num : Double`
- **float** Tamaño de 32
  `var num : Float`
- **byte** 
  `var num : Byte`
- **short**
  `var num : Short`


### Inferencia de Tipos

La inferencia de tipos en Kotlin, es el tipo de dato que le da el lenguaje dependiendo del de la asignación que se le da a la variable. Es decir, si no colocamos el tipo de dato, Kotlin por defecto trata de asociar el valor con el tipo de dato correspondiente.

```kotlin
var n = 100 // Es un Int (Lo infiere)

var number : Int = 100 // Le indicamos al lenguaje que es un entero
```


### Asignar tipo explícitamente

En este caso, la definición expícita se trata de que como programadores, le indicamos al lenguaje que tipo de dato es la variable.

```kotlin
var mayor : Boolean = true // Explícita
var menor = true // Inferencia
```


### Constantes

Las constantes en kotlin, se usa con la palabra clave **val**

```kotlin
val numero = 1  
numero = 5 // No se puede modificar el valor, es inmutable (val).
```


### Tipo `Char`

Los tipos de dato tipo caracter se declaran de la siguiente forma. Los _**caracteres**_ en Kotlin se deben usar con _**comillas simples**_ `'A'`.  Kotlin toma las comillas dobles como cadena de caracteres o String.

```kotlin
var letra : Char
letra = 'A'
```

### Booleanos

Las variables booleanas se usan con letras minusculas y al hacerse explícitas se usa la palabra clave **Boolean**

```kotlin
var soltero : Boolean = true
```

### Cadenas

Los tipos de datos cadena o String, nos permite utilizan un gran tipo de datos que podemos convertir a unos en específicos.

```kotlin
var cadena : String = "Hola soy una cadena"
```

> La cadena siempre debe colocarse entre comillas dobles. Las comillas simples se usan para caracteres (Char)


### Cadeneas null

Las cadenas en Kotlin no podemos dejarlas como nulos. 

```kotlin
var cadena : String
cadena = null // No se puede dejar una cadena como nula.
```


## Funciones

### Definir una función

Las funciones se definen con la palabra reservada **fun** que hace referencia a _function_

```
// Estructura de una función tipo void
fun readLine() {
        
}
```


### Funciones con parámetros

Em Kotlin, los parámetros de las funciones no se pueden modificar. Se puede decir que son del tipo __val__ por defecto. 

```kotlin
fun readLine(x:Int, y:String){

}
```


### Regresando valores

Las **funciones** de acuerdo con la programación regresan valores. Los **métodos** no regresan un valor, solamente ejecutan un procedimiento.

```kotlin
fun readLine(x: Int, y:String) : Int {
  return x*y.toInt()
}
```

### Kotlin - Unit

El equivalente al _void_ es la palabra reservada _**Unit**_. Lo que le indica que la función no regresará nada.

Por defecto, si no colocamos la palabra unit, Kotlin lo toma como Unit

```kotlin
fun readLine(x:Int, y:Int) : Unit {

}

// Esta funcion es igual a la anterior. Kotlin la reconoce de la misma forma.
fun readLine(x:Int, y:Int) {
  
}
```

### Funciones con parámetros por defecto

```kotlin
fun sumar(x:Int=1, y:Int=1) : Int {
    return x+y
}

println(sumar(1,3))
println(sumar())
```


### Funciones con parámetros con nombre

En kotlin, podemos indicarle el nombre del parámetro al cual queremos pasarle el valor en el argumento, como se muestra en el siguiente ejemplo.

```kotlin
fun date(dia:Int, mes:Int, anio:Int, nombre:String, apellido:String){

}

date(dia=1, mes=6, anio = 2020, nombre = "", apellido = "")
```


### Funciones miembro

Una función miembro son las que ya se encuentran predefinidas en los tipos de datos o incluidas en el propio lenguaje

```kotlin
var dato : String = "johan"
println(dato.capitalize())  // Imprime Johan
```

### Funciones expresiones simples

Estas funciones debido a su simplicidad se pueden escibir en una sola línea

```kotlin
fun square(n:Int) : Int {
  return n*n
}
println(square(2))


// Definiendo la función en una sola línea
fun square(n:Int) = n*n
```

> No todas las funciones se pueden escribir en expresión simple.


### Vararg

**var** variables y **arg** argumentos. En muchas ocasiones necesitamos funciones que no tengan una cantidad específica de parámetros.

```kotlin
fun cadenas(vararg datos:String) {
  // Foreach en kotlin
  for (cadena in datos) {
    println(cadena)
  }
}

cadenas("H", "Johan", "Mosquera")
```

El **vararg** permite recibir una cantidad indefinida de parámetros de un determinado tipo de dato.


### Funciones genéricas

Las funciones genéricas permiten trabajar el dato sin importar el tipo de dato pasado por parámetro.

La función recibe cualquier tipo de dato

```kotlin
fun <T>numeros(dato:T){
  println(dato)
}

numeros(true)
numeros(9)
numeros("Hola")
```


## Ciclos

### Ciclo For

La **lista** en kotlin se define usando la palabra clave **`listOf()`**, de esta forma creamos una lista de datos.

```kotlin
var items = listOf("Juan","Maria","Johan")
for (item in items.indices){
    println("El nombre del item es $item")
}

for (posicion in items.indices){
  println("En la posicion $posicion el nombre es ${items[posicion]}")
}
```


### Manejo del `for` con `step` y `downTo`

```kotlin
// For del 1 al 20
for (x in 1..20){
  println(x)
}
```

- **step** Es el paso, indica en qué cantidad avanzará la iteración

```kotlin
for (x in 1..20 step 2){
  println(x)
}
```


- **down** Hacemos un retroceso, es decir nos devolvemos

```kotlin
for (x in 20 downTo 1){
  println(x)
}
```


### Ciclo while

Es otra estructura repetitiva.Es similar a otros lenguajes de programación.

```kotlin
var x = 1
while(x < 10){
  println(x)
  x++
}
```

### Ciclo Do While

Es otro tipo de estructura repetitiva, que garantiza  que el bloque de código sea leido al menos la primera vez.

```kotlin
var x = 1
do {
  println(x)
  x++
} while (x < 10)
```


## Clases en Kotlin

### Propiedades de clase

Las propiedades son variables que definen las características en los objetos. _**Las propiedades se deben inicializar**_

```kotlin
class Libro {

  var nombre:String = ""
  var autor:String = ""
  var paginas:Int = 1
  var historia:Boolean = false

}
```

### Métodos

En la programación orientada a objetos, las funciones que se declaren en las clases se les denomina **métodos**

```kotlin
class Libro {

  var nombre:String = ""
  var autor:String = ""
  var paginas:Int = 1
  var historia:Boolean = false

  fun prestar(libro:String, dias:Int): Int{
      println("Se ha prestado el libro ${libro} por ${dias} dias")
      return dias;
  }

}
```

### Constructor en kotlin

Es el método que se llama inmediatamente cuando se instancia la clase. Es útil para inicializar valores.

Para definir los parámetros en una clase a través de un constructor, utilizamos la palabra **constructor** enseguida del nombres de la clase.

```kotlin
class Libro constructor(nombre:String, autor:String, paginas:Int, editorial:String) {

  var nombre:String = ""
  var autor:String = ""
  var paginas:Int = 1
  var editorial:String = ""
  var historia:Boolean = false

  fun prestar(libro:String, dias:Int): Int{
      println("Se ha prestado el libro ${libro} por ${dias} dias")
      return dias;
  }

}
```

También podríamos definir la clase como se muestra a continuación si no se necesita anotaciones especiales.

```kotlin
class Libro (nombre:String, autor:String, paginas:Int, editorial:String) {
  /**
    Lo que lleva la clase
  */
}
```


### Clases **`init`**

En kotlin el bloque llamado **init** siempre se va a ejecutar en una clase.

```kotlin
class miClasesita {

  init {
    // Siempre se ejecuta
  }

}
```

En la documentación oficial dice que puede ser considerado como un constructor, pero NO es un constructor, es un bloque de inicialización.

```kotlin
class Libro constructor(nombre:String, autor:String, paginas:Int, editorial:String) {

  var nombre:String = ""
  var autor:String = ""
  var paginas:Int = 1
  var editorial:String = ""
  var historia:Boolean = false

  init {
    println("El libro ${nombre} tiene ${paginas} paginas")
  }

  fun prestar(libro:String, dias:Int): Int{
      println("Se ha prestado el libro ${libro} por ${dias} dias")
      return dias;
  }

}
```

### Constructores secundarios

Los constructores secundarios se refiere cuando se definen más de un constructor.

```kotlin
class Libro(autor:String){

  var nombre:String = ""
  var autor:String = ""
  var paginas:Int = 0
  var editorial:String = ""

  init {
    println("El libro es ${libro}")
  }

  constructor(autor:String, paginas:Int): this(autor) {
    println("Constructor 2")
  }

}
```

Con **constructor** definimos los constructores secundarios pero siempre debemos pasarle por parámetro el valor al constructor principal.


### :start: Crear un objeto

Para instanciar un objeto solo se crea la variable y se coloca el nombre de la clase que modelará el objeto.

_Main.kt_
```kotlin
var libro = Libro("7 hábitos de la gente altamente efectiva", "Steven")
```

_Libro.kt_
```kotlin
class Libro constructor(nombre:String, autor:String) {

    var nombre:String = ""
    var autor:String = ""
    var paginas:Int = 1
    var editorial:String = ""
    var historia:Boolean = false

    init {
        println("El libro ${nombre} tiene ${paginas} paginas")
    }

    constructor(nombre: String, autor:String, paginas:Int): this(nombre, autor) {
        println("Constructor 2")
    }

    fun prestar(libro:String, dias:Int): Int{
        println("Se ha prestado el libro ${libro} por ${dias} dias")
        return dias;
    }

}
```


## ¿Qué aporta Kotlin que no aporte JAVA?

**Simplicidad** Reduce en gran medida la cantidad de código por lo que: A menos cantidad de código, menor probabilidad de errores.

- **Características básicas**
  - Conciso
  - Seguro (Adios a los NPE)
  - Pragmático
  - No penaliza el rendimiento
  - Interoperabilidad con Java
  - Programación funcional