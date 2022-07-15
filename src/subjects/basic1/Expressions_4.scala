package subjects.basic1

/**
  * Created by Pedro
 * In Scala, all statements are expressions that return a value.
  */
object Expressions_4 extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  println("-"*50)
  // + - * / & | ^

  println(1 == x)
  // == != > >= < <=
  println("-"*50)
  println(!(1 == x))
  // ! && ||
  println("-"*50)
  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  println("-"*50)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  println("-"*50)
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  println("END WHILE")

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 33) // Unit === void
  println(aWeirdValue)
  println(aVariable)


  // Code blocks

  println("Code blocks")
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)
  // 1. difference between "hello world" vs println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


  println("---  sum  ----")


}
