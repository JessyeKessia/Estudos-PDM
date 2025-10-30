package Questionario2.questao_5

class Retangulo (val  largura: Double, val altura: Double) : FormaGeometrica{
    override fun calcularArea(): Double {
        return largura * altura
    }
}