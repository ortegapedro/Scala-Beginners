package subjects.functional

import java.util.Random

/**
  * Created by Pedro.
  */
object Options_4 extends App {

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  // WORK with unsafe APIs
  def unsafeMethod(): String = null
  //  val result = Some(null) // WRONG
  val result = Option(unsafeMethod()) // Some or None
  println(result)

  // chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()


  // functions on Options

  println(myFirstOption.isEmpty)
  println(myFirstOption.get)  // USAFE - DO NOT USE THIS

//  println(noOption.isEmpty)
//  println(noOption.get)

  // map, flatMap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))


  println("-"*50)
  val op: Option[String] = None
  val op1: Option[String] = Some("Hola")
  val op2: Option[Int] = Some(3)
  val op3: Option[Boolean] = Some(true)

  op.map(println).orElse(Some("nada")).map(println)
  op1.map(println).orElse(Some("nada"))
  println(op.getOrElse(op2))

}
