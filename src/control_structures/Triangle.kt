package control_structures

import java.util.Scanner

/*
Request an odd positive number n from the user and draw a triangle with n rows using only # signs.

Each row should have an odd number of signs.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce un número impar positivo: ")
    val odd = scanner.nextInt()

    if ((odd and 1) == 0 || odd <= 0) {
        println("Introduce un número impar positivo: ")
    } else {
        val widht = odd * 2 - 1
        val center = widht shr 1

        for (i in 0..odd) {
            val start = center - i
            val end = center + i

            for (j in 0..widht) {
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