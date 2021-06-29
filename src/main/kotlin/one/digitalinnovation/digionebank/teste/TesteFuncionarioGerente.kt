package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val maria = Gerente( "Maria",  "123.321.123-32",  5000.0, "senha123")


    ImprimeRelatorioFuncionario.imprimirRelatorio(maria)

    TesteAutenticacao().autentica(maria)
}
