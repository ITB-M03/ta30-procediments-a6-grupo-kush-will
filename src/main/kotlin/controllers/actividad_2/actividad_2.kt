package controllers.actividad_2
import java.util.*

fun main () {
    val scan = inicioscan()
    println(menuCinema(scan))
    val salaBuida = buidarSala(20,15)
    val asientosDisponibles = seientsDisponibles()
    val asientosReservados = reserva()
    finalscan(scan)
}
fun inicioscan ():Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}

fun menuCinema(scan: Scanner) {
    println("Selecciona alguna de estas 3 opciones")
    println()
    println("1 - Buidar sala")
    println()
    println("2 - Visualitzar seients disponibles")
    println()
    println("3 - Reserva de Seients")
    val pedirNumero = scan.nextInt()
    if (pedirNumero == 1) {
        println(buidarSala())
    }
    if (pedirNumero == 2) {
        println(seientsDisponibles())
    }
    if (pedirNumero == 3) {
        println(reserva(salaBuida))
    }
}

fun buidarSala() {
    /*aqui definiremos la matriz que seran los asientos que haya en la sala
    como las filas y las columnas estan determinadas poir el problema no nos hace falta pedirlo*/
    val filas = 20
    val columnas = 15
    //creamos la matriz
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
}

fun seientsDisponibles() {
    println(reserva(salaBuida ))
}


fun reserva (salaBuida:Array<Char>) {
    val matrix2: Array<Char> = salaBuida
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
    }

fun finalscan (scan:Scanner){
    scan.close()
}

//no se pueden hacer testeos unitario porque los paramentros de los valores no se pueden cambiar