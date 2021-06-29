package one.digitalinnovation.digionebank
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    val nome:String,
   val cpf: String,
    val salario:Double
    ) : Pessoa (nome,cpf){
  protected  abstract fun  calculoAuxilio():Double
  override fun toString():String =
      ("Nome:$nome " +
        "cpf:$cpf " +
        "salario:$salario" +
       " Auxilio: ${calculoAuxilio()}"
              ) .trimIndent()

    }


