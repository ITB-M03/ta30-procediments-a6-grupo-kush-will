package controllers.actividad_2

import java.util.*

fun main() {
    val scan = inicioscan()
    val filas: Int = 20
    val columnas: Int = 15
    val matrix = Array(filas) {
        CharArray(columnas) { '_' }
    }
    //iremos recorriendo la matriz y la printaremos
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrix[i][j] = '_'
        }
    }
    val casos  = scan.nextInt()
    repeat(casos) {
        menuCinema(scan, matrix)
    }

    finalscan(scan)
}

fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}

fun menuCinema(scan: Scanner, matrix: Array<CharArray>) {
    println("Selecciona alguna de estas 3 opciones")
    println("1 - Buidar sala")
    println("2 - Visualitzar seients disponibles")
    println("3 - Reserva de Seients")
    println("4 - Salir de la reserva")
    when (scan.nextInt()) {
        1 -> {
            buidaSala(matrix)
        }

        2 -> {
            seientsDisponibles(matrix)
        }

        3 -> {
            reserva(matrix)
        }
        4 -> {
            salir(matrix)
        }
    }
}

fun buidaSala(matrix: Array<CharArray>) {
    /*aqui definiremos la matriz que seran los asientos que haya en la sala
como las filas y las columnas estan determinadas poir el problema no nos hace falta pedirlo*/
    //creamos la matriz
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            matrix[i][j] = '_'
        }
    }
}

fun seientsDisponibles(matrix: Array<CharArray>) {
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            print(matrix[i][j] + " ")
        }
        println()
    }

}


fun reserva(sala: Array<CharArray>){
    //recorreremos la matriz y donde nos diga las coordenada la cambiaremos por una X
    println("Dame las coordenadas para reservar tu asiento")
    val scanner = Scanner(System.`in`)
    println("Introduce el numero de Fila:")
    val numF = scanner.nextInt()
    println("Introduce el numero de Columna:")
    val numC = scanner.nextInt()
    if (numF >= 20 || numC >= 15) {
        println("ERROR")
    }
    else if (numF <= 20 && numC <= 15 && numF > 0 && numC > 0) {
        sala[numF][numC] = 'X'
    }
    else if (sala[numF][numC] == 'X'){
        println("Ya esta reservado")
    }
}
fun salir(matrix: Array<CharArray>) {
    println("Gracias por usar el sistema de reservas de cine. ¡Hasta pronto!")
    System.exit(0) // Finaliza el programa.
}

fun finalscan(scan: Scanner) {
    scan.close()
}

//no se pueden hacer testeos unitario porque los paramentros de los valores no se pueden cambiar