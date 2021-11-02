package br.com.alura.bytebank

import br.com.alura.bytebank.teste.calculaBonificacaoAnonima
import br.com.alura.bytebank.teste.calculaBonificacaoLambda
import br.com.alura.bytebank.teste.somaAnonima
import br.com.alura.bytebank.teste.somaLambda

fun main() {
    println(somaLambda(10, 15))
    println(somaAnonima(10, 10))

    println(calculaBonificacaoLambda(1100.0))
    println(calculaBonificacaoAnonima(1000.0))
}



