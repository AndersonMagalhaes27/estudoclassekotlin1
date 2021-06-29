package one.digitalinnovation.digionebank.teste
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main (){
    val anderson = Pessoa(nome = "Anderson Souza", cpf = "123.321.321-54")

    println(anderson.nome)
    println(anderson.cpf)

    val joao = Funcionario ("Joao Rodriguez", "123.321.214.56", BigDecimal.valueOf(2000.0))

        println(joao.nome)
         println(joao.cpf)
        println(joao.salario)
}