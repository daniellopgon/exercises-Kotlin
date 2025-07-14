package coroutines

/*
Crea una función suspendida que simule descargar varios archivos con diferentes tiempos de espera.
Usa coroutines para que las descargas se realicen en paralelo y mide el tiempo total de ejecución.
 */

import kotlinx.coroutines.*

suspend fun descargaDeArchivos() = coroutineScope {
    val job1 = launch {
        for (i in 0..10 step 5) {
            println("Cargando...$i%")
            delay(300L)
        }
        println("Carga completada.")
    }

    val job2 = launch {
        for (i in 0..100 step 3) {
            println("Cargando...$i%")
            delay(200L)
        }
        println("Carga completada.")
    }

    val job3 = launch {
        for (i in 0..30 step 7) {
            println("Cargando...$i%")
            delay(500L)
        }
        println("Carga completada.")
    }

    job1.join()
    job2.join()
    job3.join()
}

fun main(): Unit = runBlocking {
    descargaDeArchivos()
}