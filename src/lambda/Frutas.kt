package lambda

/*
Dada una lista de palabras, usa funciones lambda para:

Filtrar las que tengan más de 5 letras.

Contar cuántas contienen la letra "e".

Convertir todas las palabras a mayúsculas.
 */

fun main() {

    var listaPalabras = mutableListOf("Manzana", "Pera", "Limón", "Naranja", "Platano")

    var numLetras = listaPalabras.filter { it.length >= 5 }
    var contieneE = listaPalabras.count { it.contains("e") }
    var listaMayusculas = listaPalabras.map { it.uppercase() }

    println(numLetras)
    println(contieneE)
    println(listaMayusculas)

}