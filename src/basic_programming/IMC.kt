package basic_programming

import kotlin.math.pow

/*
Declare a variable with your weight in kg and with your height in meters.

Calculate the index of corporal mass (IMC = peso / altura2) and print with String format.
 */

fun main() {
    val weight = 82.5
    val height = 1.90

    val imc = weight / height.pow(2)

    println("Tu IMC es igual a: %.2f".format(imc))
}