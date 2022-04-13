fun main() {
    val likes = 1
    printPeople(likes)

    testPeople()
}

fun printPeople(likes: Int) {
    val people = if ((likes % 10 == 1)&&(likes % 100 != 11)) "человеку" else "людям"
    println("Понравилось $likes $people")
}

fun testPeople() {
    (100..150).forEach { printPeople(it) }
}