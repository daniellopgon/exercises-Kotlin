package extensions_operators

/*
Crea una función de extensión para List<Int> llamada promedioImpares() que devuelva el promedio
de los números impares de la lista. Usa esta función en main con una lista de enteros.
 */

fun List<Int>.oddAverage(): Double {
    val oddNumbers = this.filter { it % 2 != 0 }
    if (oddNumbers.isEmpty()) return 0.0
    return oddNumbers.average()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val average = numbers.oddAverage()
    println("El promedio de los impares es: $average")
}
