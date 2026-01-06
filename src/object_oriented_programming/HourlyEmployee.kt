package object_oriented_programming

class HourlyEmployee(
    name: String,
    age: Int,
    baseSalary: Double,
    var hoursWorked: Int,
    var hourlyRate: Double
) : Employee(name, age, baseSalary) {

    override fun calculateFinalSalary(): Double {
        return baseSalary + (hoursWorked * hourlyRate)
    }

    override fun showIdentifier() {
        println("Empleado por Horas: $name, Edad: $age")
    }
}
