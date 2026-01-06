package control_structures

import java.util.Scanner

/*
Pide al usuario dos números (inicio y fin).

Imprime todos los números primos en el rango.

Finalmente, muestra la cantidad de números primos encontrados.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce el comienzo: ")
    val start = scanner.nextInt()

    println("Introduce el final: ")
    val end = scanner.nextInt()

    var primeCount = 0

    for (i in start..end) {
        var isPrime = true
        if (i > 1) {
            for (j in 2 until i) {
                if (i % j == 0) {
                    isPrime = false
                }
            }
            if (isPrime) {
                print("$i, ")
                primeCount++
            }
        }
    }

    println("Cantidad de números primos encontrados: $primeCount")

    scanner.close()
}