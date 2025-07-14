package archivos

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

data class Producto(val nombre: String, val precio: Double)

fun main() {
    val archivo = File("productos.csv")
    val sc = Scanner(System.`in`)
    val productos = mutableListOf<Producto>()

    println("Introduce productos en formato Nombre,Precio (escribe 'fin' para terminar):")

    var input = sc.nextLine()

    while (input.lowercase() != "fin") {
        val partes = input.split(",")

        if (partes.size == 2) {
            val nombre = partes[0].trim()
            val precio = partes[1].toDoubleOrNull()

            if (precio != null) {
                productos.add(Producto(nombre, precio))
            } else {
                println("Precio inválido.")
            }
        } else {
            println("Formato incorrecto.")
        }

        println("Introduce otro producto o 'fin' para terminar:")
        input = sc.nextLine()
    }

    archivo.printWriter().use { writer ->
        productos.forEach {
            writer.println("${it.nombre},${it.precio}")
        }
    }

    val productosLeidos = archivo.readLines()
        .mapNotNull { linea ->
            val partes = linea.split(",")
            if (partes.size == 2) {
                val nombre = partes[0]
                val precio = partes[1].toDoubleOrNull()
                if (precio != null) Producto(nombre, precio) else null
            } else null
        }

    val ordenados = productosLeidos.sortedBy { it.precio }

    println("Productos ordenados por precio:")
    ordenados.forEach {
        println("${it.nombre}: ${it.precio} €")
    }

    val masBarato = ordenados.firstOrNull()
    val masCaro = ordenados.lastOrNull()

    println("Producto más barato: ${masBarato?.nombre} (${masBarato?.precio} €)")
    println("Producto más caro: ${masCaro?.nombre} (${masCaro?.precio} €)")
}
