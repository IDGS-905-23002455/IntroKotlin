/*
definicion de rangos
val unDigito = 1..9 
val letras = 'a1'... 'z'

val docena = 1..12

if (S in docena)
println ("El numero 5 esta en el rando docena"

if (18 !in docena)
println ("El 18 no  esta en el rando docena"
*/

fun main() {

    for (i in 1..10)
        println(i)

    for (i in 1..10 step 2)
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 10 downTo 1 step 2)
        println(i)
}

