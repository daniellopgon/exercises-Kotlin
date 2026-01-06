package collections.statistics

/*
Pide al usuario 10 números y guárdalos en una lista. Luego:

Muestra la suma, media, máximo y mínimo.

Indica cuántos números son pares e impares.

Elimina los números duplicados de la lista.
 */


class Statistics(
    var list: MutableList<Int> = mutableListOf()
) {
    fun addNumber(number: Int) {
        list.add(number)
    }

    fun sum(): Int {
        return list.sum()
    }

    fun average(): Double {
        return if (list.isNotEmpty()) list.average() else 0.0
    }

    fun max(): Int? {
        return list.maxOrNull()
    }

    fun min(): Int? {
        return list.minOrNull()
    }

    fun countEvenAndOdd(): Pair<Int, Int> {
        val even = list.count { it % 2 == 0 }
        val odd = list.size - even
        return Pair(even, odd)
    }

    fun removeDuplicates() {
        list = list.distinct().toMutableList()
    }
}
