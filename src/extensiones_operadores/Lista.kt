package extensiones_operadores

/*
Crea una función de extensión para List<Int> llamada promedioImpares() que devuelva el promedio
de los números impares de la lista. Usa esta función en main con una lista de enteros.
 */

fun List<Int>.promedioImpares(): Double {
    val impares = this.filter { it % 2 != 0 }
    if (impares.isEmpty()) return 0.0
    return impares.average()
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7)
    val promedio = numeros.promedioImpares()
    println("El promedio de los impares es: $promedio")
}
