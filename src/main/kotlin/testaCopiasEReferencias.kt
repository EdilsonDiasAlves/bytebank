fun testaCopiasEReferencias() {
    var valorX = 10
    var valorY = valorX
    valorY += 2

    println(valorX)
    println(valorY)

    val contaSilvio = ContaCorrente(titular = "Silvio", numero =  52311)
    val contaMarta = contaSilvio
    contaMarta.titular = "Marta"

    println("titular conta silvio: ${contaSilvio.titular}")
    println("titular conta marta: ${contaMarta.titular}")
}