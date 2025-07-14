package arrays_matrices

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
    var matriz = Array(3) { Array(3) { 0 } }
    var suma = 0


    println("Introduce los 9 valores de la matriz (3x3):")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("[$i][$j]: ")
            matriz[i][j] = sc.nextInt()
        }
    }

    println("Matriz completa:")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("${matriz[i][j]} ")
            suma += matriz[i][j]
        }
        println()
    }

    println("Diagonal principal:")

    for (i in 0 until 3) {
        print("${matriz[i][i]} ")
    }

    println("Diagonal secundaria:")

    for (i in 0 until 3) {
        val j = 2 - i
        print("${matriz[i][j]} ")
    }

    println(" Suma total: $suma ")
}
