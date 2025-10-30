package Questionario2.questao_3

// 3. Crie uma classe base Veiculo com atributos marca e modelo e um método exibirInfo().
//Crie uma classe derivada Carro, que herda de Veiculo e adiciona o atributo quantidadePortas.
//Sobrescreva o método exibirInfo() na classe Carro.
//Crie instancias para Veiculo e Carro e teste os seus métodos.
//Crie a função top-level exibirDados(veiculo: Veiculo) que recebe qualquer tipo de veículo e imprime suas informações.
//Instancie objetos das classes Veiculo e Carro e use a função para testar o polimorfismo.

abstract class Veiculo(val marca: String, val modelo: String) {

    abstract fun exibirInfo():String

}