package control_structures

import java.util.Scanner

/*
Pide al usuario un número impar positivo n y dibuja un triángulo con n filas usando solo signos #.

Cada fila debe tener un número impar de signos.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce un número impar positivo: ")
    val odd = scanner.nextInt()

    if ((odd and 1) == 0 || odd <= 0) {
        println("Introduce un número impar positivo: ")
    } else {
        val width = odd * 2 - 1
        val center = width shr 1

        for (i in 0..odd) {
            val start = center - i
            val end = center + i

            for (j in 0..width) {
                if (j >= start && j <= end) {
                    print("#")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}