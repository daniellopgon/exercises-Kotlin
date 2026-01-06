package control_structures

import java.util.Scanner

/*
Pide al usuario que introduzca la edad de 5 personas. Para cada una, indica:

Si es menor de edad (menos de 18)

Si es adulto (18 a 64)

Si es adulto mayor (65 o más)

Además, al final, muestra cuántas personas hay en cada categoría.
 */

fun main() {

    var scanner = Scanner(System.`in`)
    var counter = 0
    var adultCounter = 0
    var elderlyCounter = 0
    var childCounter = 0

    while (counter < 5) {

        println("Introduce la edad de 5 personas: ")
        var age = scanner.nextInt()

        counter++;

        if (age <= 18) {
            println(" Es menor de edad ")
            childCounter++
        } else if (age <= 64) {
            println(" Es adulto ")
            adultCounter++
        } else {
            println(" Es adulto mayor ")
            elderlyCounter++
        }
    }

    if (childCounter > elderlyCounter && childCounter > adultCounter) {
        println("Hay multitud de niños: $childCounter")
    } else if (adultCounter > childCounter && adultCounter > elderlyCounter) {
        println("Hay multitud de adultos: $adultCounter")
    } else {
        println("Hay multitud de ancianos: $elderlyCounter")
    }
}