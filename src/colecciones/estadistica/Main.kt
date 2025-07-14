package colecciones.estadistica

fun main() {
    val estadistica = Estadistica()

    val numeros = listOf(4, 3, 2, 3, 5, 6, 2, 7, 4, 9)
    numeros.forEach { estadistica.addNum(it) }

    println("Lista original: ${estadistica.lista}")
    println("Suma: ${estadistica.suma()}")
    println("Media: ${estadistica.media()}")
    println("Máximo: ${estadistica.max()}")
    println("Mínimo: ${estadistica.min()}")

    val (pares, impares) = estadistica.contarParesEImpares()
    println("Pares: $pares | Impares: $impares")

    estadistica.eliminarDuplicados()
    println("Lista sin duplicados: ${estadistica.lista}")
}
