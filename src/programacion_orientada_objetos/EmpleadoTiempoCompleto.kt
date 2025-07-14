package programacion_orientada_objetos

class EmpleadoTiempoCompleto(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    var bonoFijo: Double
) : Empleado(nombre, edad, salarioBase) {

    override fun calcularSalarioFinal(): Double {
        return salarioBase + bonoFijo
    }

    override fun mostrarIdentificador() {
        println("Empleado Tiempo Completo: $nombre, Edad: $edad")
    }
}