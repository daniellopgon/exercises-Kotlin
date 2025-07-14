package colecciones.estadistica

/*
Pide al usuario 10 números y guárdalos en una lista. Luego:

Muestra la suma, media, máximo y mínimo.

Indica cuántos números son pares e impares.

Elimina los números duplicados de la lista.
 */


class Estadistica(
    var lista: MutableList<Int> = mutableListOf()
) {
    fun addNum(numero: Int) {
        lista.add(numero)
    }

    fun suma(): Int {
        return lista.sum()
    }

    fun media(): Double {
        return if (lista.isNotEmpty()) lista.average() else 0.0
    }

    fun max(): Int? {
        return lista.maxOrNull()
    }

    fun min(): Int? {
        return lista.minOrNull()
    }

    fun contarParesEImpares(): Pair<Int, Int> {
        val pares = lista.count { it % 2 == 0 }
        val impares = lista.size - pares
        return Pair(pares, impares)
    }

    fun eliminarDuplicados() {
        lista = lista.distinct().toMutableList()
    }
}
