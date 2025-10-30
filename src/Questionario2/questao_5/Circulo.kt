package Questionario2.questao_5

class Circulo (val raio: Double): FormaGeometrica {

    override fun calcularArea(): Double {
        return 3.14 * raio
    }
}