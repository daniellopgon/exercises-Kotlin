package estructuras_control

import java.util.Scanner


/*
Haz un programa que muestre este menú en bucle hasta que el usuario elija "Salir":

1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Para las operaciones pide dos números al usuario.

Asegúrate de que no haya división por cero.

Usa when para seleccionar la operación.

Cuando el usuario elija salir, imprime: "¡Hasta luego!"
 */

fun main() {

    var sc = Scanner(System.`in`)

    var opcion = 0
    var x = 4
    var y = 3

    while (opcion != 6) {

        println(
            """
        Introduce una opción:
        1-Sumar
        2-Restar
        3-Multiplicar
        4-Dividir
        5-Salir
        
    """
        )

        opcion = sc.nextInt()

        when (opcion) {
            1 -> println(x + y)
            2 -> println(x - y)
            3 -> println(x * y)
            4 -> println(x / y)
            5 -> break
            6 -> println("Elige una opción válida")
        }

    }

}