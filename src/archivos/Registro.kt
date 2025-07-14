package archivos

import java.util.Scanner

/*
Crea un programa que:

Permita al usuario introducir nombres por consola (hasta escribir "fin").

Guarde cada nombre introducido en un archivo de texto llamado nombres.txt, uno por línea.

Al finalizar, lee el archivo y muestra cuántos nombres se han guardado y cuáles empiezan por la letra "M".
 */

import java.io.File

fun main() {

    val archivo = File("C:\\Users\\Usuario\\IdeaProjects\\ejercicios-Kotlin\\src\\archivos\\nombres.txt")
    val sc = Scanner(System.`in`)

    archivo.writeText("")

    var salir = ""

    while (salir.lowercase() != "fin") {
        println("Escribe un nombre o 'fin' para salir:")
        salir = sc.nextLine()

        if (salir.lowercase() != "fin") {
            archivo.appendText(salir + "\n")
        }
    }

    val nombres = archivo.readLines()

    val total = nombres.size
    val empiezanConM = nombres.filter { it.startsWith("M", ignoreCase = true) }

    println("Se han guardado $total nombres.")
    println("Nombres que empiezan por 'M':")
    empiezanConM.forEach { println(it) }
}
