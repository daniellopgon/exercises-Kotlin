package arrays_matrices

import java.util.Scanner

/*
Pide al usuario 5 números y guárdalos en un array. Luego:

Crea un segundo array con los mismos elementos, pero rotados una posición a la derecha.

Muestra ambos arrays.
*/

fun main() {
    val sc = Scanner(System.`in`)
    val array = Array(5) { 0 }
    val arrayRotado = Array(5) { 0 }


    for (i in 0 until array.size) {
        print("Introduce el valor en la posición $i: ")
        array[i] = sc.nextInt()
    }


    arrayRotado[0] = array[array.size - 1]

    for (i in 1 until array.size) {
        arrayRotado[i] = array[i - 1]
    }

    println("Array original: ${array.contentToString()}")
    println("Array rotado:   ${arrayRotado.contentToString()}")
}
