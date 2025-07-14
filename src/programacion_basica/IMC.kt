package programacion_basica

/*
Declara una variable con tu peso en kilogramos (por ejemplo 70.0) y una con tu altura en metros (por ejemplo 1.75).
Calcula el índice de masa corporal (IMC = peso / altura²) y muestra todo con texto formateado.
 */

fun main() {
    val pesoKg = 70.0
    val alturaM = 1.75
    val imc = pesoKg / (alturaM * alturaM)

    println("Peso: $pesoKg kg, Altura: $alturaM m, IMC: $imc")
}