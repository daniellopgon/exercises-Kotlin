# Ejercicios Kotlin 1DAM

Este repositorio contiene una colección de ejercicios de programación en Kotlin desarrollados durante el primer curso de Desarrollo de Aplicaciones Multiplataforma. Los ejercicios están organizados por temáticas y cubren desde conceptos básicos hasta programación orientada a objetos avanzada.

## Estructura del proyecto

El código fuente se encuentra en la carpeta src y está dividido en diferentes paquetes según el tema que aborda cada ejercicio.

### Programación básica

El paquete basic_programming contiene ejercicios introductorios para familiarizarse con el lenguaje. Incluye programas para trabajar con variables booleanas y votación, calcular el índice de masa corporal, practicar string templates y calcular importes totales con IVA.

### Estructuras de control

En control_structures se encuentran ejercicios que practican el uso de condicionales y bucles. Hay implementaciones de un clasificador de edades, cálculo de promedios de notas, un menú de calculadora, detección de números primos y generación de triángulos con caracteres.

### Arrays

El paquete arrays contiene ejercicios que trabajan con estructuras de datos. Incluye el cálculo del promedio, mínimo y máximo de una serie de números, rotación de elementos, detección de duplicados, suma de filas y columnas en matrices, y trabajo con diagonales principales y secundarias.

### Colecciones

En collections se practican las estructuras de datos de Kotlin Collections. Hay una agenda telefónica implementada con Map, una lista ordenada con eliminación de duplicados y un subpaquete statistics con cálculos estadísticos como suma, media, máximo, mínimo y conteo de pares e impares.

### Coroutines

El paquete coroutines contiene ejercicios que utilizan programación asíncrona con coroutines de Kotlin. Incluye una barra de carga cancelable, un contador en segundo plano, descarga paralela de archivos simulados y llamadas a API en paralelo usando async/await.

### Extensiones y operadores

En extensions_operators se practican las funciones de extensión y la sobrecarga de operadores. Hay una función de extensión para detectar palíndromos en String, otra para calcular el promedio de números impares en List<Int> y una clase Fraction con el operador + sobrecargado para sumar fracciones.

### Archivos

El paquete files contiene ejercicios de entrada/salida con archivos. Incluye análisis de texto contando palabras y ocurrencias, registro de nombres en archivo de texto y registro de productos en formato CSV con ordenación por precio.

### Funciones y excepciones

En functions_exceptions se trabajan funciones avanzadas y manejo de excepciones. Hay un analizador de texto que cuenta palabras, letras y dígitos, una calculadora de diferencia entre fechas, un conversor de temperaturas con validación, un validador de contraseñas seguras y excepciones personalizadas como AbsoluteZeroException, InvalidUnitException e InsecurePasswordException.

### Expresiones lambda

El paquete lambda contiene ejercicios que utilizan programación funcional con funciones de orden superior. Los ejercicios trabajan con listas de frutas para filtrar y transformar, listas de números para calcular cuadrados y sumas, y listas de productos para ordenar y filtrar por precio.

### Programación orientada a objetos

El paquete object_oriented_programming introduce los conceptos de POO con herencia e interfaces. Contiene una clase abstracta Employee con propiedades comunes y un método abstracto para calcular el salario final. De ella heredan FullTimeEmployee con bono fijo y HourlyEmployee con pago por horas trabajadas. La interfaz Identifiable define el contrato para mostrar identificadores y la excepción InvalidAgeException valida la edad mínima para ser empleado.

## Requisitos

Para ejecutar los ejercicios es necesario tener instalado Kotlin 1.9 o superior y un JDK 17 o superior. Los ejercicios del paquete coroutines requieren la dependencia kotlinx-coroutines-core.

## Ejecución

Cada clase que contiene una función main puede ejecutarse de forma independiente. Se recomienda usar un IDE como IntelliJ IDEA para facilitar la navegación y ejecución de los ejercicios.
