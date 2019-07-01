package lectures.part3fp

object MapFlatmapFilterFor extends App {

  val list = List(1,2,3)
  println(list)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))



  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')
  val colors = List("black", "white")


  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  val forCombinations = for{
    n <- numbers
    ch <- chars
    col <- colors
  } yield "" + n + ch + "-" + col

  println(forCombinations)

}
