
fun main()
{
    println("Ingresa el sueldo del empleado")
    val sueldo = readln().toDouble()
    if(sueldo > 3000){
        println("Paga Inpuestos")
    }
    else
    println("No paga impuestos")

    val a = 3
    val b = 5

    val mayor = if (a > b) a else b
    println("El numer mayor entre $a y $b es $mayor")
}

/*
>, < <=, >=, ==, !=
+, -, *, /, %
*/


