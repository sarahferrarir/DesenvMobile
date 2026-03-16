```kotlin
fun main() {
    var pessoaA1 = PessoaA() // var permite a reatribuição do objeto
    val pessoaA2 = PessoaA() // val não permite a reatribuição
    pessoaA1 = pessoaA2 // funciona
    // pessoaA2 = pessoaA1 // val cannot be reassigned
    val pessoaB = PessoaB()
    val pessoaC = PessoaC()
    pessoaC.saudacao()
    val pessoaD = PessoaD()
    pessoaD.nome = "Lucas"
    println(pessoaD.nome)
    // pessoaD.dataNascimento = "2020-01-01" // val cannot be reassigned.
    val pessoaE = PessoaE("José", "2000-01-01") // passagem de parâmetro ao construtor
    val pessoaF = PessoaF("José", "2000-01-01")
    val pessoaG = PessoaG("José", "2000-01-01")
    pessoaG.endereco = "Rua B, n.2"
    pessoaG.saudacao()
}

// 7 formas válidas de declarar classes em kotlin:
// Uma classe sem atributos ou funções, declarada sem chaves
class PessoaA

// Uma classe sem atributos ou funções, declarada com chaves
class PessoaB {
}

// Uma classe sem atibutos, porém com uma função
class PessoaC {
    fun saudacao() {
        println("Olá!")
    }
}

// Uma classe com atributos porém sem funções
class PessoaD {
    var nome:String = "José"
    val dataNascimento:String = "2000-01-01"
}

/* Exemplo de método construtor com passagem de parâmetros em Java
public class PessoaE { 
    public PessoaE(String nome, String dataNascimento){
    }
}
*/ 

// Uma classe sem atributos ou funções, sem chaves, com método construtor passando parâmetros
class PessoaE(var nome:String, val dataNascimento:String)

// Uma classe sem atributos ou funções, com chaves, com método construtor passando parâmetros
class PessoaF(var nome:String, val dataNascimento:String){   
}

// Uma classe com atributos, com funções, com chaves e com método construtor
class PessoaG(var nome:String, val dataNascimento:String){
    
    var endereco:String = "Rua A, n. 1"
    
    fun saudacao() {
        println("Olá!")
    }
}
```
Link para o [kotlin](https://pl.kotl.in/8GflFFd8U)
