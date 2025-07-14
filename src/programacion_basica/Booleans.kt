package programacion_basica

/*
Declara tres variables booleanas: tieneDNI, mayorDeEdad, viveEnEspaña.
Luego, declara otra variable puedeVotar que sea el resultado de:
tieneDNI && mayorDeEdad && viveEnEspaña
Imprime el resultado con:
"¿Puede votar?: true"
 */

fun main() {

    val tieneDNI = true
    val mayorDeEdad = false
    val viveEnEspania = true

    val puedeVotar = tieneDNI && mayorDeEdad && viveEnEspania

    println("Puede votar: $puedeVotar")

}

