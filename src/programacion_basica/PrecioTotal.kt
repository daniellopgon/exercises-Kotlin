package programacion_basica

/*
Declara variables para el precio de un producto, la cantidad comprada, y un impuesto del 21%. Calcula el precio total (precio × cantidad × 1.21) e imprime:
"Total a pagar por 3 productos de 9.99€ con IVA: 36.27€"
 */

fun main() {

    val precio = 25.63
    val cantidad = 3
    val IVA = 21
    val precioConIva = (25.63 * IVA / 100) + precio

    val precioTotal = precioConIva * cantidad
    println(" El precio total es: $precioTotal")

}

