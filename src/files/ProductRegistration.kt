package files

import java.io.File
import java.util.Scanner

/*
Crea un programa que:

Permita al usuario introducir productos con su precio, separados por coma (por ejemplo: Manzana,1.50).

Guarde los productos en un archivo productos.csv (uno por línea, en formato CSV).

Luego lea el archivo y muestre:

Todos los productos ordenados por precio.

El producto más caro y el más barato.
 */

data class Product(val name: String, val price: Double)

fun main() {
    val file = File("productos.csv")
    val sc = Scanner(System.`in`)
    val products = mutableListOf<Product>()

    println("Introduce productos en formato Nombre,Precio (escribe 'fin' para terminar):")

    var input = sc.nextLine()

    while (input.lowercase() != "fin") {
        val parts = input.split(",")

        if (parts.size == 2) {
            val name = parts[0].trim()
            val price = parts[1].toDoubleOrNull()

            if (price != null) {
                products.add(Product(name, price))
            } else {
                println("Precio inválido.")
            }
        } else {
            println("Formato incorrecto.")
        }

        println("Introduce otro producto o 'fin' para terminar:")
        input = sc.nextLine()
    }

    file.printWriter().use { writer ->
        products.forEach {
            writer.println("${it.name},${it.price}")
        }
    }

    val loadedProducts = file.readLines()
        .mapNotNull { line ->
            val parts = line.split(",")
            if (parts.size == 2) {
                val name = parts[0]
                val price = parts[1].toDoubleOrNull()
                if (price != null) Product(name, price) else null
            } else null
        }

    val sorted = loadedProducts.sortedBy { it.price }

    println("Productos ordenados por precio:")
    sorted.forEach {
        println("${it.name}: ${it.price} €")
    }

    val cheapest = sorted.firstOrNull()
    val mostExpensive = sorted.lastOrNull()

    println("Producto más barato: ${cheapest?.name} (${cheapest?.price} €)")
    println("Producto más caro: ${mostExpensive?.name} (${mostExpensive?.price} €)")
}
