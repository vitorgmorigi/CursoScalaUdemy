package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet()
  person.greet("Vítor")
  val person2 = new Person("Joãozinho")
  val person3 = new Person()

  println(person2.name + " " + person2.age)
  println(person3.name + " " + person3.age)



  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println("Age's Author: " + novel.autorAge())
  println("is Written by Charles Dickens? " + novel.isWrittenBy(author))

  val counter = new Counter
  println(counter.inc.count)
  println(counter.inc(5).count)
  println(counter.dec.count)
  println(counter.dec(2).count)



}

// constructor
class Person(val name : String, val age: Int) {
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, $name")


  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Vítor", 21)

}

class Writer (name: String, surname: String, val year: Int) {

  def fullname(): String = this.name + " " + this.surname
}

class Novel(name: String, year: Int, author: Writer) {
  def autorAge(): Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


class Counter(val count: Int = 0) {

    // IMUTABILIDADE!! (ou seja, não existe setter, quando se quer alterar algo cria-se outro objeto)

    def inc = {
      println("incrementing...")
      new Counter(count + 1)
    }
    def dec = {
      println("decrementing...")
      new Counter(count - 1)
    }

    def inc(amount: Int): Counter = {
      if(amount <= 0) this
      else inc.inc(amount-1)

    }
    def dec(amount: Int): Counter = {
      if(amount <= 0) this
      else dec.dec(amount-1)

    }




}
