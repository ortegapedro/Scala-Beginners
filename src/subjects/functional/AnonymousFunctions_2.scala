package subjects.functional

/**
  * Created by Pedro.
  */
object AnonymousFunctions_2 extends App {

  // anonymous function (LAMBDA)
  //(List of parameters) => function
  val doubler: Int => Int = (x: Int) => x * 2

  println(doubler(2))

  //another way of defining the previous function
  //val doubler2 = (x: Int) => x * 2
  //println(doubler2(2))

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //another way of defining the previous function
  //val adder2 = (a: Int, b: Int) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) // function itself
  println(justDoSomething()) // call

//   curly braces with lambdas
  val stringToInt = {
    (str: String) =>  str.toInt
  }

  // syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b


}
