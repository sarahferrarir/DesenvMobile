# Introdução ao Kotlin 
```kotlin
fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    var nome = "João"
    var sobrenome = "Silva"
    var idade = 21
    var cr = 7.8
    var idadeMinima:Int // exemplo de declaração de variável tipada
    // Em Java, seria int idadeMinima;
    idade = idade + 1 // exemplo de reatribuição
    
    System.out.println(nome + " " + sobrenome); // concatenação em Java
    println(nome + " " + sobrenome) // concatenação em Kotlin
    println("$nome $sobrenome") // interpolação em Kotlin
    
    // comentário de linha única
    
    /* comentário de múltiplas linhas
     * Tipos de dados em Kotlin
     * Byte
     * Short
     * Int
     * Long
     * Float
     * Double
     * Char
     * String
    */
    
    println("Byte: valor mínimo ${Byte.MIN_VALUE} | valor máximo: ${Byte.MAX_VALUE}")
    println("Short: valor mínimo ${Short.MIN_VALUE} | valor máximo: ${Short.MAX_VALUE}")
    println("Int: valor mínimo ${Int.MIN_VALUE} | valor máximo: ${Int.MAX_VALUE}")    
    println("Long: valor mínimo ${Long.MIN_VALUE} | valor máximo: ${Long.MAX_VALUE}")    
    println("Float: valor mínimo ${Float.MIN_VALUE} | valor máximo: ${Float.MAX_VALUE}")    
    println("Double: valor mínimo ${Double.MIN_VALUE} | valor máximo: ${Double.MAX_VALUE}")
    
    println(idade.javaClass) // descobrindo o tipo da variável
    println(idade::class) // descobrindo o tipo da variável
    println(cr.javaClass)
    
    println(nome.length) // tamanho de uma variável String
    println("$nome $sobrenome".length)
}
```
## 1. Função Principal (main)

Todo programa executável em Kotlin começa pela função `main`.

```Kotlin
fun main() {
}
```

Essa função é o ponto de entrada do programa, ou seja, é o primeiro código executado quando o programa roda.

Em Java, o equivalente seria:

```Java
public static void main(String[] args)
```
---

## 2. Declaração de Variáveis

Em Kotlin existem duas principais formas de declarar variáveis: `val` e `var`.

### `val` — Variável Imutável

```Kotlin
val kotlin = "🙂"
```

`val` indica que a referência da variável não pode ser alterada depois de definida. Ou seja, isso causaria erro:

```Kotlin
kotlin = "novo valor"
```

Esse comportamento é semelhante ao `final` em Java.

### `var` — Variável Mutável

```Kotlin
var nome = "João"
var sobrenome = "Silva"
var idade = 21
var cr = 7.8
```

`var` permite reatribuir valores à variável.

Exemplo:

```Kotlin
idade = idade + 1
```
Aqui estamos incrementando a idade em 1.

---

## 3. Inferência de Tipos

Uma característica importante do Kotlin é a inferência de tipos. Quando escrevemos:

Kotlin

`var idade = 21`

O compilador automaticamente entende que o tipo é `Int`. Portanto, não é necessário declarar o tipo explicitamente na maioria dos casos.

---

## 4. Declaração Explícita de Tipo

Também é possível declarar o tipo manualmente.

Kotlin

`var idadeMinima: Int`

A sintaxe é: `nomeDaVariavel : Tipo`

Equivalente em Java:

Java

`int idadeMinima;`

---

## 5. Impressão no Console

Kotlin possui a função `println()`. Ela imprime um valor no console e automaticamente adiciona uma quebra de linha.

Exemplo:

Kotlin

`println(kotlin)`

Também é possível usar o método do Java:

Java

`System.out.println(nome + " " + sobrenome)`

Mas em Kotlin normalmente utilizamos `println`.

---

## 6. Concatenação de Strings

Concatenação significa juntar strings.

Forma tradicional:

Kotlin

`println(nome + " " + sobrenome)`

Essa mesma forma também é utilizada em Java.

---

## 7. Interpolação de Strings

Kotlin possui um recurso mais moderno chamado interpolação de strings.

Kotlin

`println("$nome $sobrenome")`

O símbolo `$` permite inserir diretamente o valor da variável dentro da string. Quando queremos usar expressões, usamos `${}`:

Kotlin

`println("${nome.length}")`

---

## 8. Comentários

Kotlin possui dois tipos principais de comentários.

- **Comentário de linha única:**Kotlin
    
    `// este é um comentário`
    
- **Comentário de múltiplas linhas:**Kotlin
    
    `/*
    comentário
    em várias
    linhas
    */`
    
    Esse tipo é útil para explicações maiores.
    

---

## 9. Tipos de Dados em Kotlin

Kotlin possui vários tipos numéricos e básicos.

| **Tipo** | **Descrição** |
| --- | --- |
| **Byte** | número inteiro de 8 bits |
| **Short** | número inteiro de 16 bits |
| **Int** | número inteiro de 32 bits |
| **Long** | número inteiro de 64 bits |
| **Float** | número decimal de precisão simples |
| **Double** | número decimal de precisão dupla |
| **Char** | caractere único |
| **String** | sequência de caracteres |

---

## 10. Valores Mínimos e Máximos dos Tipos

Cada tipo numérico possui constantes que representam seus limites.

Exemplo:

Kotlin

`Byte.MIN_VALUE
Byte.MAX_VALUE`

No código usamos:

Kotlin

`println("Byte: valor mínimo ${Byte.MIN_VALUE} | valor máximo: ${Byte.MAX_VALUE}")`

---

## 11. Descobrindo o Tipo de uma Variável

Podemos descobrir o tipo de uma variável durante a execução.

- **Usando interoperabilidade com Java:**Kotlin
    
    `println(idade.javaClass)`
    
- **Usando reflexão do Kotlin:**Kotlin
    
    `println(idade::class)`
    

---

## 12. Trabalhando com Strings

Strings possuem várias propriedades úteis. Uma delas é `length`, que retorna o tamanho da string.

Kotlin

`println(nome.length)`

Também podemos aplicar diretamente em expressões:

Kotlin

`println("$nome $sobrenome".length)`

---

## Conclusão

Essa introdução cobre alguns dos conceitos fundamentais da linguagem Kotlin:

- Função `main`
- Variáveis (`val` e `var`)
- Inferência de tipos
- Declaração explícita de tipos
- Impressão no console
- Concatenação e interpolação de strings
- Comentários
- Tipos de dados básicos
- Limites numéricos dos tipos
- Descoberta de tipos em tempo de execução
- Manipulação básica de strings

Esses conceitos formam a base para desenvolver programas mais complexos em Kotlin, especialmente em aplicações Android, backend e sistemas que rodam na JVM.
