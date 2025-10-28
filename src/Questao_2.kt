// 2. Implemente uma função que receba a idade de uma pessoa e use o when para verificar e retornar à faixa etária de uma pessoa
// (criança, adolescente, adulto, idoso).

fun verificaIdade(idade: Int) {
    when {
        idade < 12 -> println("Criança")
        idade >= 12 && idade < 18 -> println("Adolescente")
        idade >= 18 && idade < 50 -> println("Adulto")
        idade >= 50 -> println("Idoso")

    }
}
// Como elas já estão printando fica mais fácil, já que não precisa dizer o tipo que retorna, não retorna nada
fun verificaIdade2(idade: Int) {
    when {
        idade in 0..11 -> println("Criança")
        idade in 12..17 -> println("Adolescente")
        idade in 18..50 -> println("Adulto")
        idade >= 50 -> println("Idoso")
    }
}