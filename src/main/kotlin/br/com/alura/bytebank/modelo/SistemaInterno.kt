package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(funcionario: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if(funcionario.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }
}