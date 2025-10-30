package Questionario2.questao_3

class Carro(marca: String, modelo: String, val quantidadePortas: Int) : Veiculo(marca, modelo) {

    override fun exibirInfo(): String {
        return "O carro da marca $marca e do modelo $modelo tem $quantidadePortas portas."
    }

    fun exibirDados(veiculo: Veiculo): String {
        return veiculo.exibirInfo()
    }
}