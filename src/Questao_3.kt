// 3. Crie uma  função que receba um valor e uma lista de valores (de tamanho indefinido e com valores de diferentes tipos de dados).
// A função deverá retornar quantas ocorrências do valor aparecem na lista.

fun ocorrenciaValor(list:List<Any>, valor: Any): Int {
    var quantidadeRepete: Int = 0

    for (item in list) {
        if (item == valor) {
            quantidadeRepete++
        }
    }
    return quantidadeRepete
}
// muito curto, faz a contagem já dos valores que são iguais ao fornecido
fun ocorreciaValor2(lista: List<Any>, valor: Any): Int {
    return lista.count { it == valor }
}

// muito curto tambem, faz uma filtrangem criando outra lista e logo em seguida pega o tamanho da lista criada dos valores iguais
fun ocorrenciaValor3( lista: List<Any>, valor: Any): Int {
    return lista.filter { it == valor}.size
}