fun main(args : Array<String>){
    println("Hola mundo Vagabundo")

    var cadena : String
    var numA : Int = 9
    var numB : Long = 10
    var numC : Double = 10.05
    var numD : Float = 13.8f

    val inmutable = 12
    // inmutable = 12

    var letra : Char
    letra = '1'

    var cadenita : String = "Soy una cadena"

    fun sumar(x:Int=1, y:Int=1) : Int {
        return x+y
    }

    println(sumar())

    fun date(dia:Int, mes:Int, anio:Int, nombre:String, apellido:String){

    }

    date(dia=1, mes=6, anio = 2020, nombre = "", apellido = "")


    var dato : String = "johan"
    println(dato.capitalize())

    // Definiendo la función en una sola línea
    fun square(n:Int) = n*n
    println(square(2))

    fun cadenas(vararg datos:String) {
        // Foreach en kotlin
        for (cadena in datos) {
            println(cadena)
        }
    }

    cadenas("H", "Johan", "Mosquera")

    fun <T>numeros(dato:T){
        println(dato)
    }

    numeros(true)
    numeros(9)
    numeros("Hola")


    /*Cilos*/
    var items = listOf("Juan","Maria","Johan")
    for (item in items){
        println("El nombre del item es $item")
    }

    for (posicion in items.indices){
        println("En la posicion $posicion el nombre es ${items[posicion]}")
    }

    // Objetos y clases

    var libro = Libro("7 hábitos de la gente altamente efectiva", "Steven")
}