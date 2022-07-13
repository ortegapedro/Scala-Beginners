package subjects.basic1

/**
  * Created by Pedro on 07-May-18.
  */
object StringOps_3 extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators.

  // S-interpolators
  println("-"*50)
  println("S-interpolators")
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  println("-"*50)
  println("F-interpolators")
  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  println("-"*50)
  println("raw-interpolator")
  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
