package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.teste.Logavel

class Cliente(
    val nome:String,
    val cpf:String,
    val clienteTipo: String,
    val senha:String
        ): Pessoa(nome,cpf),Logavel{
    override fun login(): Boolean = "12345" == senha

    override fun toString():String =
        ("Nome:$nome cpf:$cpf senha:$senha Tipo:${ClienteTipo.PF}") .trimIndent()

}
