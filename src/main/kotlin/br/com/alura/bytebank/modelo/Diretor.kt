package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    // salario + 10% + plr
    override val bonificacao: Double get() = salario * 1.1 + plr
}