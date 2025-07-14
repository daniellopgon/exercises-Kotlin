package lambda

/*
Crea una lista de números del 1 al 10. Luego, usando map y filter:

Crea una nueva lista con los cuadrados de los números pares.

Filtra los mayores que 20.

Suma los valores resultantes.
 */


fun main() {

    var lista: MutableList<Int> = mutableListOf()

    for (i in 1..10) {
        lista.add(i)
    }

    var listaPares = lista.filter { it % 2 == 0 }
        .map { it * it }
        .filter { it > 20 }

    var suma = listaPares.sum()

    println(listaPares)
    println(suma)
}