package basic_programming

import java.util.Scanner

/*
Declara variables para el precio del producto, la cantidad comprada y un impuesto del 21%.

Calcula el importe total (precio * cantidad * 1.21) e imprime:

"Total a pagar por 3 productos de 9.99€ con IVA: 36.27€"
 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce el precio: ")
    val price = scanner.nextDouble()

    println("Introduce la cantidad")
    val quantity = scanner.nextDouble()

    val IVA = 0.21

    val totalAmount = price * quantity * (1 + IVA)

    println("Total a pagar por 3 productos de 9.99€ con IVA: $totalAmount")

    scanner.close()
}

