package colecciones

/*
Crea un Map<String, String> que almacene nombres de personas como clave y su número de teléfono como valor. Luego:

Permite buscar el número por nombre.
Permite añadir nuevos contactos.
Permite eliminar un contacto por nombre.
Muestra todos los contactos ordenados por nombre.
 */

class DiccionarioTelefonos(
    var diccionario: MutableMap<String, String> = mutableMapOf()
) {

    fun addNombreYtelefono(nombre: String, telefono: String) {
        diccionario[nombre] = telefono
    }

    fun buscarNumero(nombre: String): String {
        return diccionario[nombre] ?: "Contacto no encontrado"
    }

    fun borrarContacto(nombre: String) {
        if (diccionario.remove(nombre) != null) {
            println("Contacto $nombre eliminado.")
        } else {
            println("Contacto $nombre no encontrado.")
        }
    }

    fun ordenarContactos() {
        val ordenado = diccionario.toSortedMap()
        println("Contactos ordenados:")
        for ((nombre, telefono) in ordenado) {
            println("$nombre -> $telefono")
        }
    }
}

fun main() {
    val diccionario = DiccionarioTelefonos()

    diccionario.addNombreYtelefono("Dani", "6543321")
    diccionario.addNombreYtelefono("María", "65437654")
    diccionario.addNombreYtelefono("Carlos", "12345678")

    println("Buscar número de Dani: " + diccionario.buscarNumero("Dani"))

    diccionario.borrarContacto("María")

    diccionario.ordenarContactos()
}
