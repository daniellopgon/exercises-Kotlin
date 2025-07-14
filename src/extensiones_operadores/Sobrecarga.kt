package extensiones_operadores

/*
Crea una clase Fraccion(numerador, denominador). Sobrecarga el operador + para poder sumar dos fracciones correctamente
(recuerda: a/b + c/d = (ad + bc)/bd).
 */

class Fraccion(val numerador: Int, val denominador: Int) {

    operator fun plus(other: Fraccion): Fraccion {
        val nuevoNumerador = this.numerador * other.denominador + other.numerador * this.denominador
        val nuevoDenominador = this.denominador * other.denominador
        return Fraccion(nuevoNumerador, nuevoDenominador)
    }

    override fun toString(): String {
        return "$numerador/$denominador"
    }
}
