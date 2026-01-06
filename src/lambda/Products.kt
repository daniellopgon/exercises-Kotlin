package lambda

/*
Crea una clase Producto(nombre: String, precio: Double) y una lista con varios productos. Luego:

- Ordena los productos por precio (ascendente y descendente) usando lambdas.
- Filtra los productos que cuesten más de 50€.
- Muestra solo los nombres de los productos filtrados.
 */

class Product(
    var name: String,
    var price: Double,
)

fun main() {
    val productList: MutableList<Product> = mutableListOf()

    productList.add(Product("ACER", 600.54))
    productList.add(Product("HP", 700.65))
    productList.add(Product("APPLE", 1200.87))
    productList.add(Product("USB barato", 10.99))

    val ascending = productList.sortedBy { it.price }
    val descending = productList.sortedByDescending { it.price }
    val expensive = productList.filter { it.price > 50 }
    val names = expensive.map { it.name }

    println("Orden ascendente:")
    ascending.forEach { println("${it.name}: ${it.price}") }

    println("Orden descendente:")
    descending.forEach { println("${it.name}: ${it.price}") }

    println("Productos caros (>50€):")
    names.forEach { println(it) }
}
