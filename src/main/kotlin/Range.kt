fun main() {

    val range = 1..1000 step 5

    println(range.count())
    println(range.contains(50))
    println(range.contains(2000))
    println(range.first)
    println(range.last)
    println(range.step)
}