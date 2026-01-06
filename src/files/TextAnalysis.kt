package files

/*
Crea un programa que:

Lea el contenido de un archivo llamado texto.txt.

Calcule:

El número total de palabras.

Cuántas palabras contienen más de 5 letras.

Cuántas veces aparece la palabra "kotlin" (sin importar mayúsculas).

Muestra los resultados por consola.

Puedes crear tú mismo un archivo texto.txt con contenido ficticio para probar.
 */


import java.io.File

fun main() {

    val file = File("C:\\Users\\Usuario\\IdeaProjects\\ejercicios-Kotlin\\src\\archivos\\Prueba")

    if (!file.exists()) {
        println("El archivo no existe.")
        return
    }

    val content = file.readText()

    val words = content
        .lowercase()
        .split("\\s+".toRegex())
        .map { it.trim().replace("[^a-zA-Záéíóúüñ]".toRegex(), "") }


    val totalWords = words.size
    val longWords = words.count { it.length > 5 }
    val kotlinCount = words.count { it == "kotlin" }


    println("Número total de palabras: $totalWords")
    println("Palabras con más de 5 letras: $longWords")
    println("Veces que aparece 'kotlin': $kotlinCount")
}
