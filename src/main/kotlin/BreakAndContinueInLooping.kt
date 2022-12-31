fun main() {
    var i = 0
    while (true) {
        println("Angka ke - $i")
        i++
        if (i > 100)
            break
    }

    for (i in 1..1000) {
        if (i % 5 == 0) {
            continue
        }

        println("Angka $i")
    }
}