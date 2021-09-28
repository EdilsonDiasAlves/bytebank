import br.com.alura.bytebank.modelo.Funcionario
import java.lang.NumberFormatException

fun main() {
    println("início main")

    val entrada = "1.0"

    val valorConvertido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorConvertido != null) {
        valorConvertido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }

    funcao1()
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
        falsoFuncionario as Funcionario
    }
    println("fim funcao2")
}