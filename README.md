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

