fun testaComportamentosConta() {

    val contaMaria = Conta(titular = "Maria", numeroConta = 41334)
    contaMaria.deposita(150.00)

    val contaPedro = Conta(numeroConta = 41335, titular = "Pedro")
    contaPedro.deposita(200.00)

    println("Titular: ${contaMaria.titular}")
    println("Número da conta: ${contaMaria.numeroConta}")
    println("Saldo: ${contaMaria.saldo} \n")

    println("Titular: ${contaPedro.titular}")
    println("Número da conta: ${contaPedro.numeroConta}")
    println("Saldo: ${contaPedro.saldo}\n")

    contaMaria.deposita(50.0)
    println("Saldo da conta do titular ${contaMaria.titular} após depósito: ${contaMaria.saldo}")

    contaPedro.deposita(75.0)
    println("Saldo da conta do titular ${contaPedro.titular} após depósito: ${contaPedro.saldo}")

    contaMaria.saca(120.0)
    println("Saldo da conta do titular ${contaMaria.titular} após saque: ${contaMaria.saldo}")

    contaPedro.saca(275.0)
    println("Saldo da conta do titular ${contaPedro.titular} após saque: ${contaPedro.saldo}")

    contaMaria.saca(150.0)
    contaPedro.saca(150.0)

    println("Saldo da conta do titular ${contaMaria.titular} após saque: ${contaMaria.saldo}")
    println("Saldo da conta do titular ${contaPedro.titular} após saque: ${contaPedro.saldo}")

    if (contaMaria.transfere(30.0, contaPedro)) {
        println("Transferência efetuada com sucesso")
    } else {
        println("Erro durante tentativa de transferência")
    }

    println("Saldo da conta do titular ${contaMaria.titular} após saque: ${contaMaria.saldo}")
    println("Saldo da conta do titular ${contaPedro.titular} após saque: ${contaPedro.saldo}")
}