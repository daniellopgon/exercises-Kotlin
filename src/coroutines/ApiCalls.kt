package coroutines

/*
Simula tres llamadas a una API que tardan entre 1 y 3 segundos cada una.
Usa async para ejecutarlas en paralelo y espera los resultados con await.
Al final, muestra la suma de sus resultados.
 */

import kotlinx.coroutines.*

suspend fun apiCalls(): Int = coroutineScope {

    val call1 = async {
        println("Llamada 1 iniciada...")
        delay(3000L)
        println("Llamada 1 finalizada")
        10
    }

    val call2 = async {
        println("Llamada 2 iniciada...")
        delay(2000L)
        println("Llamada 2 finalizada")
        20
    }

    val call3 = async {
        println("Llamada 3 iniciada...")
        delay(1000L)
        println("Llamada 3 finalizada")
        30
    }

    val result1 = call1.await()
    val result2 = call2.await()
    val result3 = call3.await()

    result1 + result2 + result3
}

fun main() = runBlocking {
    println("Iniciando llamadas a la API...")
    val total = apiCalls()
    println("Suma total de resultados: $total")
}
