class SistemaInterno {

    fun entra(funcionario: FuncionarioAdmin, senha: Int) {
        if(funcionario.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}