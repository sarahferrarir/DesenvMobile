## Declaração de Funções em Kotlin

Em Kotlin, a declaração de funções é flexível e permite reduzir a verbosidade à medida que você se familiariza com a linguagem. Abaixo estão as três formas principais apresentadas:

---

### 1. Estrutura Tradicional (Bloco com Retorno Explícito)

Esta versão é a mais familiar para quem vem de linguagens como Java ou C#.

```Kotlin
fun saudacao1(dia: Boolean): String {
    if (dia) {
        return "Bom dia!"
    } else {
        return "Boa noite!"
    }
}
```

- **Corpo de Bloco:** A função usa chaves `{}` para definir seu corpo.
- **Tipo de Retorno:** O tipo (`String`) deve ser declarado explicitamente após os parênteses.
- **Múltiplos Returns:** Como em Java, você usa a palavra-chave `return` em cada ramificação do fluxo.

---

### 2. IF como Expressão (Único Retorno)

Diferente do Java, o `if` em Kotlin é uma **expressão**, o que significa que ele retorna um valor.

```Kotlin
fun saudacao2(dia: Boolean): String {
    return if (dia) {
        "Bom dia!"
    } else {
        "Boa noite!"
    }
}
```

- **Atribuição Direta:** Em vez de colocar o `return` dentro de cada bloco, você retorna o resultado da estrutura `if` inteira.
- **Código Limpo:** Reduz a repetição da palavra `return`, tornando a lógica mais centralizada.

---

### 3. Single-Expression Function (Função de Expressão Única)

Esta é a forma mais concisa do Kotlin para funções simples.

```Kotlin
fun saudacao3(dia: Boolean) = if (dia) {
    "Bom dia!"
} else {
    "Boa noite!"
}
```

- **Símbolo de Atribuição (`=`):** Substitui as chaves `{}` e a palavra-chave `return`.
- **Inferência de Tipo:** O Kotlin consegue identificar que o retorno é uma `String` analisando o resultado do `if`, permitindo omitir `: String` na assinatura da função.
- **Ideal para:** Funções matemáticas, mapeamentos simples ou lógicas diretas.

---

### Comparativo de Chamada (Main)

```Kotlin
fun main() {
    println(saudacao1(true))  // Saída: Bom dia!
    println(saudacao2(true))  // Saída: Bom dia!
    println(saudacao3(false)) // Saída: Boa noite!
}
```

---

### Resumo das Diferenças

| **Recurso** | **Função Tradicional** | **Expressão Única** |
| --- | --- | --- |
| **Uso de Chaves** | Obrigatório `{ }` | Não utiliza |
| **Palavra `return`** | Obrigatória | Proibida (o `=` já implica retorno) |
| **Tipo de Retorno** | Geralmente explícito | Geralmente inferido |
| **Complexidade** | Melhor para lógicas longas | Melhor para lógicas curtas |
