package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, val favoriteMovie: String, val age: Int = 20) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+(): Person = new Person(this.name, this.favoriteMovie, this.age+1)
    def learns(thing: String): String = s"$name learns $thing"
    def learnsScala = this learns "Scala"
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"${this.name} watched $favoriteMovie $n times"
    def test(): Boolean = true

  }

  val mary = new Person("Mary", "Titanic")
  println(mary.likes("Titanic"))
  println(mary likes "Titanic") // equivalent
  val tom = new Person("Tom", "Lagoa Azul")
  println(mary + tom)

  println(1 + 2)
  println(1.+(2))

  println(mary.apply())
  println(mary()) // equivalent


  println((mary +"The rockstar")())
  println(+mary age)
  println(mary learnsScala)
  println(mary.apply(2))


  // ALL OPERATORS ARE METHODS
}
