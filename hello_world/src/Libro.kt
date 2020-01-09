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