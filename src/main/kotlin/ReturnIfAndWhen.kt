
fun main() {
    fun sayHello(name: String = "") : String {
        return if(name == "") {
            return "Hello Bro!"
        } else {
            "Hello $name"
        }
    }

    fun sayWhen(name: String = "") : String {
        return when (name) {
            "" -> "Lo Keren Bro!"
            else -> "Ngapain $name"
        }
    }

    println(sayHello())
    println(sayHello("Doni"))

    println(sayWhen("Doni"))
    println(sayWhen())
}