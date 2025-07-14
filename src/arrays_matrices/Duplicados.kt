package arrays_matrices

import java.util.Scanner

/*
Pide al usuario 8 números enteros y guárdalos en un array. Luego:

Indica si hay valores duplicados

Si los hay, muestra qué números se repiten y cuántas veces
 */

fun main() {
    val sc = Scanner(System.`in`)
    val array = Array(8) { 0 }

    for (i in array.indices) {
        print("Introduce el valor ${i + 1}: ")
        array[i] = sc.nextInt()
    }

    for (i in array.indices) {
        var contador = 0

        for (j in array.indices) {
            if (array[i] == array[j]) {
                contador++
            }
        }

        if (contador > 1) {
            println("El número ${array[i]} se repite $contador veces.")
        }
    }
}