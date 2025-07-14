package estructuras_control

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
    var contador = 0
    var contadorAdultos = 0
    var contadorAnciano = 0
    var contadorNinio = 0

    while (contador < 5) {

        println("Introduce la edad de 5 personas: ")
        var edad = scanner.nextInt()

        contador++;

        if (edad <= 18) {
            println(" Es menor de edad ")
            contadorNinio++
        } else if (edad <= 64) {
            println(" Es adulto ")
            contadorAdultos++
        } else {
            println(" Es adulto mayor ")
            contadorAnciano++
        }
    }

    if (contadorNinio > contadorAnciano && contadorNinio > contadorAdultos) {
        println("Hay multitud de niños: $contadorNinio")
    } else if (contadorAdultos > contadorNinio && contadorAdultos > contadorAnciano) {
        println("Hay multitud de adultos: $contadorAdultos")
    } else {
        println("Hay multitud de ancianos: $contadorAnciano")
    }
}