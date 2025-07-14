package arrays_matrices

import java.util.Scanner

/*
Crea un programa que:

Pida al usuario que introduzca 10 números decimales y los guarde en un array.

Calcule y muestre:

El promedio

El número más alto

El número más bajo
 */


fun main() {

    var sc = Scanner(System.`in`)
    var array = Array(10) { 0.0 }
    var mayor = 0.0
    var menor = 0.0
    var suma = 0.0

    for (i in 0..array.size - 1) {

        println(" Introduce el valor del indice $i ")
        array[i] = sc.nextDouble()
    }

    for (i in 0..array.size - 1) {

        suma += array[i]

        if (i == 0) {
            menor = array[i]
        }

        if (array[i] > mayor) {
            mayor = array[i]
        }
        if (array[i] < menor) {
            menor = array[i]
        }
    }

    var promedio = suma / array.size

    println(" El número más alto es $mayor el mas bajo es $menor y el promedio es $promedio ")

}