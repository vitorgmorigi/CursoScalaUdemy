package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, accumulator: Int = 1): Int = {
    if(n <= 1) accumulator
    else trFact(n-1, n*accumulator)
  }

  println(trFact(5))

  def savePicture(format: String = "jpg", width: Int, height: Int) = {

    println("saving picture...")
  }

  savePicture(width = 800, height = 600)


}
