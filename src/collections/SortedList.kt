package collections

import java.util.Scanner

/*
Crea un programa que pida al usuario una lista de nombres (hasta que escriba "fin") y los almacene en una lista. Luego:

Muestra los nombres en orden alfabético.

Indica cuántos nombres comienzan por la letra "A".

Elimina duplicados si los hay.
 */


class SortedList(
    var list: MutableList<String> = mutableListOf()
) {

    fun addContact(name: String) {
        list.add(name)
    }

    fun sortElements(): List<String> {
        return list.distinct().sorted()
    }

    fun namesStartingWithA(): Int {
        return list.count { it.startsWith("A", ignoreCase = true) }
    }
}

fun main() {
    val sortedList = SortedList()
    val sc = Scanner(System.`in`)
    var input: String

    do {
        print("Introduce un nombre o escribe 'fin' para salir: ")
        input = sc.nextLine()
        if (input.lowercase() != "fin") {
            sortedList.addContact(input)
        }
    } while (input.lowercase() != "fin")

    println("Nombres ordenados sin duplicados:")
    sortedList.sortElements().forEach { println(it) }

    println("Cantidad de nombres que empiezan por 'A': ${sortedList.namesStartingWithA()}")
}
