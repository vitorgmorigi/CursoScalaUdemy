package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int)=
    a + " " + b


  println(aFunction("Value", 9))


  def aParameterLessFunction() : Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString : String, n: Int): String = { // n é o numero de vezes que a função repetirá
    if(n == 1) aString // quando n for 1, retorna aString
    else aString + aRepeatedFunction(aString, n-1) // concatena aString e chama a mesma função novamente
  }

  println(aRepeatedFunction("Hello\n", 3))

  // nao utilizar loops em Scala, e sim funções recursivas


  def aFunctionWithSideEffects(aString : String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }



    // EXERCISE 1

    def aGreetingFunction(name: String, age: Int) : String = {
      "Hi, my name is " + name + " and I am " + age + " years old"
    }

    println(aGreetingFunction("Vítor", 21))


    // EXERCISE 2

    def aFactorialFunction(n: Int) : BigInt = {
      val factorial: Int = n
      if(n <= 1) factorial
      else factorial * aFactorialFunction(n-1)
    }
    println("Factorial: " + aFactorialFunction(5))


  // EXERCISE 3

  def aFibonacciFunction(n: Int) : Int = {

    if(n <= 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }

  println("Fibonacci: " + aFibonacciFunction(5))



  // EXERCISE 4

  def isPrime(n: Int) : Boolean = {

    def iterator (n: Int) : Int = {
      if(n > 2) iterator(n-1)
      else n
    }

    if (n == 2 || n % iterator(n) != 0) true // verifica se o resto da divisao de todos os numeros antecessores a n é diferente de 0
    else false
  }

  println(isPrime(37))
  println(isPrime(7))
  println(isPrime(4))
  println(isPrime(40))

}


