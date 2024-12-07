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
        println(buidarSala(20,15))
    }
    if (pedirNumero == 2) {
        println(seientsDisponibles())
    }
    if (pedirNumero == 3) {
        println(reserva())
    }
}

fun buidarSala(filas:Int, columnas:Int, matrix : Array<Char>) {
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

fun seientsDisponibles(){
    println(buidarSala(20,15))
}

fun reserva (){
    //volveremos a recorrer la matriz y pediremos las cordenadas al usuario para la reserva
    val scan = Scanner(System.`in`)
    var numf = scan.nextInt()
    val numC = scan.nextInt()


}

fun finalscan (scan:Scanner){
    scan.close()
}

//no se pueden hacer testeos unitario porque los paramentros de los valores no se pueden cambiar