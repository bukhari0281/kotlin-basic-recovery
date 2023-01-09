const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main(args: Array<String>) {

    //Tipw Data Number
    var age: Byte = 30
    var heigh: Int = 30
    var sample: Float = 30.20F
    var long: Long = 30_000_000_000_000L
    var binary: Int = 0b010101010
    var doubleBinary: Double = binary.toDouble()

    println(age)
    println(age)
    println(heigh)
    println(sample)
    println(long)
    println(binary)
    println(doubleBinary)

    //Tipe Data Karakter
    var a: Char = 'H'
    var b: Char = 'A'
    var c: Char = 'T'
    var d: Char = 'i'


    println(a)
    println(b)
    println(c)
    println(d)

    //Tipe Data Boolean
    var benar: Boolean = true
    var salah: Boolean = false
    println(benar)
    println(salah)

    //Tipe data string
    var e: String = "Hallo 'world'"
    var f: String = """
        Aku akan terbang ke awan
        Aku akan terbang ke awan
        Aku akan terbang ke awan
        Aku akan terbang ke awan
        """.trimMargin()

    //Variabel pada kotlin
    val firstName: String = "Al Bukhari" // jika membuat variabel menggunakan val maka datanya tidak bisa diubah
    var lastName: String = "Riedho"
    lastName = "Bin Riedho" // Mengubah isi data dari variabel bernama lastName
    var fullName: String = firstName + " " + lastName
    var namaLengkap: String = "$firstName $lastName"
    var desc: String = "$fullName length = ${fullName.length}"

    println(e)
    println(f)
    println(fullName)
    println(namaLengkap)
    println(desc)

    // Memanggil variabel global
    println("$APP : $VERSION")

    // variabel di kotlin itu boleh null
    var kata: String? = "Kata"
    kata = "null"
    // error karena kata bisa null
    println(kata.length)
    // cara mengakses yang benar
    println(kata?.length)

}