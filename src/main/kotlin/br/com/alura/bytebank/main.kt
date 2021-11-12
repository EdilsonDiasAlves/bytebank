package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
    soma(1, 2, resultado = (::println))

    val autenticavel = object: Autenticavel {
        val senha: Int = 1234
        override fun autentica(senha: Int): Boolean = this.senha === senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
            println("realizar Pagamento")
    }
}

fun soma (a: Int, b: Int, resultado: (c: Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}