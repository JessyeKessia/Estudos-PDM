// 6. Crie uma lista mutável contendo vários nomes. A entrada de dados se encerrará quando o usuário digitar a palavra ‘fim’.
// Em seguida, crie uma expressão lambda e use-a no método forEach da lista, para filtrar e imprimir todos os nomes que comecem com a letra ‘B’.


fun entradaDados(){

    var lista = mutableListOf<String>()

    do {
        println("Digite um nome: ")
        val entrada = readln()
        if (entrada.lowercase() != "fim") {
            lista.add(entrada)
        }
    } while(entrada.lowercase() != "fim")


   lista.forEach { it -> if (it.startsWith("b", ignoreCase = true)) { println(it) } }
}