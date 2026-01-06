package basic_programming

import kotlin.math.pow

/*
Declara una variable con tu peso en kg y otra con tu altura en metros.

Calcula el índice de masa corporal (IMC = peso / altura²) e imprímelo con formato String.
 */

fun main() {
    val weight = 82.5
    val height = 1.90

    val imc = weight / height.pow(2)

    println("Tu IMC es igual a: %.2f".format(imc))
}