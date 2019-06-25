package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  var aVariable = 2
  aVariable += 3

  println(aVariable)


  val aCodeBlock = {

    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  println(aCodeBlock)



  val someValue = {
    2 < 3
  }

  println(someValue)

  val otherValue = {
    if (someValue) 239 else 986
    42
  }

  println(otherValue)

  // 1. diferença entre "hello world" e println("hello world"): a primeira é uma string e a segunda é uma expressão q imprime na tela e possui efeitos colaterais
  // 2. otherValue: retornará 42, o if de cima acaba sendo inútil pois a instrução seguinte modifica o valor de retorno
}
