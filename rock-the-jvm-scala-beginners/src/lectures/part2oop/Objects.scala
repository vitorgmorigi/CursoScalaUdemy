package lectures.part2oop

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person (val name: String) {

  }

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)

  val bobbie = Person (mary, john)

}
