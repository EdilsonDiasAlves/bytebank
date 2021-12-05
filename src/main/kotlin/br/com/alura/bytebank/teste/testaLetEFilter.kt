package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaLetEFilter() {
    val endereco = Endereco(logradouro = "Rua dos Lírios", numero = 76, cidade = "São Paulo")

    endereco.apply {
        "logradouro: $logradouro, cidade: $cidade".toUpperCase()
    }.let(::println)

    val enderecos = listOf(
        Endereco(logradouro = "Rua das Rosas", complemento = "Viela A"),
        Endereco(logradouro = "Rua Jacareí"),
        Endereco(logradouro = "Rua das Candeiras", complemento = "Viela B"),
        Endereco(logradouro = "Rua dos Jequitibas")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)
}
