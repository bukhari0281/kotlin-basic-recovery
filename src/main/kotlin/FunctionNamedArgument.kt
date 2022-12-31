fun fullName(
    firstName: String,
    middleName: String,
    lastname: String
) {
    println("Hello $firstName $middleName $lastname")
}

fun main() {
    fullName("Al", "Bukhari", "Riedho")
    fullName(
        firstName = "Al",
        lastname = "Riedho",
        middleName = "Bukhari"
    )
}