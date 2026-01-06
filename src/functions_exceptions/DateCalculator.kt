package functions_exceptions

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

fun calculateDateDifference(start: LocalDate, end: LocalDate): Long {
    return ChronoUnit.DAYS.between(start, end)
}

fun main() {
    val sc = Scanner(System.`in`)
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    try {
        println("Introduce la primera fecha (dd/MM/yyyy):")
        val startDateStr = sc.nextLine()

        println("Introduce la segunda fecha (dd/MM/yyyy):")
        val endDateStr = sc.nextLine()

        val startDate = LocalDate.parse(startDateStr, formatter)
        val endDate = LocalDate.parse(endDateStr, formatter)

        val days = calculateDateDifference(startDate, endDate)
        println("Hay $days días entre ambas fechas.")

    } catch (e: DateTimeParseException) {
        println("Una o ambas fechas no tienen el formato válido (dd/MM/yyyy).")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
