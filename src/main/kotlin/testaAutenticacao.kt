fun testaAutenticacao() {
    val gerente = Gerente(
        "Paulo",
        "297.695.290-60",
        3000.0,
        1212
    )

    val diretora = Diretor(
        "Paulo",
        "903.583.610-36",
        5000.0,
        2121,
        200.0
    )

    val cliente = Cliente(
        "Francisco",
        "028.714.350-30",
        3333,
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1212)
    sistemaInterno.entra(diretora, 2121)
//    sistemaInterno.entra(cliente, 3333)
}