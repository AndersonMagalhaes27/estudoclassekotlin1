package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){

    val joao = Analista(nome = "Joao Pedro", cpf = "123.321.123-32", salario = 2000.0)

   imprimirRelatorio(joao)


}
fun imprimirRelatorio(funcionario: Funcionario) = println(funcionario.toString())