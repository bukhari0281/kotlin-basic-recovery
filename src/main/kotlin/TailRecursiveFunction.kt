fun main() {

    tailrec fun display(nilai: Int) {
        println("recursive $nilai")
        if (nilai > 0) {
            display(nilai - 1)
        }
    }

    display(10000)

    fun faktorialRecursive(nilai: Int, total: Int = 1): Int {
        return when (nilai) {
            1 -> total
            else -> faktorialRecursive(nilai - 1, total * nilai)
        }
    }

    println(faktorialRecursive(10))
}