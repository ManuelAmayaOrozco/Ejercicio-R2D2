fun main(args: Array<String>) {
    val posini = mutableListOf(0, 0)
    val mov = listOf(10, 5, -2)
    val dir = "Arriba"
    print(moverRobot(mov, posini, dir))
}

/**
 * Operación donde el robot se mueve dependiendo del número de movimientos introducidos y la dirección inicial.
 *
 * @param mov List<Int> - Los pasos que se desea que el robot use.
 * @param posini Mutable<List> - La posición inicial del robot.
 * @param dir String - La dirección inicial del robot.
 *
 * @return Retorna un texto indicando la posición y dirección final del robot.
 */
fun moverRobot(mov: List<Int>, posini: MutableList<Int>, dir: String): String {
    var direc = dir
    println("La posición inicial es: X = ${posini[0]} Y = ${posini[1]}. R2D2 está mirando hacia: $direc.")
    for (movi in mov) {
        if (direc == "Arriba") {
            posini[1] += movi
            direc = "Izquierda"
            println("La posición actual es: X = ${posini[0]} Y = ${posini[1]}. R2D2 ahora está mirando hacia: $direc.")
        }
        else if (direc == "Izquierda") {
            posini[0] -= movi
            direc = "Abajo"
            println("La posición actual es: X = ${posini[0]} Y = ${posini[1]}. R2D2 ahora está mirando hacia: $direc.")
        }
        else if (direc == "Abajo") {
            posini[1] -= movi
            direc = "Derecha"
            println("La posición actual es: X = ${posini[0]} Y = ${posini[1]}. R2D2 ahora está mirando hacia: $direc.")
        }
        else if (direc == "Derecha") {
            posini[0] += movi
            direc = "Arriba"
            println("La posición actual es: X = ${posini[0]} Y = ${posini[1]}. R2D2 ahora está mirando hacia: $direc.")
        }
    }
    return ("La posición final de R2D2 es: X = ${posini[0]} Y = ${posini[1]}  y se queda mirando hacia: $direc.")
}