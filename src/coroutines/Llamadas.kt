package coroutines

/*
Simula tres llamadas a una API que tardan entre 1 y 3 segundos cada una.
Usa async para ejecutarlas en paralelo y espera los resultados con await.
Al final, muestra la suma de sus resultados.
 */

import kotlinx.coroutines.*

suspend fun llamadas(): Int = coroutineScope {

    val llamada1 = async {
        println("Llamada 1 iniciada...")
        delay(3000L)
        println("Llamada 1 finalizada")
        10
    }

    val llamada2 = async {
        println("Llamada 2 iniciada...")
        delay(2000L)
        println("Llamada 2 finalizada")
        20
    }

    val llamada3 = async {
        println("Llamada 3 iniciada...")
        delay(1000L)
        println("Llamada 3 finalizada")
        30
    }

    val resultado1 = llamada1.await()
    val resultado2 = llamada2.await()
    val resultado3 = llamada3.await()

    resultado1 + resultado2 + resultado3
}

fun main() = runBlocking {
    println("Iniciando llamadas a la API...")
    val total = llamadas()
    println("Suma total de resultados: $total")
}
