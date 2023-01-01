fun factorialLoop(nilai: Int): Int {
    var hasil = 1
    for (i in nilai downTo 1) {
        hasil *= i
    }
    return hasil
}

// Pake recursive
fun faktorialRecursive(nilai: Int): Int {
    return when(nilai) {
        1 -> 1
        else -> nilai * faktorialRecursive(nilai - 1)
    }
}
fun main() {
    println(factorialLoop(10))
    println(faktorialRecursive(10))
}