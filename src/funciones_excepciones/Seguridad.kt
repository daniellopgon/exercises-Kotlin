package funciones_excepciones

/*
Crea una función que reciba una contraseña como parámetro y verifique si es segura.

Debe cumplir:

Al menos 8 caracteres

Una mayúscula

Una minúscula

Un número

Si no cumple, lanza una excepción con un mensaje explicando por qué no es segura.
 */

class Seguridad {

    fun password(passwd: String) {
        val numCaracteres = passwd.length

        if (numCaracteres < 8) {
            throw PasswordInseguraException("La contraseña no es segura: necesita al menos 8 caracteres")
        }

        if (!passwd.any { it.isUpperCase() }) {
            throw PasswordInseguraException("La contraseña debe contener al menos una letra mayúscula")
        }

        if (!passwd.any { it.isLowerCase() }) {
            throw PasswordInseguraException("La contraseña debe contener al menos una letra minúscula")
        }

        if (!passwd.any { it.isDigit() }) {
            throw PasswordInseguraException("La contraseña debe contener al menos un número")
        }

        println("Contraseña segura")
    }
}

fun main() {

    var prueba = "67543eF"

    var seguridad = Seguridad()

    try {
        seguridad.password(prueba)
    } catch (e: PasswordInseguraException) {
        println("Excepción capturada: ${e.message}")
    }

}