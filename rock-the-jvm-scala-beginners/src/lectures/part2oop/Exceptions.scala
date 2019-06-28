package lectures.part2oop

import java.nio.{BufferOverflowException, BufferUnderflowException}

object Exceptions extends App {

  // EXERCISE 1
//  val array = Array.ofDim(Int.MaxValue)



  // EXERCISE 2

  def factorial(n: BigInt): BigInt = {
    val f: BigInt = n
    if(n > 1 && n <= 1000) f * factorial(n-1)

    else if(n > 1000) throw new StackOverflowError
    else f
  }



  // EXERCISE 3
  case object PocketCalculator {

    def add(x: Int, y: Int): Int = {
      if((x+y) > Int.MaxValue ) throw new BufferOverflowException
      else (x+y)

    }
    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if(x > 0 && y > 0 && result > 0) throw new BufferUnderflowException
      else x-y
    }
    def multiply(x: Int, y: Int): Int = {
      if((x*y) > Int.MaxValue) throw new BufferOverflowException
      else if ((x*y) < Int.MinValue) throw new BufferUnderflowException
      else x*y
    }
    def divide(x: Int, y: Int): Int = {
      if(y != 0) x/y
      else throw new Exception("division by zero")
    }
  }


  try{
    println(factorial(2000))
  }
  catch {
    case e: StackOverflowError => println("cria vergonha na cara e faz um tail recursive")
  }

    //println(Int.MaxValue+1)
    println(PocketCalculator.add(Int.MaxValue, Int.MaxValue))
    println(PocketCalculator.subtract(5,1))
    println(PocketCalculator.multiply(5,9))
    println(PocketCalculator.divide(25,5))



}
