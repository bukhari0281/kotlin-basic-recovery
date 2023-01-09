inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "hello ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 0..100) {
        println(hello({"GG"},{"WP"}))
    }

    println(hello ({ "Al" },{ "Bukhari" }))

}