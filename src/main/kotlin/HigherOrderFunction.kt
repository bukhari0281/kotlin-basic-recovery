import java.lang.instrument.ClassFileTransformer

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }
    val lambdaUpper = { value: String -> value.toUpperCase()}
    println(hello("al", lambdaUpper))


    println(hello("al", { value: String -> value.toUpperCase()}))

    val result = hello("bukhari", { value: String ->
        value.toUpperCase()
    })
    val hasil = hello("BUKHARI") { value: String ->
        value.toLowerCase()
    }

    println(result)
    println(hasil)
}