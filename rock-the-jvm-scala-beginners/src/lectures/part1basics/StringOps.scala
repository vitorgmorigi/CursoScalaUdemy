package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(0)) // pega um caracter específico, nesse caso o primeiro
  println(str.substring(7, 11)) // pega um trecho da string
  println(str.split(" ").toList) // nesse caso, separa a String por espaço e inclui numa lista
  println(str.startsWith("Hello")) // verifica se a String começa com o parâmetro especificado (retorna true se sim)
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' + aNumberString + 'z')
  println(str.reverse)
  println(str.take(4))

  // Scala specific: String interpolators

  // S-Intepolators

  val name = "Vítor"
  val age = 21
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting =  s"Hello, my name is $name and I am ${age + 1} years old"


  // F-Interpolators

  val speed = 1.2f
  val fIntepolator = f"$name can eat $speed%2.2f burgers for minute"

  println(greeting)
  println(anotherGreeting)
  println(fIntepolator)

  println("Testando\nTestando")

}
