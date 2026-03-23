## Herança entre Classes

```Kotlin
fun main() {
    val lion = Lion("Simba", "África")
    lion.sayHello()
    
    val asiaticLion = AsiaticLion("Mufasa")
    asiaticLion.sayHello()
    
    val asiaticLion2 = AsiaticLion("Scar")
    asiaticLion2.sayHello()
}

// Toda classe em kotlin é fechada para especialização por padrão 
// para poder especializá-la é necessário usar open
open class Lion(val name:String, val origin:String) {
    fun sayHello() {
        println("$name, o leão de $origin diz: roaaaaaarrrrr")
    }
}

class Tiger()

// forma de especializar uma classe (usando :)
class AsiaticLion(asiaticName:String):Lion(name = asiaticName, origin = "Ásia")
```
Link para o [Kotlin](https://pl.kotl.in/ADlFxaPKw)
