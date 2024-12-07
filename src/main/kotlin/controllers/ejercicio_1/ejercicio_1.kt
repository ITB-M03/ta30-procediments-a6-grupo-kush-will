package controllers.ejercicio_1

import java.util.Scanner

// Clase de datos para representar un punto
data class Punto(
    var x: Float,
    var y: Float
)

fun main() {

    val scan = inicioScanner()

    println("qué quieres hacer?")
    println("1. mostrar un punto")
    println("2. trasladar un punto")
    println("3. escalar un punto")
    println("4. Verificar si dos puntos son iguales")
    println("5. salir")

    when (scan.nextInt()){
        1 -> {
            val punto = pedirPunto(scan)
            mostrarPunto(punto)
        }
        2 -> {
            println("introduce los puntos iniciales:")
            val punto = pedirPunto(scan)
            println("introduce los puntos de desplazamiento:")
            val desplazamiento = pedirPunto(scan)
            trasladarPunto(punto, desplazamiento)
            println("puntos trasladados:")
            mostrarPunto(punto)
        }
        3 -> {
            println("Introduce el punto para escalar:")
            val punto = pedirPunto(scan)
            println("Introduce el factor de escala:")
            val factor = scan.nextFloat()
            escalarPunto(punto, factor)
            println("Después de escalar:")
            mostrarPunto(punto)
        }

        4 ->{
            println("Introduce el primer punto:")
            val punto1 = pedirPunto(scan)
            println("Introduce el segundo punto:")
            val punto2 = pedirPunto(scan)
            val resultado = sonPuntosIguales(punto1, punto2)
            if (resultado) {
                println("Los puntos son iguales.")
            } else {
                println("Los puntos no son iguales.")
            }
        }
        5 ->{
            println("saliendo del programa.")
        }
        else ->{
            println("opción no válida.")
        }
    }
    finalScanner(scan)
}

// Función para iniciar el Scanner
fun inicioScanner():Scanner{
    return Scanner(System.`in`)
}

// Función para pedir las coordenadas de un punto al usuario
fun pedirPunto(scan: Scanner):Punto{
    println("introduce la coordenada X:")
    val x = scan.nextFloat()
    println("introduce la coordenada Y:")
    val y = scan.nextFloat()
    return Punto(x, y)
}

// Función para mostrar un punto en el formato requerido
fun mostrarPunto(punto:Punto){
    val resultado = String.format("(%.6f, %.6f)", punto.x, punto.y)
    println("el punto es: $resultado")
}

// Función para trasladar un punto
fun trasladarPunto(punto: Punto, desplazamiento: Punto){
    punto.x += desplazamiento.x
    punto.y += desplazamiento.y
}

// Función para escalar un punto
fun escalarPunto(punto: Punto, factor: Float){
    punto.x *= factor
    punto.y *= factor
}

// Función para verificar si dos puntos son iguales
fun sonPuntosIguales(punto1: Punto, punto2: Punto): Boolean {
    return punto1.x == punto2.x && punto1.y == punto2.y
}

// Función para cerrar el Scanner
fun finalScanner(scan: Scanner){
    scan.close()
}
