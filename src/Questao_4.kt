// 4. Escreva uma função que receba uma matriz e retorne qual o seu maior valor.

fun maiorValor(lista: List<List<Int>>): Int {
    var maiorValor: Int = 0
    for (linhas in lista) {
        for (coluna in linhas) {
            if (coluna > maiorValor) {
                maiorValor = coluna
            }
        }
    }
    return maiorValor
}
// flatten() transforma Array<Array<Int>> → List<Int> (junta tudo em uma lista só)
fun maiorValor2(lista: List<List<Int>>): Int? {
    return lista.flatten().maxOrNull()
}
// maxOf em lista pega o maior valor entre as linhas, Já o segundo maxOf pega o maior valor dentro da linha
fun maiorValor3(lista: List<List<Int>>): Int {
    return lista.maxOf { linha -> linha.maxOf { it } }
}