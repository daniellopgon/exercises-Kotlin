package lambda

/*
Crea una clase Producto(nombre: String, precio: Double) y una lista con varios productos. Luego:

- Ordena los productos por precio (ascendente y descendente) usando lambdas.
- Filtra los productos que cuesten más de 50€.
- Muestra solo los nombres de los productos filtrados.
 */

class Producto(
    var nombre: String,
    var precio: Double,
)

fun main() {
    val listaProductos: MutableList<Producto> = mutableListOf()

    listaProductos.add(Producto("ACER", 600.54))
    listaProductos.add(Producto("HP", 700.65))
    listaProductos.add(Producto("APPLE", 1200.87))
    listaProductos.add(Producto("USB barato", 10.99))

    val ascendente = listaProductos.sortedBy { it.precio }
    val descendente = listaProductos.sortedByDescending { it.precio }
    val caros = listaProductos.filter { it.precio > 50 }
    val nombres = caros.map { it.nombre }

    println("Orden ascendente:")
    ascendente.forEach { println("${it.nombre}: ${it.precio}") }

    println("Orden descendente:")
    descendente.forEach { println("${it.nombre}: ${it.precio}") }

    println("Productos caros (>50€):")
    nombres.forEach { println(it) }
}
