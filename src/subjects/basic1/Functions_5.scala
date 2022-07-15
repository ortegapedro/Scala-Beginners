package subjects.basic1

/**
 * Created by Pedro
 * A Scala method is a part of a class which has a name, a signature, optionally some annotations,
 * and some bytecode where as a function in Scala is a complete object which can be assigned to a variable.
 * In other words, a function, which is defined as a member of some object, is called a method.
 */
object Functions_5 extends App {


  def getText: String = return "Hello !!!"


  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))
  println("-" * 50)


  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)
  println("-" * 50)


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello-", 3))
  println("-" * 50)
  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  val resp = aBigFunction(5)
  println(resp)


  def printList(list: Int*): Unit ={
    list.foreach(print)
  }

  printList(1,2,3,4,5,6,7)
/*
  A closure is a function, whose return value depends on the value of one or more variables
  declared outside this function.
 */

  var factor = 3
  val multiplier = (i:Int) => i * factor
  println(multiplier)

  /*
    1.  Una funcion de saludo (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Funcion para calcular un factorial 1 * 2 * 3 * .. * n
    3.  Una funcion fibbonacci
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Funcion para probar si un numero es primo.
   */


//  def greetingForKids(name: String, age: Int): String =
//    "Hi, my name is " + name + " and I am " + age + " years old."
//
//  println(greetingForKids("David", 12))
  //
  //  println("-"*50)
  //  def factorial(n: Int): Int =
  //    if (n <= 0) 1
  //    else n * factorial(n-1)
  //
  //  println(factorial(5))
  //
  //  println("-"*50)
  //  def fibonacci(n: Int): Int =
  //    if (n <= 2) 1
  //    else fibonacci(n-1) + fibonacci(n-2)
  //
  //  // 1 1 2 3 5 8 13 21
  //  println(fibonacci(8))
  //  println("-"*50)
  //  def isPrime(n: Int): Boolean = {
  //    def isPrimeUntil(t: Int): Boolean =
  //      if (t <= 1) true
  //      else n % t != 0 && isPrimeUntil(t-1)
  //
  //    isPrimeUntil(n / 2)
  //  }
  //  println(isPrime(37))
  //  println(isPrime(2003))
  //  println(isPrime(37 * 17))
}
