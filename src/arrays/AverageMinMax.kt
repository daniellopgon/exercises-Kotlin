package arrays

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
    var max = 0.0
    var min = 0.0
    var sum = 0.0

    for (i in 0..array.size - 1) {

        println(" Introduce el valor del indice $i ")
        array[i] = sc.nextDouble()
    }

    for (i in 0..array.size - 1) {

        sum += array[i]

        if (i == 0) {
            min = array[i]
        }

        if (array[i] > max) {
            max = array[i]
        }
        if (array[i] < min) {
            min = array[i]
        }
    }

    var average = sum / array.size

    println(" El número más alto es $max el mas bajo es $min y el promedio es $average ")

}
