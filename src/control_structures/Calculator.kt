package control_structures

import java.util.*

/*
Crea un menú para una calculadora simple.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce un número: ")
    val a = scanner.nextInt()

    println("Introduce un segundo número: ")
    val b = scanner.nextInt()

    var option: Int

    do {
        println(
            """
            === MENÚ ===
            1) Sumar
            2) Restar
            3) Multiplicar
            4) Dividir
            5) Salir
            
            """
        )
        option = scanner.nextInt()

        when (option) {
            1 -> println("Resultado: ${a + b}")
            2 -> println("Resultado: ${a - b}")
            3 -> println("Resultado: ${a * b}")
            4 -> println(if (b != 0) "Resultado: ${a / b}" else "Error: división por cero")
            5 -> println("Saliendo…")
            else -> println("Opción no válida")
        }
    } while (option != 5)
}