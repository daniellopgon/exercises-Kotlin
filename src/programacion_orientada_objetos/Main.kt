package programacion_orientada_objetos

fun main() {
    try {
        val emp1 = EmpleadoTiempoCompleto("Luis", 30, 1500.0, 300.0)
        val emp2 = EmpleadoPorHoras("Ana", 22, 800.0, 20, 15.0)
        val emp3 = EmpleadoTiempoCompleto("Juan", 15, 1300.0, 200.0)  // Lanzará excepción

        val empleados = listOf(emp1, emp2, emp3)

        for (empleado in empleados) {
            empleado.mostrarIdentificador()
            println("Salario final: ${empleado.calcularSalarioFinal()}")
            println()
        }

    } catch (e: EdadInvalidaException) {
        println("Error al crear empleado: ${e.message}")
    }
}