fun main() {
    val likes = 1
    printPeople(likes)

    testPeople()
}

fun printPeople(likes: Int) {
    val people = if (likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes $people")
}

fun testPeople() {
    (0..50).forEach { printPeople(it) }
}