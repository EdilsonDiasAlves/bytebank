fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Mauro",
        numero = 3075
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 3078
    )

    val contaSalario = ContaSalario(
        titular = "Ricardo",
        numero = 3079
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)
    contaSalario.deposita(1000.00)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salario: ${contaSalario.saldo}")

    contaCorrente.saca(100.00)
    contaPoupanca.saca(100.00)
    contaSalario.saca(100.00)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")
    println("saldo após saque salario: ${contaSalario.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.00, contaCorrente)

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber poupança: ${contaCorrente.saldo}")

    /* Comentando linhas abaixo - conta salario nao deve poder fazer transferencias */
//    contaSalario.transfere(100.00, contaCorrente)
//
//    println("saldo salario após tranferir para corrente: ${contaSalario.saldo}")
//    println("saldo corrente após receber salario: ${contaSalario.saldo}")
}