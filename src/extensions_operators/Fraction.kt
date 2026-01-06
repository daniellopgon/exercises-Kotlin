package extensions_operators

/*
Crea una clase Fraccion(numerador, denominador). Sobrecarga el operador + para poder sumar dos fracciones correctamente
(recuerda: a/b + c/d = (ad + bc)/bd).
 */

class Fraction(val numerator: Int, val denominator: Int) {

    operator fun plus(other: Fraction): Fraction {
        val newNumerator = this.numerator * other.denominator + other.numerator * this.denominator
        val newDenominator = this.denominator * other.denominator
        return Fraction(newNumerator, newDenominator)
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}
