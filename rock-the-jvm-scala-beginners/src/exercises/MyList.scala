package exercises

abstract class MyList[+A] {

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElements: String

  override def toString: String = "["+ printElements +"]"
  def map[B](transformer: MyTransformer[A, B]): MyList[B]
  //def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
  def filter(predicate: MyPredicate[A]): MyList[A]
}

case object Empty extends MyList[Nothing] {

  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Empty list")
  def tail: Nothing = throw new NoSuchElementException("Empty list")
  def add[B >: Nothing](element: B): MyList[B] = Cons(element, this)

  override def printElements: String = ""

  def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = Empty
  def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty
  def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty
}


case class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {

  def head: A = h
  def tail: MyList[A] = Cons(h, t)
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyList[B] = Cons(element, this)

  def printElements: String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }

  def filter(predicate: MyPredicate[A]): MyList[A] =
    if (predicate.test(h)) Cons(h, t.filter(predicate))
    else t.filter(predicate)

  def map[B](transformer: MyTransformer[A, B]): MyList[B] =
    Cons(transformer.transform(h), t.map(transformer))

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




case object ListTest extends App {
  val listOfIntegers: MyList[Int] = Cons(2, Cons(3, Cons(17, Cons(9, Empty))))
  val listOfStrings: MyList[String] = Cons("a", Cons("b", Cons[String]("c", Empty)))
  println(listOfIntegers.head)
  println(listOfStrings.head)
  println(listOfIntegers.toString)
  println(listOfStrings.toString)


  println(listOfIntegers.filter(new MyPredicate[Int] {
    override def test(t: Int): Boolean = t == 2
  }))

//  val testInteger = new EvenPredicate
//  testInteger.test("as")



}
