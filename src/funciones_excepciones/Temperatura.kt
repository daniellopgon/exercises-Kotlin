package funciones_excepciones

/*
Crea una función que convierta temperaturas entre Celsius, Fahrenheit y Kelvin.

La función debe recibir un valor numérico y dos strings: unidad de entrada y unidad de salida.

Si el valor es menor que el cero absoluto (ej. -274°C), lanza una excepción.

Si la unidad es inválida, lanza otra excepción.
 */


class Temperatura {

    fun convertir(valor: Double, entrada: String, salida: String): Double {
        val entradaLower = entrada.lowercase()
        val salidaLower = salida.lowercase()

        val unidadesValidas = listOf("celsius", "fahrenheit", "kelvin")

        if (entradaLower !in unidadesValidas || salidaLower !in unidadesValidas) {
            throw UnidadInvalidaException("Unidad inválida: $entrada o $salida")
        }

        when (entradaLower) {
            "celsius" -> if (valor < -273.15) throw CeroAbsolutoException("No puede ser menor a -273.15°C")
            "fahrenheit" -> if (valor < -459.67) throw CeroAbsolutoException("No puede ser menor a -459.67°F")
            "kelvin" -> if (valor < 0) throw CeroAbsolutoException("No puede ser menor a 0K")
        }

        val valorEnCelsius = when (entradaLower) {
            "celsius" -> valor
            "fahrenheit" -> (valor - 32) * 5 / 9
            "kelvin" -> valor - 273.15
            else -> throw UnidadInvalidaException("Unidad inválida")
        }

        val resultado = when (salidaLower) {
            "celsius" -> valorEnCelsius
            "fahrenheit" -> valorEnCelsius * 9 / 5 + 32
            "kelvin" -> valorEnCelsius + 273.15
            else -> throw UnidadInvalidaException("Unidad inválida")
        }

        return resultado
    }
}

fun main() {
    val temp = Temperatura()

    try {
        print("Introduce el valor numérico de la temperatura: ")
        val valor = readLine()!!.toDouble()

        print("Introduce la unidad de entrada (Celsius, Fahrenheit, Kelvin): ")
        val entrada = readLine()!!

        print("Introduce la unidad de salida (Celsius, Fahrenheit, Kelvin): ")
        val salida = readLine()!!

        val resultado = temp.convertir(valor, entrada, salida)
        println("Resultado: $valor $entrada = $resultado $salida")

    } catch (e: UnidadInvalidaException) {
        println("Error de unidad: ${e.message}")
    } catch (e: CeroAbsolutoException) {
        println("Error de temperatura: ${e.message}")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
