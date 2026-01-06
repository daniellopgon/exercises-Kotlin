package basic_programming

import java.util.Scanner

/*
Declara tres variables booleanas: tieneDNI, esAdulto, viveEnEspaña.

Después declara otra variable puedeVotar que sea el resultado de:

tieneDNI && esAdulto && viveEnEspaña e imprime el resultado con: ¿Puede votar? = true
 */

fun main() {
    val canVote : Boolean
    val scanner = Scanner(System.`in`)

    println("¿Tiene DNI?")
    val hasDNI = scanner.nextBoolean()

    println("¿Es adulto?")
    val isAdult = scanner.nextBoolean()

    println("¿Vive en España?")
    val isLivesInSpain = scanner.nextBoolean()

    if (hasDNI && isAdult && isLivesInSpain){
        canVote = true
    } else {
        canVote = false
    }

    println("¿Puede votar? $canVote")

    scanner.close()
}

