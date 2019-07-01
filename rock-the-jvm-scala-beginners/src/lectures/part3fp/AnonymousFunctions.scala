package lectures.part3fp

object AnonymousFunctions extends App {

  val doubler = (x: Int) => x * 2

  val adder = (a: Int, b: Int) => a + b



  println(doubler(2))
  println(adder(5,3))


  val stringToInt = {
    (str: String) => str.toInt
  }


  println(stringToInt("67") + 3)

  val niceIncrementer: Int => Int = (x: Int) => x + 1
  // or val niceIncrementer: Int => Int = _ + 1

  val niceAdder: (Int, Int) => Int = _ + _ // or val niceAdder: (Int, Int) => Int = (a, b) => a + b

  println(niceIncrementer(5))
  println(niceAdder(5,8))

  val superAdd = (x: Int) => (y: Int) => x + y

  println(superAdd(5)(6))

}
