package extensiones_operadores

/*
Crea una función de extensión para la clase String llamada esPalindromo() que devuelva true si la palabra es un palíndromo
(se lee igual al revés). Usa esta función en main con varias palabras.
 */

fun String.esPalindromo(): Boolean {
    var original = this.lowercase()
    var reverso = original.reversed()
    return original == reverso
}

fun main() {
    var palabras = listOf("Oso", "Casa", "Reconocer", "Kotlin", "Salas")

    for (palabra in palabras) {
        if (palabra.esPalindromo()) {
            println("$palabra es un palíndromo")
        } else {
            println("$palabra NO es un palíndromo")
        }
    }
}
