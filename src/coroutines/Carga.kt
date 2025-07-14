package coroutines

/*
Crea una función suspendida que simule una barra de carga del 0% al 100%.
Muestra el progreso en consola y permite cancelarla si el usuario pulsa una
tecla (puedes simularlo con otra coroutine).
 */

import kotlinx.coroutines.*

suspend fun barraDeCarga() = coroutineScope {
    val job = launch {
        for (i in 0..100 step 5) {
            println("Cargando... $i%")
            delay(200L)
        }
        println("Carga completada.")
    }

    launch {
        delay(1000L)
        println("¡Simulación: tecla pulsada! Cancelando carga...")
        job.cancelAndJoin()
        println("Carga cancelada.")
    }
}

fun main(): Unit = runBlocking {
    barraDeCarga()
}
