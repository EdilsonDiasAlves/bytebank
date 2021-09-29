package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpression() {
    val entrada = "1.0"

    val valorConvertido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorConvertido != null) {
        valorConvertido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}