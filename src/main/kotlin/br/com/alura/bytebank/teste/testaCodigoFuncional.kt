package br.com.alura.bytebank.teste

fun testaFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(10, 5))
}

fun soma(a: Int, b: Int): Int = a + b

fun testaFuncaoClasse() {
    val minhaFuncaoClasse = Soma()
    println(minhaFuncaoClasse(10, 10))
}

class Soma: (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}

val somaLambda = {a: Int, b: Int ->
    a + b
}

val somaAnonima = fun(a: Int, b: Int): Int {
    return a + b
}

// Label necessaria em lambdas quando existe mais de uma possibilidade de retorno
val calculaBonificacaoLambda: (Double) -> Double = lambda@{salario ->
    if(salario > 1000.0) {
        return@lambda salario + 50.0
    }
    salario + 100
}

val calculaBonificacaoAnonima: (Double) -> Double = fun(salario): Double {
    if(salario > 1000.0) {
        return salario + 50.0
    }
    return salario + 100
}