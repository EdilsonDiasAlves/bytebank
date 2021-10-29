package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")

    // Safe call
    val logradouro: String? = enderecoNulo?.logradouro

    // let - scope function que pode encadear chamadas com safe call e referencia o objeto do escopo com it
    enderecoNulo?.let {
        println(it.logradouro.length)

        val tamanhoComplemento: Int =
            // Elvis operator: Usa o valor ou outro especificado
            it.complemento.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    converteValor("")
    converteValor(1)
}

fun converteValor(valor: Any) {
    // Safe Cast
    val numero: Int? = valor as? Int
    println("Valor convertido: $numero")
}