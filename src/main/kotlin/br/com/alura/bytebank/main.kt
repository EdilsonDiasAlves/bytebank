import br.com.alura.bytebank.modelo.Funcionario
import br.com.alura.bytebank.teste.testaComportamentosConta

fun main() {
    println("início main")
    testaComportamentosConta()
//    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException foi capturada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)

        val falsoFuncionario = Any()
        throw NumberFormatException()
    }
    println("fim funcao2")
}