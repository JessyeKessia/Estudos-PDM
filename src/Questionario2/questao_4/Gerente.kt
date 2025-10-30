package Questionario2.questao_4

class Gerente(nome: String, salarioBase: Double, var bonus: Double) : Funcionario(nome, salarioBase) {

    override fun calcularSalario(): Double {
        return salarioBase + bonus
    }
}