package arrays

import java.util.Scanner

/*
Crea una matriz de 3x3 con valores introducidos por el usuario.
Luego:

Muestra la diagonal principal

Muestra la diagonal secundaria

Calcula la suma de cada una
 */

fun main() {
    var sc = Scanner(System.`in`)
    var matrix = Array(3) { Array(3) { 0 } }
    var sum = 0


    println("Introduce los 9 valores de la matriz (3x3):")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("[$i][$j]: ")
            matrix[i][j] = sc.nextInt()
        }
    }

    println("Matriz completa:")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("${matrix[i][j]} ")
            sum += matrix[i][j]
        }
        println()
    }

    println("Diagonal principal:")

    for (i in 0 until 3) {
        print("${matrix[i][i]} ")
    }

    println("Diagonal secundaria:")

    for (i in 0 until 3) {
        val j = 2 - i
        print("${matrix[i][j]} ")
    }

    println(" Suma total: $sum ")
}
