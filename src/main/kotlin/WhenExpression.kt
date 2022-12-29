fun main() {
    val nilai = "A"

    when (nilai){
        "A" -> {
            println("Amazing")
        }"B" -> {
            println("Good")
        }"C" -> {
            println("Not Bad")
        }"D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again")
        }
    }

    val score = "A"

    when (score) {
        "A", "B", "C" -> {
            println("Lulus")
        }
        else -> {
            println("Try again")
        }
    }

    val finalExam = 'H'
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValues -> println("Lulus")
        !in passValues -> println("Try Again")
    }

    val name = "Bold"
    when(name) {
        is String -> println("Ini tipenya string")
        !is String -> println("Ini tipenya bukan string")
    }

    // whwn untuk menggantikan if else
    val f = 90
    when{
        f >= 90 -> println("Lulus")
        f >= 80 -> println("Lulus")
        f >= 70 -> println("Lulus")
        else -> println("Try Again")
    }

}