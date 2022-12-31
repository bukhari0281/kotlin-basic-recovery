fun tambah(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(x: Int, y:Int): Int {
    if (x == 0) {
        return 0
    } else {
        val result = x/y
        return result
    }
}

fun main() {
    val result = tambah(10,20)
    println(result)

    println(bagi(200,20))
}