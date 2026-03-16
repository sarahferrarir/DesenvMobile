## Mutabilidade de Variável e Lista

### Variável: `val` vs `var`
`val`:
- significa variável imutável;
- a referência não pode ser alterada;
- depois de inicializada, não pode apontar para outro objeto.

`var`:
- significa variável mutável;
- pode apontar para outro objeto depois

--- 
### Estrutura: `list` vs `mutableList`
`List<T>`:  
Lista somente leitura (read-only).

Isso significa que não possui funções de modificação, como:
- `add()`
- `remove()`
- `clear()`

`MutableList<T>`:  
Lista mutável, que permite modificar os elementos.

---
### Kotlin
- testar a mutabilidade da lista;
- testar a mutabilidade da variável.

```kotlin
fun main() {
    val listaImutavelA:List<String> = listOf("a", "b", "c")
    // listaImutavelA.add("d") // Unresolved reference 'add'.
    // listaImutavelA = listOf("x", "y", "z") // val cannot be reassigned
    
    var listaImutavelB:List<String> = listOf("a", "b", "c")
    // listaImutavelB.add("d") // Unresolved reference 'add'.
    listaImutavelB = listOf("x", "y", "z") // funciona
    
    val listaMutavelA:MutableList<String> = mutableListOf("a", "b", "c")
    listaMutavelA.add("d") // funciona
    // listaMutavelA = mutableListOf("x", "y", "z") // val cannot be reassigned.
    
    var listaMutavelB:MutableList<String> = mutableListOf("a", "b", "c")
    listaMutavelB.add("d") // funciona
    listaMutavelB = mutableListOf("x", "y", "z") // funciona
}
```
### Observações
`listaImutavelA`:   
Não passa em nenhum dos testes.
- `list`: é read-only, não possui o método .add();  
- `val`: Tentar mudar os elementos também não irá funcionar pois val não permite reapontar a referência. 

`listaImutavelB`:   
Não passa no primeiro teste, mas passa no segundo.
- `list`: igual o de cima, mesmo sendo var a estrutura da lista continua imutável;
- `var`: var permite a retriuição da referência, então funciona apesar de ser uma lista imutável.

`listaMutavelA`:   
Passa no primeiro, mas não no segundo.
- `mutableList`: possui o método .add();
- `val`: não pode ser mudado (^mesmo tendo adicionado um elemento, a referência continua sendo a mesma). 

`listaMutavelB`:   
Passa nos dois testes.
- `mutableListB`:  a lista passa a ser ("a", "b", "c", "d");
- `var`: agora a lista é ("x", "y", "z"). 

---
Link para o kotlin: https://pl.kotl.in/UxqJ0gk-B
