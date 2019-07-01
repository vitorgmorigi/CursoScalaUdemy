package lectures.part3fp

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("4") + 3)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int]{
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }


  def concatenator: (String, String) => String = new Function2[String, String, String]{
    override def apply(v1: String, v2: String): String = v1+v2
  }

  println(concatenator("Vítor", "Morigi"))


  trait MyFunction[A, B] {
    def apply(element: A): B
  }



}
