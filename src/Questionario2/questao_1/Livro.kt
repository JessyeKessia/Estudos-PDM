package Questionario2.questao_1

class Livro(val titulo: String, val autor: String, var anoPublicacao: Int) {

    init {
       if (anoPublicacao != null && (anoPublicacao < 0 || anoPublicacao > 2025)) {
           println("Ano de publicação inválido")
       }
    }
    constructor(titulo: String, autor: String) : this(titulo, autor, anoPublicacao = 2020)

    fun imprimirDados(): String {
        return "tiutlo: $titulo; tiutlo: $autor, tiutlo: $anoPublicacao"
    }
}

// 1. Implemente uma classe Livro com os atributos titulo, autor e anoPublicacao.
// Crie um método que imprima os dados do livro em formato de ficha bibliográfica.
//  A classe deve ter um construtor secundário. Lance uma exceção caso seja criado um livro com um ano de publicação inválido.

