package programacion_basica

/*
Declara tu nombre, tu edad y cuántos libros leíste este año. Crea una variable que calcule cuántos libros leerás si mantienes ese ritmo por 5 años. Imprime una frase como:
"Hola, me llamo Carlos, tengo 20 años y leeré 75 libros en 5 años."
 */

fun main() {

    val nombre = "Daniel"
    val edad = 33
    val numLibros = 3
    val anyo = 5

    val libAnyo = anyo * numLibros

    println("Hola, me llamo $nombre, tengo $edad años y leeré $libAnyo libros en $anyo años")

}


