fun main() {
    val names = arrayOf("Al", "Bukhari", "Bin", "Riedho")
    for (name in names) {
        print(name)
        println(name)
    }

    for (v in 0..1000 step 10) {
        println("$v")
    }

    var array = arrayOf("Al", "Bukhari", "Bin", "Riedho")
    var nilai = 0
    for(nilai in array) {
        println(nilai)
        nilai++
    }
    println("Total perulangan = $nilai")
}