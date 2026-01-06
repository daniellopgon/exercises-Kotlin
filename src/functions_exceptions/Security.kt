package functions_exceptions

/*
Crea una función que reciba una contraseña como parámetro y verifique si es segura.

Debe cumplir:

Al menos 8 caracteres

Una mayúscula

Una minúscula

Un número

Si no cumple, lanza una excepción con un mensaje explicando por qué no es segura.
 */

class Security {

    fun validatePassword(password: String) {
        val charCount = password.length

        if (charCount < 8) {
            throw InsecurePasswordException("La contraseña no es segura: necesita al menos 8 caracteres")
        }

        if (!password.any { it.isUpperCase() }) {
            throw InsecurePasswordException("La contraseña debe contener al menos una letra mayúscula")
        }

        if (!password.any { it.isLowerCase() }) {
            throw InsecurePasswordException("La contraseña debe contener al menos una letra minúscula")
        }

        if (!password.any { it.isDigit() }) {
            throw InsecurePasswordException("La contraseña debe contener al menos un número")
        }

        println("Contraseña segura")
    }
}

fun main() {

    var test = "67543eF"

    var security = Security()

    try {
        security.validatePassword(test)
    } catch (e: InsecurePasswordException) {
        println("Excepción capturada: ${e.message}")
    }

}
