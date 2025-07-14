package estructuras_control

import java.util.Scanner

/*
Pide al usuario dos números (inicio y fin). Muestra todos los números primos en ese rango.

Asegúrate de que el inicio sea menor que el final.

Usa bucles anidados para verificar la primalidad.

Al final, indica cuántos números primos encontró.
 */

fun main() {

    var sc = Scanner(System.`in`)
    println(" Introduce dos números: (inicio/fin) ")

    var inicio = sc.nextInt()
    var fin = sc.nextInt()

    if (fin < inicio) {
        println(" El inicio no puede ser mayor que el fin ")
    } else {

        for (i in inicio..fin) {
            var esPrimo = true

            if (i < 2) {
                esPrimo = false
            } else {
                for (j in 2 until i) {
                    if (i % j == 0) {
                        esPrimo = false
                    }
                }
            }
            if (esPrimo) {
                print("$i ")
            }
        }
    }
}