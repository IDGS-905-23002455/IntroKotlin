fun main() {
    var diametro: Double

    do {
        print("Ingresa el diametro de la tuberia: ")
        diametro = readLine()?.toDoubleOrNull() ?: 0.0

        if (diametro <= 0) {
            println("Error: El diametro debe ser mayor a cero. Intenta nuevamente.")
        }

    } while (diametro <= 0)

    println("Diametro valido ingresado: $diametro")
    
}