infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Al Bukhari" to "LO"
    val result2 = "Al Bukhari" to "UP"
    println("$result, $result2")
}