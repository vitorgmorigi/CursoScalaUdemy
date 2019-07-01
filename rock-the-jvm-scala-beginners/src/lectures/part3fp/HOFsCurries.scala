package lectures.part3fp

object HOFsCurries extends App {


  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if(n <= 0) x
    else nTimes(f, n-1, f(x))
  }


  val plusOne = nTimes((x => x + 1), 6, 1)
  println(plusOne)

}
