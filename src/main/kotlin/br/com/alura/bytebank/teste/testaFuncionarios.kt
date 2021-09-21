package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {
    val mauro = Analista(
        nome = "Mauro",
        cpf = "092.320.900-07",
        salario = 2000.00
    )

    println("Nome: ${mauro.nome}")
    println("CPF: ${mauro.cpf}")
    println("Salário: ${mauro.salario}")
    println("Bonificação: ${mauro.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "873.474.080-59",
        salario = 2000.00,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "050.371.260-45",
        salario = 4000.00,
        senha = 4321,
        plr = 200.00
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(4321)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "693.101.760-83",
        salario = 2000.00
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")

    val pedro = Auxiliar(
        nome = "Pedro",
        cpf = "771.665.870-08",
        salario = 1000.00
    )

    println("Nome: ${pedro.nome}")
    println("CPF: ${pedro.cpf}")
    println("Salário: ${pedro.salario}")
    println("Bonificação: ${pedro.bonificacao}")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(mauro)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    calculadora.registra(pedro)

    println("Total de bonificação: ${calculadora.total}")
}