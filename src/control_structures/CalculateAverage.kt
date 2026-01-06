package control_structures

import java.util.Scanner

/*
Pide al usuario notas (entre 0.0 y 10.0) hasta que escriba "fin".

Calcula el promedio de todas las notas válidas.

Ignora las que estén fuera de rango y avisa con un mensaje.

Muestra el total de notas válidas ingresadas y el promedio final con 2 decimales.
 */


fun main() {

    var sc = Scanner(System.`in`)
    var sum = 0.0
    var counter = 0
    var input: String

    println("Introduce una nota entre(0/10): , escribe (fin) para salir")
    input = sc.nextLine()

    while (input != "fin") {

        var grade = input.toDouble()

        if (grade < 0.0 || grade > 10.0) {
            println("Introduce una nota válida")
        } else {
            sum += grade
            counter++
        }

        print("Introduce una nota entre 0 y 10, o escribe 'fin' para salir: ")
        input = sc.nextLine()
    }

    var average = sum / counter

    println("El promedio de las notas es $average")

}