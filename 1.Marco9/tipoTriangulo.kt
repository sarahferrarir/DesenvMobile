// Exercício: Implemente um programa em Kotlin com uma função chamada "tipoTriangulo" que recebe 
// como parâmetros o tamanho de cada lado do triângulo e imprime o tipo correspondente.
fun main() {
	println(tipoTriangulo(2, 2, 2)) //equilátero
	println(tipoTriangulo(2, 2, 3)) //isósceles
	println(tipoTriangulo(2, 3, 4)) //escaleno
	println(tipoTriangulo(1, 1, 3)) //não é triângulo    
}

fun tipoTriangulo(lado1:Int, lado2:Int, lado3:Int):String {

    if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
        if((lado1 == lado2) && (lado2 == lado3)) {
            return "Equilátero"
        }
        if ((lado1 != lado2) && (lado2 != lado3)) {
            return "Escaleno"
        }
        else {
            return "Isósceles"
        }
    } else {
        return "Não é triângulo"
    }
}
