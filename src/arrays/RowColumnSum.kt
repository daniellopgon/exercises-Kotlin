package arrays

import java.util.Scanner

/*
Pide al usuario que introduzca los valores de una matriz 4x4.
Después:

Muestra la suma de cada fila

Muestra la suma de cada columna

Indica qué fila y columna tienen la mayor suma
 */


fun main() {
    val sc = Scanner(System.`in`)
    val matrix = Array(4) { Array(4) { 0 } }

    val rowSums = Array(4) { 0 }
    val columnSums = Array(4) { 0 }

    for (i in 0 until 4) {

        for (j in 0 until 4) {

            print("Introduce el valor en [$i][$j]: ")
            val value = sc.nextInt()

            matrix[i][j] = value
            rowSums[i] += value
            columnSums[j] += value
        }
    }

    for (i in 0 until 4) {
        println("Fila $i: ${rowSums[i]}")
    }

    for (j in 0 until 4) {
        println("Columna $j: ${columnSums[j]}")
    }

    var maxRow = 0
    var maxCol = 0

    for (i in 1 until 4) {
        if (rowSums[i] > rowSums[maxRow]) maxRow = i
        if (columnSums[i] > columnSums[maxCol]) maxCol = i
    }

    println("La fila con mayor suma es la $maxRow con ${rowSums[maxRow]}")
    println("La columna con mayor suma es la $maxCol con ${columnSums[maxCol]}")
}
