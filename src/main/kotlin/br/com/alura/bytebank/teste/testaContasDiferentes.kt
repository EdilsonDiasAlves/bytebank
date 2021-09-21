package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val mauro = Cliente(
        nome = "Mauro",
        cpf = "584.242.260-38",
        senha = 2266,
        endereco = Endereco(
            logradouro = "Av. Paulista",
            numero = 1400,
            bairro = "Bela Vista",
            cidade = "São Paulo",
            estado = "São Paulo",
            cep = "15370-496"
        )
    )

    val contaCorrente = ContaCorrente(
        titular = mauro,
        numero = 3075,
    )

    println("titular corrente")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("logradouro do titular ${contaCorrente.titular.endereco.logradouro}")
    println("numero do titular ${contaCorrente.titular.endereco.numero}")
    println("cidade do titular ${contaCorrente.titular.endereco.cidade}")

    val fran = Cliente(nome = "Fran", cpf = "369.572.950-36", senha = 3377)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 3078
    )

    println("titular poupança")
    println("nome do titular ${contaPoupanca.titular.nome}")
    println("cpf do titular ${contaPoupanca.titular.cpf}")

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.00)
    contaPoupanca.saca(100.00)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.00, contaCorrente)

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber poupança: ${contaCorrente.saldo}")
}