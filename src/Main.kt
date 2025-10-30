import Questionario2.questao_4.Gerente
import Questionario2.questao_3.Veiculo
import Questionario2.questao_3.Carro

fun main() {
//    val gerente = Gerente("Jessye", 10040.0, 32323.5)
//
//    println("Nome: ${gerente.nome}")
//    println("Salário base: R$${gerente.salarioBase}")
//    println("Bônus: R$1200.0")
//    println("Salário total: R$${gerente.calcularSalario()}")

    val carro1 = Carro("Toyota", "Corolla", 4)

    println("Usando a função top-level exibirDados para testar polimorfismo:")
    println(carro1.exibirDados(carro1))

//    val l = ContaBancaria("123", "jessye", 40.0)
//    val c = ContaBancaria("5343", "Kaliana", 534.0)
//
//    println("Da certo")
//    println(c.sacar(5.0))
//
//    println("Erro")
//    println(l.depositar(-54.0))
//
//    println("Erro")
//    println(l.sacar(60.0))
//
//    println("Erro")
//    println(c.depositar(-54.0))
//
//    println("Da certo")
//    println(c.depositar(54.0))
//
//    println("Total de contas criadas: ${ContaBancaria.contasCriadas()}")

}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun mul(a:Int , b: Int) = a * b

fun printmul(a: Int, b: Int): Unit {
    println(mul(a, b))
}

// Difere o uso de && e and, assim como o || e or.
fun verififcaboolen(a: Boolean, b: Boolean) {
    if (a and b) {
        println("Ambos verdadeiros")
    } else {
        println("Pelo menos um é falso")
    }
}
// range com valor decrescedo e com pulo
fun ranges(valor: Int) {
    for (x in valor downTo 0 step 2) {
        println(x)
    }
}

