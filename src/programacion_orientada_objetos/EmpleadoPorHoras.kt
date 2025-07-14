package programacion_orientada_objetos

class EmpleadoPorHoras(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    var horasTrabajadas: Int,
    var precioPorHora: Double
) : Empleado(nombre, edad, salarioBase) {

    override fun calcularSalarioFinal(): Double {
        return salarioBase + (horasTrabajadas * precioPorHora)
    }

    override fun mostrarIdentificador() {
        println("Empleado por Horas: $nombre, Edad: $edad")
    }
}