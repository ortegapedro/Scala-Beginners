package subjects.basic1

/**
  * In Scala when arguments pass through call-by-value function
 *  it compute the passed-in expression’s or arguments value once before calling the function .
 *  But a call-by-Name function in Scala calls the expression and recompute the passed-in expression’s value every time it get accessed inside the function.
  */
object CBNvsCBV_1 extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

//  calledByValue(1257387745764245L)
//  calledByName(System.nanoTime())

  def infinite(): Int = {
    println("HERE....")
    1 + infinite()
  }

  //y is not called
  def printFirst(x: Int, y: => Int) = println(x)


  printFirst(34, infinite())

//  printFirst(infinite(), 34)

}
