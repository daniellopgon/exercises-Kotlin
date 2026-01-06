package files

import java.util.Scanner

/*
Crea un programa que:

Permita al usuario introducir nombres por consola (hasta escribir "fin").

Guarde cada nombre introducido en un archivo de texto llamado nombres.txt, uno por línea.

Al finalizar, lee el archivo y muestra cuántos nombres se han guardado y cuáles empiezan por la letra "M".
 */

import java.io.File

fun main() {

    val file = File("C:\\Users\\Usuario\\IdeaProjects\\ejercicios-Kotlin\\src\\archivos\\nombres.txt")
    val sc = Scanner(System.`in`)

    file.writeText("")

    var exit = ""

    while (exit.lowercase() != "fin") {
        println("Escribe un nombre o 'fin' para salir:")
        exit = sc.nextLine()

        if (exit.lowercase() != "fin") {
            file.appendText(exit + "\n")
        }
    }

    val names = file.readLines()

    val total = names.size
    val startsWithM = names.filter { it.startsWith("M", ignoreCase = true) }

    println("Se han guardado $total nombres.")
    println("Nombres que empiezan por 'M':")
    startsWithM.forEach { println(it) }
}
