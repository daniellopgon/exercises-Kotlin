package basic_programming

import java.util.Scanner

/*
Declare three booleans variables: hasDNI, adult, lives In Spain.

After declaring another variable canVote that it be the result of:

hasDNI && adult && lives in Spain print the result with: ¿Can vote? = true
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

