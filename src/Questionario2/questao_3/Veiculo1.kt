package Questionario2.questao_3


abstract class Veiculo4 (
    val marca: String,
    val modelo: String) {


    abstract fun exibirInfo(): String
}

class Carro3(marca: String, modelo: String, val quantidadePortas: Int) : Veiculo(marca, modelo) {


    override fun exibirInfo(): String {
        return "Carro é do modelo $modelo e da marca $marca e tem $quantidadePortas portas"
    }
    fun exibirDados(v: Veiculo): String {
        return v.exibirInfo()
    }
}

//abstract class Veiculo2 () {
//    abstract val marca: String
//    abstract val modelo: String
//
//    abstract fun exibirInfo(): String
//}
//
//// Quando você herda dentro dessa construção, precisa inicializar os atributos
//class Carro2 : Veiculo2() {
//    override val marca: String = ""
//    override val modelo: String = ""
//    val quantidadePortas: Int = 0
//
//    override fun exibirInfo(): String {
//        return "Carro é do modelo $modelo e da marca $marca e tem $quantidadePortas portas"
//    }
//    fun exibirDados(v: Veiculo): String {
//        return v.exibirInfo()
//    }
//}
