package functions_exceptions

/*
Crea una función que reciba un texto String y devuelva un Triple<Int, Int, Int> con:

Número de palabras

Número de letras

Número de dígitos
 */

class TextAnalyzer {

    fun analyze(text: String): Triple<Int, Int, Int> {
        var wordCount = text.trim().split("\\s+".toRegex()).size
        var letterCount = 0
        var digitCount = 0

        for (c in text) {
            if (c.isLetter()) {
                letterCount++
            } else if (c.isDigit()) {
                digitCount++
            }
        }

        return Triple(wordCount, letterCount, digitCount)
    }
}

fun main() {
    val analyzer = TextAnalyzer()
    val text = "Hola mundo 123 esto es Kotlin 42"
    val result = analyzer.analyze(text)

    println("Palabras: ${result.first}")
    println("Letras: ${result.second}")
    println("Dígitos: ${result.third}")
}
