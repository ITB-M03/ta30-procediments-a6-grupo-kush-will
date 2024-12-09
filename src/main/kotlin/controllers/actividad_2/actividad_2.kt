package controllers.actividad_2

import controllers.ejercicio_1.trasladarPunto
import java.util.*

fun main() {
    val scan = inicioscan()
    val filas: Int = 20
    val columnas: Int = 15
    val matrix = Array(filas) {
        CharArray(columnas) { '_' }
    }
    //iremos recorriendo la matriz y la printaremos
    for (i in 0..filas) {
        for (j in 0..columnas) {
            matrix[i][j] = '_'
            println(matrix[i][j])
        }
    }
    buidaSala(matrix)
    val asientosDisponibles = seientsDisponibles(matrix)
    val asientosReservados = reserva(matrix)
    println(menuCinema(scan,matrix))
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
    when (scan.nextInt()) {
        1 -> {
            buidaSala(matrix)
        }

        2 -> {
            println(seientsDisponibles(matrix))
        }

        3 -> {
            println(reserva(matrix))
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
            matrix[i][j] = '_'
            println(matrix[i][j])
        }
    }

}


fun reserva(salaBuida: Array<CharArray>): Array<CharArray> {
    //recorreremos la matriz y donde nos diga las coordenada la cambiaremos por una X
    println("Dame las coordenadas para reservar tu asiento")
    val scanner = Scanner(System.`in`)
    println("Introduce el numero de Fila:")
    val numF = scanner.nextInt()
    println("Introduce el numero de Columna:")
    val numC = scanner.nextInt()
    val matrix = Array(numF) {
        CharArray(numC) { '_' }
    }
    for (i in 0..numF) {
        for (j in 0..numC) {
            if (numF >= 20 && numC >= 15) {
                println("ERROR")
            } else if (numF <= 20 && numC <= 15 && numF > 0 && numC > 0) {
                if (i == numF && j == numC) {
                    matrix[i][j] = 'X'
                }
            }
        }
    }
    return reserva(salaBuida)
}

fun finalscan(scan: Scanner) {
    scan.close()
}

//no se pueden hacer testeos unitario porque los paramentros de los valores no se pueden cambiar