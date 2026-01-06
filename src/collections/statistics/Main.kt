package collections.statistics

fun main() {
    val statistics = Statistics()

    val numbers = listOf(4, 3, 2, 3, 5, 6, 2, 7, 4, 9)
    numbers.forEach { statistics.addNumber(it) }

    println("Lista original: ${statistics.list}")
    println("Suma: ${statistics.sum()}")
    println("Media: ${statistics.average()}")
    println("Máximo: ${statistics.max()}")
    println("Mínimo: ${statistics.min()}")

    val (even, odd) = statistics.countEvenAndOdd()
    println("Pares: $even | Impares: $odd")

    statistics.removeDuplicates()
    println("Lista sin duplicados: ${statistics.list}")
}
