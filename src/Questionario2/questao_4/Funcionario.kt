package Questionario2.questao_4
// 4. Implemente a classe abstrata Funcionario com os atributos nome e salarioBase.
//Crie uma subclasse Gerente com um atributo adicional bonus.
//Crie um método que calcule o salário total considerando o bônus, sobrescrevendo se necessário.


abstract class Funcionario (val nome: String, var salarioBase: Double){

    abstract fun calcularSalario(): Double
}