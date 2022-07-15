package subjects.poo2

import scala.language.postfixOps

/**
  * Created by Pedro.
  */
object MethodNotations_7 extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"

    def learnsScala = this learns "Scala"
  }


  val mary = new Person("Mary", "Inception")
  println("-"*50)
  println("infix notation = operator notation ")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent


//
//  // "operators" in Scala
//  println("-"*50)
//  println("operators in Scala ")
//  val tom = new Person("Tom", "Fight Club")
//  println(mary + tom)
//  println(mary.+(tom))
//
//
//  println("-"*50)
//  /*
//  println("ALL OPERATORS ARE METHODS")
//  println(1 + 2)
//  println(1.+(2))
//  println("-"*50)
//   */
//
//
//  // prefix notation
//  /*
//    val x = -1  // equivalent with 1.unary_-
//    val y = 1.unary_-
//    */
//  // unary_ prefix only works with - + ~ !
//
//  println(!mary)
//  println(mary.unary_!)
//
//  val p = +mary
//  println( p.name + "  " +p.age)
//
//  println(s"name: ${(+mary).name} age: ${(+mary).age}")
//  println("-"*50)
////
////  // postfix notation
//  println("postfix notation")
//  println(mary.isAlive)
//  println(mary isAlive)
////
//
//
//  // apply
//  println("apply")
//  println(mary.apply())
//  println(mary()) // equivalent
//
//
//  //Others
//  println("-"*50)
//  println((mary + "the Rockstar").apply())
//  println((+mary).age)
//  println(mary learnsScala)
//  println(mary(10))
//
//  def triple(x:Int): Int = x*3
//  val tr = triple _
//  println(tr(-3))
//
//  println(10 max 1)
//  println(10 max 20)
//  println(10 min 20)
}
