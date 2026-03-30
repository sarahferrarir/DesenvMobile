# Cenários de Herança em Kotlin
---

## A) Herança simples

B e C herdam A

Kotlin: OK

```kotlin
open class A

class B:A()

class C:A()
```

---

## B) Herança múltipla de classes

C herda A e B

Kotlin: NÃO permite

```kotlin
open class A

open class B

class C:A(),B()
// Kotlin não permite herança múltipla de classes
```

---

## C) Herança em cadeia (árvore)

C → B → A

Kotlin: OK

```kotlin
open class A

open class B:A()

class C:B()
```

---

## D) Interface herdando classe

IA herda A

Kotlin: NÃO permite

```kotlin
open class A

interface IA:A
// Interface não pode herdar classe
```

---

## E) Classe herdando interface

A herda IA

Kotlin: NÃO permite

```kotlin
interface IA

class A:IA // This type does not have a constructor
```

---

## F) Classe implementando interface 

A implementa IA

Kotlin: OK

```kotlin
interface IA

class A:IA
```

---

## G) Interface implementando classe 
IA implementa A

Inválido

```kotlin
open class A

// interface IA:A ❌
```

---

## H) Classe herda classe e implementação de interface

B herda A e implementa IA

Kotlin: OK

```kotlin 
open class A

interface IA

class B:A(),IA
```

---

## I) Classe implementa duas interfaces

A herda IA e implementa IB

Kotlin: OK

```kotlin
interface IA

interface IB

class A:IA,IB
```

---

## J) Interface implementando interface

IB implementa IA

Kotlin: Não da erro pois é lido como extends, mas não é implementável em kotlin pois interface não pode implementar outra interface

```kotlin
interface IA

interface IB:IA
```

---

## K) Interface herdando interface

IB herda IA

Kotlin: OK

```kotlin
interface IA

interface IB:IA
```

---

## L) Interface herdando duas interfaces

IC herda IA e IB

Kotlin: OK

```kotlin
interface IA

interface IB

interface IC:IA,IB
```

---

## M) Herança circular

A herda A

Kotlin: NÃO permite

```kotlin
// open class A:A() ❌
```

---

## N) Inner class

B está dentro de A

**Classificação:** Classe dentro de classe

Kotlin: OK

```kotlin
class A {

class B
}
```

ou

```kotlin
class A {

inner class B
}
```
---

# Observação importante para prova

### Kotlin exige `open`

Sem isso, não herda:

```kotlin
class A
class B:A() ❌
```

Erro:

```
This type is final, so it cannot be inherited from
```

---

# RESUMO

```
Cenários de herança em kotlin
> observação: java e kotlin funcionaram do mesmo jeito. 

A - Herança simples
B - Herança múltipla de classes (não permitido)
C - Herança em cadeia
D - Interface herdando classe (não permitido)
E - Classe implementa interface (não permitido)
F - Classe implementa interface
G - Interface herdando classe (não permitido)
H - Classe herda classe e interface
I - Classe implementa duas interfaces
J - Interface herda interface (não permitido)
K - Interface herda interface
L - Interface herda duas interfaces
M - Herança circular (não permitido)
N - Inner class
```
