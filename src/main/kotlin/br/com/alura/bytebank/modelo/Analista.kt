package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    // 10% do salario
    override val bonificacao: Double get() = salario * 0.1
}