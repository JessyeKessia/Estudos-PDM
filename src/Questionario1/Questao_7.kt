package Questionario1//7. Crie uma função que receba, via parâmetro, um nome (que pode ser nulo) e imprima uma saudação personalizada,
// apenas se o nome não for nulo.

fun saudar1(nome: String?) {
    if (nome != null) {
        println("OLá, $nome")
    }
}

fun saudar2(nome: String?) {
    nome?.let { println("Olá, $it! Seja bem-vindo(a)!") }
        ?: println("COLOCA ALGO POXA")
}