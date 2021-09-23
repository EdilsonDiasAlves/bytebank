package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjeto() {
    // object expression
    val laura = object : Autenticavel {
        val nome = "Laura"
        val cpf = "723.527.560-06"
        val senha = 8678

        override fun autentica(senha: Int): Boolean {
            return senha == this.senha
        }
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(laura, 8678)

    testaContasDiferentes()
    val diego = Cliente(nome = "Diego", cpf = "394.976.430-55", senha = 3422)
    val contaPoupanca = ContaPoupanca(titular = diego, numero = 1000)
    val contaCorrente = ContaCorrente(titular = diego, numero = 1001)

    println("Total de contas criadas: ${Conta.totalContas}")
}