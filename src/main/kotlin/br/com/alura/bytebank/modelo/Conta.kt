package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
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

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor)
            return true
        }
        return false
    }
}