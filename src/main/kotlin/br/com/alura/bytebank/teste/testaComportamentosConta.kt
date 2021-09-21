package br.com.alura.bytebank.teste

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

    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular.nome)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta de titular ${contaAlex.titular.nome}")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta de titular ${contaFran.titular.nome}")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta de titular ${contaAlex.titular.nome}")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta de titular ${contaFran.titular.nome}")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta de titular ${contaAlex.titular.nome}")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta de titular ${contaFran.titular.nome}")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta de titular ${contaFran.titular.nome} para o titular ${contaAlex.titular.nome}")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}