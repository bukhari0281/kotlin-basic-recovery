fun main() {
    val finalExam = 80
    val attendent = 75


    val passFinalExam = finalExam > 75
    val passAttendent = attendent > 80

    val pass = passFinalExam && passAttendent
    println(pass)
}