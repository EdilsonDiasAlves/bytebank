class SistemaInterno {

    fun entra(funcionario: Autenticavel, senha: Int) {
        if(funcionario.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}