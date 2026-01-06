package object_oriented_programming

class FullTimeEmployee(
    name: String,
    age: Int,
    baseSalary: Double,
    var fixedBonus: Double
) : Employee(name, age, baseSalary) {

    override fun calculateFinalSalary(): Double {
        return baseSalary + fixedBonus
    }

    override fun showIdentifier() {
        println("Empleado Tiempo Completo: $name, Edad: $age")
    }
}
