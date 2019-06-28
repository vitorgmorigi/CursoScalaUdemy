package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

//  class AnonymousClasses$$anon$1 extends Animal{
//    override def eat: Unit = println("hahahahaha")
//  }

  // anonymous class
  val funnyAnimal = new Animal {
    override def eat: Unit = println("hahahahaha")
  }
  /*
    equivalent with:

    class AnonymousClasses$$anon$1 extends Animal{
    override def eat: Unit = println("hahahahaha")
  }
    val funnyAnimal = new AnonymousClasses$$anon$1
   */

  class Person(name: String){
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println("Hi, blablabla")
  }


  println(funnyAnimal.getClass)
  println(funnyAnimal.eat)
  println(jim.sayHi)
  println(jim.getClass)
  val somebody = new Person("Vitor")
  println(somebody.sayHi)
  println(somebody.getClass)

}
