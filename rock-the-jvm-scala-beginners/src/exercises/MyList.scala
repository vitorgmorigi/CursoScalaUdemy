package exercises

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(i: Int): MyList
  def printElements: String

  override def toString: String = "["+ printElements +"]"
}

object Empty extends MyList {

  def isEmpty = true
  def head: Int = throw new NoSuchElementException("Empty list")
  def tail: MyList = throw new NoSuchElementException("Empty list")
  def add(element: Int): MyList = new Cons(element, this)

  override def printElements: String = ""

}


class Cons(h: Int, t: MyList) extends MyList {

  def head: Int = h
  def tail: MyList = new Cons(h, t)
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element, this)

  def printElements: String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }

}

object ListTest extends App {
  val list = new Cons(1, new Cons(3, new Cons(17, new Cons(9, Empty))))
  println(list.head)



  println(list.toString)

}
