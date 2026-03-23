
fun main() {
    val veiculo1 = Veiculo()
    veiculo1.acelerar()
    
    val carro = Carro()
    carro.acelerar()
    
    val moto = Moto()
    moto.acelerar()
}

open class Veiculo {
    open val tipo:String = "Veículo genérico"
    
    open fun acelerar() {
        println("$tipo está acelerando")
    }
}

// Para poder usar o método de sobrescrita é necessário usar open na função principal 
// e usar "override" na função desejada
class Carro : Veiculo() {
    override val tipo:String = "Carro"
    
    override fun acelerar() {
        println("$tipo está acelerando rapidamente")
    }
}

class Moto : Veiculo() {
    override val tipo:String = "Moto"
    
    override fun acelerar() {
        println("$tipo está acelerando e dando grau")
    }
}
