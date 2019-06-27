package exercises

abstract class MyList[+A] {

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElements: String

  override def toString: String = "["+ printElements +"]"
}

object Empty extends MyList[Nothing] {

  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Empty list")
  def tail: Nothing = throw new NoSuchElementException("Empty list")
  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, this)

  override def printElements: String = ""
}


class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {

  def head: A = h
  def tail: MyList[A] = new Cons(h, t)
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyList[B] = new Cons(element, this)

  def printElements: String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }

}


trait MyPredicate[-T] {
  def test(t: T): Boolean
}

trait MyTransformer[-A, B]{
  def transform(a: A): B
}

//  class EvenPredicate extends MyPredicate[Int]{
//  def test(t: Int): Boolean = isInstanceOf[Int]
//}
//
//  class StringToIntTransformer extends MyTransformer[String, Int]{
//    def transform(str: String): Int = {
//      str.toInt
//    }
//  }




object ListTest extends App {
  val listOfIntegers: MyList[Int] = new Cons(1, new Cons(3, new Cons(17, new Cons(9, Empty))))
  val listOfStrings: MyList[String] = new Cons("a", new Cons("b", new Cons[String]("c", Empty)))
  println(listOfIntegers.head)
  println(listOfStrings.head)
  println(listOfIntegers.toString)
  println(listOfStrings.toString)

//  val testInteger = new EvenPredicate
//  testInteger.test("as")



}
