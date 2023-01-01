fun toUpper(katanya: String): String = katanya.toUpperCase()

fun main() {
    val contohLambda: (String, String) -> String = {
        namaDepan: String,
        namaBelakang: String ->
        val hasil = "$namaDepan $namaBelakang"
        hasil
    }

    val contohLambdaPakeIt: (String) -> String = {
        "Hello $it"
    }

    println(contohLambdaPakeIt("Bang"))

    val name = contohLambda("Doni", "Komaladi")

    println(name)

    val toUpperCase : (String) -> String = ::toUpper
}