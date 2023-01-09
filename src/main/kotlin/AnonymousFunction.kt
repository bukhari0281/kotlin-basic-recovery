fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val upper = fun(value: String): String {
        if(value == "") {
            return "gtgg".toUpperCase()
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("al", upper))
    println(hello("", upper))

    println(hello("bukhari", fun(value: String): String {
        return value.toUpperCase()
    })
    )
}