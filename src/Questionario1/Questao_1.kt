package Questionario1

// 1. Escreva uma função que receba um número e verifique se ele é positivo, negativo ou zero. Use o IF como expressão.
fun verificaNumero(n: Int): String {
    var resultado  = if (n > 0) {
        "Positivo"
    } else if (n < 0) {
        "Negativo"
    } else {
        "Zero"
    }
    return resultado
}

// mais curto
fun verificaNumero2(n: Int): String = if (n > 0) "Positivo" else if (n < 0) "Negativo" else "Zero"