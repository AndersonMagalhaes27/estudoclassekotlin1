package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.Funcionario

class ImprimirRelatorioCliente {
    companion object{
        fun imprimirRelatorio(cliente: Cliente) =
            println(
                cliente.toString()
            )
    }
}