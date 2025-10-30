package Questionario2.questao_2

// 2. Crie uma classe ContaBancaria com atributos numero, titular e saldo.
//Implemente métodos depositar(valor: Double) e sacar(valor: Double).
// Esses métodos deverão lançar uma exceção, caso os valores dos seus parâmetros forem inválidos ou quando o saldo for insuficiente para o saque.
//Adicione um atributo de classe (companion object) para contar quantas contas foram criadas.
//Implemente um método de classe que mostre o número total de contas criadas até o momento.
//Crie duas contas e testes dos métodos das instâncias e da classe.


class ContaBancaria(val numero: String, val titular: String, var saldo: Double) {

    // atributo de classe, a mesma coisa que um atributo estático. Logo, ESSE ATRIBUTO PERTENCE A CLASSE e não a um objeto específico.
    // Precisa ta dentro de um init para ser inicializado e chamar o método estático
    init {
        incrementar()
    }

    constructor(numero: String, titular: String) : this(numero, titular, saldo = 0.0)

    fun depositar(valor: Double) {
        if (valor <= 0 ) {
            println("Valor inválido.")
        } else {
            saldo += valor
            println("Valor $valor depositado com sucesso")
        }
    }

    fun sacar(valor: Double) {
        if (valor <= 0 || valor > saldo) {
            println("Valor inválido.")
        } else {
            saldo-= valor
            println("Valor $valor sacado com sucesso")
        }
    }
    // métodos de classe mostrando o total de contas criadas
    companion object {
        var total: Int = 0

        fun incrementar() {
            total++
        }
        fun contasCriadas(): Int {
            return total
        }
    }
}