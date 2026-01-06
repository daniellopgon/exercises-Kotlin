package object_oriented_programming

fun main() {
    try {
        val emp1 = FullTimeEmployee("Luis", 30, 1500.0, 300.0)
        val emp2 = HourlyEmployee("Ana", 22, 800.0, 20, 15.0)
        val emp3 = FullTimeEmployee("Juan", 15, 1300.0, 200.0)

        val employees = listOf(emp1, emp2, emp3)

        for (employee in employees) {
            employee.showIdentifier()
            println("Salario final: ${employee.calculateFinalSalary()}")
            println()
        }

    } catch (e: InvalidAgeException) {
        println("Error al crear empleado: ${e.message}")
    }
}
