package colecciones

import java.util.Scanner

/*
Crea un programa que pida al usuario una lista de nombres (hasta que escriba "fin") y los almacene en una lista. Luego:

Muestra los nombres en orden alfabético.

Indica cuántos nombres comienzan por la letra "A".

Elimina duplicados si los hay.
 */


class ListaOrdenada(
    var lista: MutableList<String> = mutableListOf()
) {

    fun addContacto(nombre: String) {
        lista.add(nombre)
    }

    fun ordenarElementos(): List<String> {
        return lista.distinct().sorted()
    }

    fun nombresConLaLetraA(): Int {
        return lista.count { it.startsWith("A", ignoreCase = true) }
    }
}

fun main() {
    val lista = ListaOrdenada()
    val sc = Scanner(System.`in`)
    var entrada: String

    do {
        print("Introduce un nombre o escribe 'fin' para salir: ")
        entrada = sc.nextLine()
        if (entrada.lowercase() != "fin") {
            lista.addContacto(entrada)
        }
    } while (entrada.lowercase() != "fin")

    println("Nombres ordenados sin duplicados:")
    lista.ordenarElementos().forEach { println(it) }

    println("Cantidad de nombres que empiezan por 'A': ${lista.nombresConLaLetraA()}")
}
