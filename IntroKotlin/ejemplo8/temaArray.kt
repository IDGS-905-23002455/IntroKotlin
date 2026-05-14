/*
--- Tipo ----    ---Arreglo--
Int              IntArray
Double           DoubleArray
Float            FloatArray
Boolean          BooleanArray
*/

fun main() {
    // 1. Números
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println(numeros[0])

    // 2. Cadenas
    val nombres = arrayOf("Ana", "Luis", "Carlos")
    println(nombres[1])

    // 3. Recorrer arreglos
    val frutas = arrayOf("Manzana", "Pera", "Uva")
    for (fruta in frutas) { // Cambiado a 'fruta' para evitar conflicto
        println(fruta)
    }

    // 4. Arreglo vacío 
    val arregloVacio = Array(5) { 0 }
    println(arregloVacio.joinToString())

    // 5. Matriz
    val matriz = arrayOf(
        arrayOf(1, 2),
        arrayOf(3, 4)
    )
    println(matriz[1][0])
}