fun main() {
    val claveCorrecta = "1234"
    var intentos = 0
    var acceso = false

    while (intentos < 3) {
        print("Ingresa la clave de seguridad: ")
        val clave = readLine()!!

        if (clave == claveCorrecta) {
            acceso = true
            break
        } else {
            intentos++
            println("Clave incorrecta. Intentos fallidos: $intentos")
        }
    }

    if (acceso) {
        println("Acceso concedido.")
    } else {
        println("Sistema bloqueado tras 3 intentos fallidos.")
    }
}