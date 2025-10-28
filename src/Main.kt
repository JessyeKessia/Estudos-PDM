import kotlin.arrayOf
import kotlin.collections.listOf


fun main() {


}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun mul(a:Int , b: Int) = a * b

fun printmul(a: Int, b: Int): Unit {
    println(mul(a, b))
}

// Difere o uso de && e and, assim como o || e or.
fun verififcaboolen(a: Boolean, b: Boolean) {
    if (a and b) {
        println("Ambos verdadeiros")
    } else {
        println("Pelo menos um é falso")
    }
}
// range com valor decrescedo e com pulo
fun ranges(valor: Int) {
    for (x in valor downTo 0 step 2) {
        println(x)
    }
}

