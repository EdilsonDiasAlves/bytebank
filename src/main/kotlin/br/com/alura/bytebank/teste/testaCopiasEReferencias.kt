package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    var valorX = 10
    var valorY = valorX
    valorY += 2

    println(valorX)
    println(valorY)

    val silvio = Cliente(nome = "Silvio", cpf = "278.982.920-90", senha = 1155)
    val contaSilvio = ContaCorrente(titular = silvio, numero =  52311)
    val contaMarta = contaSilvio
    contaMarta.titular.nome = "Marta"

    println("titular conta silvio: ${contaSilvio.titular}")
    println("titular conta marta: ${contaMarta.titular}")
}