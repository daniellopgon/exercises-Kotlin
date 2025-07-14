package estructuras_control

import java.util.Scanner

/*
Pide al usuario notas (entre 0.0 y 10.0) hasta que escriba "fin".

Calcula el promedio de todas las notas válidas.

Ignora las que estén fuera de rango y avisa con un mensaje.

Muestra el total de notas válidas ingresadas y el promedio final con 2 decimales.
 */


fun main() {

    var sc = Scanner(System.`in`)
    var suma = 0.0
    var contador = 0
    var entrada: String

    println("Introduce una nota entre(0/10): , escribe (fin) para salir")
    entrada = sc.nextLine()

    while (entrada != "fin") {

        var nota = entrada.toDouble()

        if (nota < 0.0 || nota > 10.0) {
            println("Introduce una nota válida")
        } else {
            suma += nota
            contador++
        }

        print("Introduce una nota entre 0 y 10, o escribe 'fin' para salir: ")
        entrada = sc.nextLine()
    }

    var promedio = suma / contador

    println("El promedio de las notas es $promedio")

}