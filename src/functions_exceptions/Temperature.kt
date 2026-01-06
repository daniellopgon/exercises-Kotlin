package functions_exceptions

/*
Crea una función que convierta temperaturas entre Celsius, Fahrenheit y Kelvin.

La función debe recibir un valor numérico y dos strings: unidad de entrada y unidad de salida.

Si el valor es menor que el cero absoluto (ej. -274°C), lanza una excepción.

Si la unidad es inválida, lanza otra excepción.
 */


class Temperature {

    fun convert(value: Double, inputUnit: String, outputUnit: String): Double {
        val inputLower = inputUnit.lowercase()
        val outputLower = outputUnit.lowercase()

        val validUnits = listOf("celsius", "fahrenheit", "kelvin")

        if (inputLower !in validUnits || outputLower !in validUnits) {
            throw InvalidUnitException("Unidad inválida: $inputUnit o $outputUnit")
        }

        when (inputLower) {
            "celsius" -> if (value < -273.15) throw AbsoluteZeroException("No puede ser menor a -273.15°C")
            "fahrenheit" -> if (value < -459.67) throw AbsoluteZeroException("No puede ser menor a -459.67°F")
            "kelvin" -> if (value < 0) throw AbsoluteZeroException("No puede ser menor a 0K")
        }

        val valueInCelsius = when (inputLower) {
            "celsius" -> value
            "fahrenheit" -> (value - 32) * 5 / 9
            "kelvin" -> value - 273.15
            else -> throw InvalidUnitException("Unidad inválida")
        }

        val result = when (outputLower) {
            "celsius" -> valueInCelsius
            "fahrenheit" -> valueInCelsius * 9 / 5 + 32
            "kelvin" -> valueInCelsius + 273.15
            else -> throw InvalidUnitException("Unidad inválida")
        }

        return result
    }
}

fun main() {
    val temp = Temperature()

    try {
        print("Introduce el valor numérico de la temperatura: ")
        val value = readLine()!!.toDouble()

        print("Introduce la unidad de entrada (Celsius, Fahrenheit, Kelvin): ")
        val inputUnit = readLine()!!

        print("Introduce la unidad de salida (Celsius, Fahrenheit, Kelvin): ")
        val outputUnit = readLine()!!

        val result = temp.convert(value, inputUnit, outputUnit)
        println("Resultado: $value $inputUnit = $result $outputUnit")

    } catch (e: InvalidUnitException) {
        println("Error de unidad: ${e.message}")
    } catch (e: AbsoluteZeroException) {
        println("Error de temperatura: ${e.message}")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
