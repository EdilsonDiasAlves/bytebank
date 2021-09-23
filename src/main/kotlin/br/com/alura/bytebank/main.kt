import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco1 = Endereco(
        logradouro = "Rua dos Guararapes",
        numero = 33,
        bairro = "Jardim Luzia",
        cidade = "Belo Horizonte",
        estado = "MG",
        cep = "00187-200"
    )
    val endereco2 = Endereco(
        logradouro = "Av Paulista",
        numero = 25,
        bairro = "Bela Vista",
        cidade = "São Paulo",
        estado = "SP",
        cep = "00120-300"
    )

    val endereco3 = Endereco(
        logradouro = "Av Paulista",
        numero = 25,
        bairro = "Bela Vista",
        cidade = "São Paulo",
        estado = "SP",
        cep = "00120-300"
    )

    println(endereco1.equals(endereco2))
    println(endereco1.equals(endereco1))
    println(endereco2.equals(endereco3))
    println(endereco1)
    println(endereco2)
    println(endereco3)
    println(endereco1.hashCode())
    println(endereco2.hashCode())
    println(endereco3.hashCode())

}

