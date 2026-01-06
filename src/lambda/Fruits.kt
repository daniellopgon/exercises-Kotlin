package lambda

/*
Dada una lista de palabras, usa funciones lambda para:

Filtrar las que tengan más de 5 letras.

Contar cuántas contienen la letra "e".

Convertir todas las palabras a mayúsculas.
 */

fun main() {

    var wordList = mutableListOf("Manzana", "Pera", "Limón", "Naranja", "Platano")

    var longerThanFive = wordList.filter { it.length >= 5 }
    var containsE = wordList.count { it.contains("e") }
    var uppercaseList = wordList.map { it.uppercase() }

    println(longerThanFive)
    println(containsE)
    println(uppercaseList)

}