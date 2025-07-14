package funciones_excepciones

/*
Crea una función que reciba un texto String y devuelva un Triple<Int, Int, Int> con:

Número de palabras

Número de letras

Número de dígitos
 */

class AnalizadorTexto {

    fun texto(palabra: String): Triple<Int, Int, Int> {
        var numPalabras = palabra.trim().split("\\s+".toRegex()).size
        var numLetras = 0
        var numDigitos = 0

        for (c in palabra) {
            if (c.isLetter()) {
                numLetras++
            } else if (c.isDigit()) {
                numDigitos++
            }
        }

        return Triple(numPalabras, numLetras, numDigitos)
    }
}

fun main() {
    val analizador = AnalizadorTexto()
    val texto = "Hola mundo 123 esto es Kotlin 42"
    val resultado = analizador.texto(texto)

    println("Palabras: ${resultado.first}")
    println("Letras: ${resultado.second}")
    println("Dígitos: ${resultado.third}")
}
