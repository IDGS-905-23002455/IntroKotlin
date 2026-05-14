import kotlin.math.PI

fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2

}

fun areaCirculo(radio: Double): Double {
    return 3.1416 * radio * radio
}

fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main() {

    var opcion: Int

    do {
        limpiarPantalla()

        println("----- MENU DE AREAS -----")
        println("1. Area del cuadrado")
        println("2. Area del rectangulo")
        println("3. Area del triangulo")
        println("4. Area del circulo")
        println("5. Salir")
        print("Seleccione una opcion: ")
        opcion = readln().toInt()

        when (opcion) {

            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val lado = readln().toDouble()

                println("Area del cuadrado: ${
                    String.format("%.2f", areaCuadrado(lado))
                }")
            }

            2 -> {
                print("Ingrese la base del rectangulo: ")
                val base = readln().toDouble()

                print("Ingrese la altura del rectangulo: ")
                val altura = readln().toDouble()

                println("Area del rectangulo: ${
                    String.format("%.2f", areaRectangulo(base, altura))
                }")
            }

            3 -> {
                print("Ingrese la base del triangulo: ")
                val base = readln().toDouble()

                print("Ingrese la altura del triangulo: ")
                val altura = readln().toDouble()

                println("Area del triangulo: ${
                    String.format("%.2f", areaTriangulo(base, altura))
                }")
            }

            4 -> {
                print("Ingrese el radio del circulo: ")
                val radio = readln().toDouble()

                println("Area del circulo: ${
                    String.format("%.2f", areaCirculo(radio))
                }")
            }

            5 -> {
                println("Programa finalizado")
            }

            else -> {
                println("Opcion no valida")
            }
        }

        if (opcion != 5) {
            println("\nPresione ENTER para continuar...")
            readln()
        }

    } while (opcion != 5)
}