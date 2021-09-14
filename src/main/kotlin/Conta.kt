open class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if(valor <= saldo){
            this.saldo -= valor
        } else {
            println("Saque da conta do titular $titular não permitido - Sem saldo disponível")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor)
            return true
        }
        return false
    }
}