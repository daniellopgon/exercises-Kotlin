package coroutines

/*
Diseña un programa que tenga una función que cuente hasta 10, con un segundo de espera entre número y
que se ejecute en segundo plano usando una coroutine (launch). Mientras tanto, el hilo principal debe
seguir activo.
 */

import kotlinx.coroutines.*

suspend fun contador() = coroutineScope {
    var contador = launch {
        for (i in 0..10) {
            print(" número = $i")
            delay(1000L)
        }
        println(" Contador finalizado ")
    }
}

fun main() = runBlocking {
    println("Inicio del programa")
    contador()
    println("El hilo principal puede seguir haciendo otras cosas.")
}