class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    // 5% do salario
    override val bonificacao: Double get() = salario * 0.05
}