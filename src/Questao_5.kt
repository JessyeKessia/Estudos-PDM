 // 5. Escreva uma função que receba um valor e uma matriz. O programa deverá imprimir e quais posições estão o valor parametrizado.
 // Em seguida, faça um programa que gere uma matriz, identifique qual o seu maior e onde estão na matriz. Reuse a função da questão 4.

 // Primeira parte
 fun imprimirValores (valorfornecido: Int, matriz: List<List<Any>>) {
     for (linhas in matriz) {
         for ((index, valor) in linhas.withIndex())  {
             if (valor == valorfornecido) {
                 println("O valor $valorfornecido está na posição $index")
             }
         }
     }
 }
 fun imprimirValores2 (valorFornecido: Int, matriz: List<List<Int>>) {
     for (linhas in matriz) {
         for (index in linhas.indices) {
             if (linhas[index] == valorFornecido) {
                 println("O valor $valorFornecido está no indice $index")
             }
         }
     }
 }

 // Segunda parte
 fun GerarMatriz(): String {

     var matriz = mutableListOf<MutableList<Int>>()

     for (i in 0 .. 2) {
         var n = mutableListOf<Int>()
         for (j in 0.. 2) {
             val numero: Int = (1..200).random()
             n.add(numero)
         }
         matriz.add(n)
     }
     println(matriz)
     return maiorValorELugar(matriz)

 }


 fun maiorValorELugar(lista: MutableList<MutableList<Int>>): String {
     var maiorValor: Int = 0
     var indexMaiorValor: Int = 0

     for (linhas in lista) {
         for((index, valor) in linhas.withIndex()) {
             if (valor > maiorValor) {
                 maiorValor = valor
                 indexMaiorValor = index
             }
         }
     }
     return "O maior valor é $maiorValor e o index do maior valor é $indexMaiorValor"
 }