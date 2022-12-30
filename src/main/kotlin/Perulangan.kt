fun main() {
    val names = arrayOf("Al", "Bukhari", "Bin", "Riedho")
    for (name in names) {
        print(name)
        println(name)
    }

    for (v in 0..1000 step 10) {
        println("$v")
    }

    var array = arrayOf("Al", "Bukhari", "Bin", "Riedho", "Agus", "Banaran")
    var nilai = 0
    for(n in array) {
        println(n)
        nilai++
    }
    println("Total perulangan = $nilai")

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("index $i = ${array.get(i)}")
    }
}