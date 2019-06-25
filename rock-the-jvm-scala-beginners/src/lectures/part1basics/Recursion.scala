package lectures.part1basics

object Recursion extends App {

  def factorial(n: Int) : BigInt = {
    val f: Int = n
    if(n <= 1) f
    else f * factorial(n-1)
  }
  //println("Factorial: " + factorial(5))


  def anotherFactorial(n: BigInt) : BigInt = {
    def factHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }
    factHelper(n, 1)
  }

  println("Factorial tail recursive: " + anotherFactorial(5))


  // EXERCISE 1

  def concatenate(str: String, n: Int): String = {

    def concatenateAccumulator (str: String, accumulator: String, t: Int): String = {
      if(t > 0) concatenateAccumulator(str, accumulator + str, t-1)
      else accumulator
    }

    concatenateAccumulator(str, "", 3)
  }

  println(concatenate("Hue", 3))

  // EXERCISE 2

  def isPrime(n: Int) : Boolean = {

    def iterator (n: Int) : Int = {
      if(n > 2) iterator(n-1)
      else n
    }

    if (n == 2 || n % iterator(n) != 0) true // verifica se o resto da divisao de todos os numeros antecessores a n é diferente de 0
    else false
  }

  // EXERCISE 3

  def fibonacci(n: Int) : Int = {

    var i = 0
    var j = 1
    var accumulator = i+j

    def fibonacciAccumulator(n2: Int, i2: Int, j2: Int): Int = {

      val cont = n2
      if(cont == n) accumulator

      else{
        accumulator = i+j
        i=j
        j=accumulator
        fibonacciAccumulator(cont+1, i, j)
      }
    }

    fibonacciAccumulator(0, 0, 1)

  }

  println(fibonacci(10))

}
