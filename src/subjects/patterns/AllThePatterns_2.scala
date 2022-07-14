package subjects.patterns

/**
  * Created by Pedro.
  */
object AllThePatterns_2 extends App {

  // 1 - constants
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "THE Scala"
    case true => "The Truth"
    case AllThePatterns_2 => "A singleton object"
  }

//  // 2 - match anything
//  // 2.1 wildcard
//  val matchAnything = x match {
//    case _ =>
//  }
//
//  // 2.2 variable
//  val matchAVariable = x match {
//    case something => s"I've found $something"
//  }
//
//  // 3 - tuples
//  val aTuple = (1,2)
//  val matchATuple = aTuple match {
//    case (1, 1) =>
//    case (something, 2) => s"I've found $something"
//  }
//
//  val nestedTuple = (1, (2, 3))
//  val matchANestedTuple = nestedTuple match {
//    case (_, (2, v)) => println(v)
//  }

//  // 4 - list patterns
//  val aStandardList = List(1,2,3,42)
//  val standardListMatching = aStandardList match {
//    case List(1, _, _, _) => // extractor - advanced
//    case List(1, _*) => // list of arbitrary length - advanced
//    case 1 :: List(_) => // infix pattern
//    case List(1,2,3) :+ 42 => // infix pattern
//  }
//
//  // 5 - type specifiers
//
//  val numbers = List(1,2,3)
//  val numbersMatch = numbers match {
//    case listOfStrings: List[String] => "a list of strings"
//    case listOfNumbers: List[Int] => "a list of numbers"
//    case _ => ""
//  }
//
//  println(numbersMatch)

}
