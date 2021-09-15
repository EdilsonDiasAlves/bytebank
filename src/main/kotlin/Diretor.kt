class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    // salario + 10% + plr
    override val bonificacao: Double get() = salario * 1.1 + plr

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}