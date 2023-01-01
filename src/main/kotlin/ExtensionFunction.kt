fun String.hello(): String = "hello $this"

fun String.printHello(): Unit = println("Hello $this")
fun main() {
    val name = "Doni"

    println(name.hello())

    name.printHello()
    "Doni".printHello()
}