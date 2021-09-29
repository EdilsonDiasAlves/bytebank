package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val alex = Cliente(nome = "Alex", cpf = "717.474.440-06", senha = 4545)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "369.572.950-36", senha = 3377)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println("Conta: ${contaFran.numero} - Titular: ${contaFran.titular.nome} - Saldo: ${contaFran.saldo}")
    println("Conta: ${contaAlex.numero} - Titular: ${contaAlex.titular.nome} - Saldo: ${contaAlex.saldo}")

    var valorFran = 50.0
    var valorAlex = 70.0
    println("depositando $valorFran na conta de titular ${contaAlex.titular.nome}")
    contaAlex.deposita(valorFran)

    println("depositando $valorAlex na conta de titular ${contaFran.titular.nome}")
    contaFran.deposita(valorAlex)

    println("Saldo atualizado: Titular: ${contaFran.titular.nome} - Saldo: ${contaFran.saldo}")
    println("Saldo atualizado: Titular: ${contaAlex.titular.nome} - Saldo: ${contaAlex.saldo}")

    valorAlex = 500.0
    valorFran = 500.0
    println("saque em excesso ($valorAlex) na conta de titular ${contaAlex.titular.nome}")
    contaAlex.saca(valorAlex)

    println("saque em excesso ($valorFran) na conta de titular ${contaFran.titular.nome}")
    contaFran.saca(valorFran)

    println("Saldo atualizado: Titular: ${contaFran.titular.nome} - Saldo: ${contaFran.saldo}")
    println("Saldo atualizado: Titular: ${contaAlex.titular.nome} - Saldo: ${contaAlex.saldo}")

    valorAlex = 100.0
    valorFran = 100.0
    println("sacando ${valorAlex} na conta de titular ${contaAlex.titular.nome}")
    contaAlex.saca(valorAlex)

    println("sacando ${valorFran} na conta de titular ${contaFran.titular.nome}")
    contaFran.saca(valorFran)

    println("Saldo atualizado: Titular: ${contaFran.titular.nome} - Saldo: ${contaFran.saldo}")
    println("Saldo atualizado: Titular: ${contaAlex.titular.nome} - Saldo: ${contaAlex.saldo}")

    valorFran = 280.0
    println("Transferência de $valorFran da conta de titular ${contaFran.titular.nome} para o titular ${contaAlex.titular.nome}")

    try {
        contaFran.transfere(destino = contaAlex, valor = valorFran)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println(e.message)
        e.printStackTrace()
    }

    println("Saldo atualizado: Titular: ${contaFran.titular.nome} - Saldo: ${contaFran.saldo}")
    println("Saldo atualizado: Titular: ${contaAlex.titular.nome} - Saldo: ${contaAlex.saldo}")

    println(contaAlex.saldo)
    println(contaFran.saldo)
}