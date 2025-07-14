package arrays_matrices

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
    val matriz = Array(4) { Array(4) { 0 } }

    val sumaFilas = Array(4) { 0 }
    val sumaColumnas = Array(4) { 0 }

    for (i in 0 until 4) {

        for (j in 0 until 4) {

            print("Introduce el valor en [$i][$j]: ")
            val valor = sc.nextInt()

            matriz[i][j] = valor
            sumaFilas[i] += valor
            sumaColumnas[j] += valor
        }
    }

    for (i in 0 until 4) {
        println("Fila $i: ${sumaFilas[i]}")
    }

    for (j in 0 until 4) {
        println("Columna $j: ${sumaColumnas[j]}")
    }

    var filaMax = 0
    var colMax = 0

    for (i in 1 until 4) {
        if (sumaFilas[i] > sumaFilas[filaMax]) filaMax = i
        if (sumaColumnas[i] > sumaColumnas[colMax]) colMax = i
    }

    println("La fila con mayor suma es la $filaMax con ${sumaFilas[filaMax]}")
    println("La columna con mayor suma es la $colMax con ${sumaColumnas[colMax]}")
}
