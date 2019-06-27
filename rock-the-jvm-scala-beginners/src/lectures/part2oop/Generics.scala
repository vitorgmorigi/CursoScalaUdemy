package lectures.part2oop

object Generics extends App {

   class MyList[+A] {

    def add[B >: A](element: B): MyList[B] = ???

  }

  class MyMap[Key, Value]

//  val listOfString = new MyList[String]
//  val listOfIntegers = new MyList[Int]

  // generic methods
  object MyList {
    def empty[A] = null

  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problems
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A) // cage requires a subtype of Animal (Cat or Dog, in this case)
  val cage: Cage[Dog] = new Cage(new Dog)


  println("test")



}
