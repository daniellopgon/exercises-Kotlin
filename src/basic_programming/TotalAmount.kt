package basic_programming

import java.util.Scanner

/*
Declare variables for the price product, the quantity bought, and a tax of 21%.

Calculate the total amount (price * quantity * 1.21) and print: "

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

