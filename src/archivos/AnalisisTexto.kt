package archivos

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

    val archivo = File("C:\\Users\\Usuario\\IdeaProjects\\ejercicios-Kotlin\\src\\archivos\\Prueba")

    if (!archivo.exists()) {
        println("El archivo no existe.")
        return
    }

    val contenido = archivo.readText()

    val palabras = contenido
        .lowercase()
        .split("\\s+".toRegex())
        .map { it.trim().replace("[^a-zA-Záéíóúüñ]".toRegex(), "") }


    val totalPalabras = palabras.size
    val palabrasLargas = palabras.count { it.length > 5 }
    val vecesKotlin = palabras.count { it == "kotlin" }


    println("Número total de palabras: $totalPalabras")
    println("Palabras con más de 5 letras: $palabrasLargas")
    println("Veces que aparece 'kotlin': $vecesKotlin")
}
