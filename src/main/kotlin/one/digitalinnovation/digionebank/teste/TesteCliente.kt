package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente

fun main (){

    val Samuel = Cliente ("Samuel ", "123.321.421-32", "pf","12345")

    ImprimirRelatorioCliente.imprimirRelatorio(Samuel)

     TesteAutenticacao().autentica(Samuel)
}