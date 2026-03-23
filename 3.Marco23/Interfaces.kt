fun main() {
}

interface Veiculo {
    // Como é uma interface, é implícito que terá especialização então já é aberta por padrão
    // ou seja, não precisa do open, mas ainda precisa usar override
    fun acelerar()
    fun freiar()
}

// Quando especializar uma interface não se usa parênteses, por exemplo, se Veiculo 
// fosse uma classe ficaria "class Carro : Veiculo()" ao invés de "class Carro : Veiculo"
class Carro : Veiculo{
    override fun acelerar() {
        println("Acelerando o veículo;")
    }
    override fun freiar()  {
        println("Freando o veículo;")
    }
}
