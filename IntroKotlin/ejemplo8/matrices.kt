fun main() {

    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println(" INGRESA LA MATRIZ 1")

    for(i in 0..2){
        for(j in 0..2){
            print("Ingrese valor [${i}][${j}]: ")
            matriz1[i][j] = readln().toInt()
        }
    }

    println("\n INGRESA LA MATRIZ 2")

    for(i in 0..2){
        for(j in 0..2){
            print("Ingrese valor [${i}][${j}]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    for(i in 0..2){
        for(j in 0..2){
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nRESULTADO DE LA SUMA")

    for(i in 0..2){
        for(j in 0..2){
            print("${resultado[i][j]} ")
        }
        println()
    }
}