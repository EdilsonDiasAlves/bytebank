fun testaLacos() {

    var i = 0
    while (i < 5) {
        val conta: Int = 100 + i
        var saldo: Double = i + 10.0

        println("O saldo da conta $conta é $saldo")
        i++
    }

    for (i in 5 downTo 1 step 2) {
        val conta = 100 + i;
        var saldo = i + 10.0

        println("O saldo da conta $conta é $saldo")
    }
}