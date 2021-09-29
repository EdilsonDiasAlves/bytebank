package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
): Conta(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        val taxa = 0.1
        println("--- Atenção. Para saque de conta corrente, é cobrado taxa de $taxa ---")
        val valorComTaxa = valor + taxa
        if(valorComTaxa <= saldo){
            this.saldo -= valorComTaxa
        }
    }
}