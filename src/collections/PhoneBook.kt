package collections

/*
Crea un Map<String, String> que almacene nombres de personas como clave y su número de teléfono como valor. Luego:

Permite buscar el número por nombre.
Permite añadir nuevos contactos.
Permite eliminar un contacto por nombre.
Muestra todos los contactos ordenados por nombre.
 */

class PhoneBook(
    var dictionary: MutableMap<String, String> = mutableMapOf()
) {

    fun addNameAndPhone(name: String, phone: String) {
        dictionary[name] = phone
    }

    fun searchNumber(name: String): String {
        return dictionary[name] ?: "Contacto no encontrado"
    }

    fun deleteContact(name: String) {
        if (dictionary.remove(name) != null) {
            println("Contacto $name eliminado.")
        } else {
            println("Contacto $name no encontrado.")
        }
    }

    fun sortContacts() {
        val sorted = dictionary.toSortedMap()
        println("Contactos ordenados:")
        for ((name, phone) in sorted) {
            println("$name -> $phone")
        }
    }
}

fun main() {
    val phoneBook = PhoneBook()

    phoneBook.addNameAndPhone("Dani", "6543321")
    phoneBook.addNameAndPhone("María", "65437654")
    phoneBook.addNameAndPhone("Carlos", "12345678")

    println("Buscar número de Dani: " + phoneBook.searchNumber("Dani"))

    phoneBook.deleteContact("María")

    phoneBook.sortContacts()
}
