package control_structures

import java.util.Scanner

/*
Pide al usuario un número impar positivo n, y dibuja un triángulo centrado con n filas,
usando solo símbolos #. Cada fila debe tener un número impar de símbolos.
 */


fun main() {

    var sc = Scanner(System.`in`)
    println(" Introduce un número impar positivo: ")

    var num = sc.nextInt()

    if (num % 2 == 0 || num < 0) {
        println(" El número tiene que ser impar positivo")
    } else {

        var ancho = 2 * num - 1
        var centro = ancho / 2

        for (i in 0..num) {
            var inicio = centro - i
            var fin = centro + i

            for (j in 0..ancho) {
                if (j >= inicio && j <= fin) {
                    print("#")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}