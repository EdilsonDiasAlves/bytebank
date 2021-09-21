package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
): Conta(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(valorComTaxa <= saldo){
            this.saldo -= valorComTaxa
        }
    }
}