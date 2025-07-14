package funciones_excepciones

import java.time.LocalDate
import java.util.Scanner
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.temporal.ChronoUnit


/*
Pide dos fechas al usuario en formato dd/MM/yyyy.

Escribe una función que calcule la diferencia entre ellas en días.

Usa java.time.LocalDate y ChronoUnit.DAYS.between()

Si alguna fecha no es válida, lanza una excepción.
 */

fun calculadoraFechas(inicio: LocalDate, fin: LocalDate): Long {
    return ChronoUnit.DAYS.between(inicio, fin)
}

fun main() {
    val sc = Scanner(System.`in`)
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    try {
        println("Introduce la primera fecha (dd/MM/yyyy):")
        val fechaInicioStr = sc.nextLine()

        println("Introduce la segunda fecha (dd/MM/yyyy):")
        val fechaFinStr = sc.nextLine()

        val fechaInicio = LocalDate.parse(fechaInicioStr, formatter)
        val fechaFin = LocalDate.parse(fechaFinStr, formatter)

        val dias = calculadoraFechas(fechaInicio, fechaFin)
        println("Hay $dias días entre ambas fechas.")

    } catch (e: DateTimeParseException) {
        println("Una o ambas fechas no tienen el formato válido (dd/MM/yyyy).")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
