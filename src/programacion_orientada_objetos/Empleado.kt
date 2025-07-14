package programacion_orientada_objetos

/*
Crea un programa que modele un sistema de empleados de una empresa.

Debe incluir:

Una clase abstracta Empleado con propiedades comunes (nombre, edad, salario base) y un método abstracto calcularSalarioFinal().

Dos clases hijas:

EmpleadoTiempoCompleto: tiene un bono fijo.

EmpleadoPorHoras: tiene un número de horas y un precio por hora.

Una interfaz Identificable con un método mostrarIdentificador().

Crea una excepción EdadInvalidaException que se lance si se intenta crear un empleado con edad menor a 16.

Desde main, crea varios empleados, muestra su salario final y su identificador.
 */

abstract class Empleado(
    val nombre: String,
    val edad: Int,
    val salarioBase: Double
) : Identificable {

    init {
        if (edad < 16) {
            throw EdadInvalidaException("La edad mínima para ser empleado es 16.")
        }
    }

    abstract fun calcularSalarioFinal(): Double
}
