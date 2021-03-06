package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
):Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var totalContas: Int = 0
            private set
    }

    init {
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {

        if (saldo < valor) throw SaldoInsuficienteException(
            mensagem = "O saldo é insuficiente. Saldo em conta: $saldo - Valor da transferência: $valor")
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        this.saldo -= valor;
        destino.deposita(valor)
    }

    override fun autentica(senha: Int): Boolean {
        return this.titular.autentica(senha)
    }
}