fun sayHelloTo(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $lastName")
    }
}

fun main() {
    sayHelloTo("Eko")
    sayHelloTo("Eko","Kurniawan")
    sayHelloTo("Eko")
    sayHelloTo("Eko", "Nababan")
}