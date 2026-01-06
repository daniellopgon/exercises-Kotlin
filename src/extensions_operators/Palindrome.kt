package extensions_operators

/*
Crea una función de extensión para la clase String llamada esPalindromo() que devuelva true si la palabra es un palíndromo
(se lee igual al revés). Usa esta función en main con varias palabras.
 */

fun String.isPalindrome(): Boolean {
    var original = this.lowercase()
    var reversed = original.reversed()
    return original == reversed
}

fun main() {
    var words = listOf("Oso", "Casa", "Reconocer", "Kotlin", "Salas")

    for (word in words) {
        if (word.isPalindrome()) {
            println("$word es un palíndromo")
        } else {
            println("$word NO es un palíndromo")
        }
    }
}
